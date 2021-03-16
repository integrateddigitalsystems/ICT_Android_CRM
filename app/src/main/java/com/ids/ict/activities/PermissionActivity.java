package com.ids.ict.activities;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;



import com.ids.ict.Actions;
import com.ids.ict.MyApplication;
import com.ids.ict.R;

public class PermissionActivity extends Activity {

    LinearLayout footer;
    RelativeLayout rel, mainbar, progressBarLayout;
    ProgressBar progressBar;
    ImageView backbtn;
    TextView title, tvTitle;

    Button btDisagree, btAgree;
    SharedPreferences mshard;
    SharedPreferences.Editor edit;
    Intent intent;
    String txt = "", lang = "";
    RelativeLayout rlLocationBg,rlLocationFg,rlPhone;
    ToggleButton tbLocationBg,tbPhoneState;
    Typeface tf;
    TextView tvLocation1,tvLocationDesc,tvPhoneAccess,tvPhoneDesc;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lang = Actions.setLocal(PermissionActivity.this);
        setContentView(R.layout.activity_permission);

        Actions.overrideFonts(PermissionActivity.this);

    }

    @Override
    protected void onResume() {
        resume();
        super.onResume();
    }

    private void resume(){
        mshard = PreferenceManager.getDefaultSharedPreferences(PermissionActivity.this);
        edit = mshard.edit();



        Log.wtf("PermissionActivity", MyApplication.Lang);
        findViews();
        if (MyApplication.Lang.equalsIgnoreCase(MyApplication.ENGLISH)) {
            tf = MyApplication.facePolarisMedium;
        } else {
            tf = MyApplication.faceDinar;
        }


        tvTitle.setTypeface(tf);
        tvLocation1.setTypeface(tf);
        tvLocationDesc.setTypeface(tf);
        tvPhoneAccess.setTypeface(tf);
        tvPhoneDesc.setTypeface(tf);


        checkPermissions();
        setPermissionToggles();
        try {
            tvTitle.setText(getString(R.string.permissions));
        } catch (Exception e) {
            e.printStackTrace();
            Log.wtf("Exc", e.getMessage());
        }

        Log.wtf("MyApplication.Lang", "is "+ MyApplication.Lang);
        Log.wtf("lang", "is "+lang);


        try {

            if (MyApplication.Lang.equals(MyApplication.ARABIC)) { //Ar
                btDisagree.setText("غير موافق");
                btAgree.setText("نفذ");

            } else if (MyApplication.Lang.equals(MyApplication.ENGLISH)) { //En

                btDisagree.setText("I Disagree");
                btAgree.setText("Proceed");

            }

        } catch (Exception e) {
            e.printStackTrace();
            Log.wtf("Exc", e.getMessage());
        }


        Log.wtf("dev", mshard.getInt(getResources().getString(R.string.device_id), 0) + " ss");
        btAgree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnIntent = new Intent();
                returnIntent.putExtra("location",tbLocationBg.isChecked());
                returnIntent.putExtra("phone",tbPhoneState.isChecked());
                setResult(Activity.RESULT_OK,returnIntent);
                finish();
            }
        });

        btDisagree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PermissionActivity.this.finish();

            }
        });

    }


    private void checkPermissions() {
       if(ContextCompat.checkSelfPermission(PermissionActivity.this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED)
           tbPhoneState.setChecked(false);
       else {
           tbPhoneState.setChecked(true);
          // tbPhoneState.setEnabled(false);
       }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            if (ContextCompat.checkSelfPermission(PermissionActivity.this, Manifest.permission.ACCESS_BACKGROUND_LOCATION) != PackageManager.PERMISSION_GRANTED)
                tbLocationBg.setChecked(false);
            else {
                tbLocationBg.setChecked(true);
             //   tbLocationBg.setEnabled(false);
            }

        }else {
            if (ContextCompat.checkSelfPermission(PermissionActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                    ||
                    ContextCompat.checkSelfPermission(PermissionActivity.this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED
            )
                tbLocationBg.setChecked(false);
            else {
                tbLocationBg.setChecked(true);
               // tbLocationBg.setEnabled(false);
            }


        }

    }

    private void setPermissionToggles(){
        tbPhoneState.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  if(tbPhoneState.isChecked()) {
                      ActivityCompat.requestPermissions(PermissionActivity.this, new String[]{
                              Manifest.permission.READ_PHONE_STATE}, 10);
                  }else {
                      tbPhoneState.setChecked(true);
                      Toast.makeText(getApplicationContext(), getString(R.string.to_disable_go_settings),Toast.LENGTH_LONG).show();
                  }

            }
        });


        tbLocationBg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tbLocationBg.isChecked()){


                    if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) {
                    ActivityCompat.requestPermissions(PermissionActivity.this,new String[]{
                            Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION}, 11);

                   }else if (Build.VERSION.SDK_INT == Build.VERSION_CODES.Q) {
                        ActivityCompat.requestPermissions(PermissionActivity.this,new String[]{
                                Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION,  Manifest.permission.ACCESS_BACKGROUND_LOCATION}, 12);
                    }else {
                        ActivityCompat.requestPermissions(PermissionActivity.this,new String[]{
                                Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION}, 13);

                     }}else {
                    Toast.makeText(getApplicationContext(),getString(R.string.to_disable_go_settings),Toast.LENGTH_LONG).show();
                    tbLocationBg.setChecked(true);
                    }

            }
        });

    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == 10) {
            if (grantResults.length ==1 && grantResults[0] == PackageManager.PERMISSION_GRANTED) { //GRANTED
                checkPermissions();
            } else {
                boolean shouldAsk=false;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    shouldAsk = shouldShowRequestPermissionRationale(permissions[0]);
                }

                if(!shouldAsk)
                    Toast.makeText(getApplicationContext(), getString(R.string.cannot_detect_signals_go_settings),Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(),  getString(R.string.cannot_detect_signals),Toast.LENGTH_LONG).show();
                checkPermissions();
            }
        }else  if (requestCode == 11) {
            if (grantResults.length ==2 && grantResults[0] == PackageManager.PERMISSION_GRANTED  && grantResults[1] == PackageManager.PERMISSION_GRANTED){
               checkPermissions();
            } else {
                checkPermissions();
                boolean shouldAsk=false;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    shouldAsk = shouldShowRequestPermissionRationale(permissions[0]) && shouldShowRequestPermissionRationale(permissions[1]) ;
                }

                if(!shouldAsk)
                    Toast.makeText(getApplicationContext(), getString(R.string.cannot_detect_loc_go_settings),Toast.LENGTH_LONG).show();
                else
                     Toast.makeText(getApplicationContext(), getString(R.string.cannot_detect_all_time),Toast.LENGTH_LONG).show();
            }
        }else  if (requestCode == 12) {
            if (grantResults.length ==3 && grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED & grantResults[2] == PackageManager.PERMISSION_GRANTED){
                checkPermissions();
            } else {
                checkPermissions();
                boolean shouldAsk=false;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    shouldAsk = shouldShowRequestPermissionRationale(permissions[0]);
                }

                if(!shouldAsk)
                    Toast.makeText(getApplicationContext(),getString(R.string.cannot_detect_loc_go_settings),Toast.LENGTH_LONG).show();
               else
                   Toast.makeText(getApplicationContext(),getString(R.string.cannot_detect_all_time),Toast.LENGTH_LONG).show();
            }
        }else  if (requestCode == 13) {
            if (grantResults.length ==2 && grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED){

                if (ContextCompat.checkSelfPermission(PermissionActivity.this, Manifest.permission.ACCESS_BACKGROUND_LOCATION) != PackageManager.PERMISSION_GRANTED){

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        ActivityCompat.requestPermissions(PermissionActivity.this,new String[]{
                            Manifest.permission.ACCESS_BACKGROUND_LOCATION}, 14);
                    }
                }else
                    checkPermissions();
            } else {
                checkPermissions();
                boolean shouldAsk=false;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    shouldAsk = shouldShowRequestPermissionRationale(permissions[0]);
                }

                if(!shouldAsk)
                    Toast.makeText(getApplicationContext(),getString(R.string.cannot_detect_loc_go_settings),Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(),getString(R.string.cannot_detect_all_time),Toast.LENGTH_LONG).show();
            }
        }else  if (requestCode == 14) {
            if (grantResults.length ==1 && grantResults[0] == PackageManager.PERMISSION_GRANTED ){
                checkPermissions();
            } else {
                checkPermissions();
                boolean shouldAsk=false;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    shouldAsk = shouldShowRequestPermissionRationale(permissions[0]);
                }

                if(!shouldAsk)
                    Toast.makeText(getApplicationContext(),getString(R.string.cannot_detect_loc_go_settings),Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(),getString(R.string.cannot_detect_all_time),Toast.LENGTH_LONG).show();
            }
        }
    }


    private void goQos(){
        //permission enabled
        Toast.makeText(getApplicationContext(),"permission is enabled",Toast.LENGTH_LONG).show();
    }

    private void findViews() {

        footer = (LinearLayout) findViewById(R.id.footer);
        rel = (RelativeLayout) findViewById(R.id.rel);
        progressBarLayout = (RelativeLayout) findViewById(R.id.progressBarLayout);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        mainbar = (RelativeLayout) findViewById(R.id.mainbar);
        backbtn = (ImageView) mainbar.findViewById(R.id.backbtn);
        title = (TextView) mainbar.findViewById(R.id.title);
        tvTitle = (TextView) findViewById(R.id.tvTitle);

        tvLocation1 = (TextView) findViewById(R.id.tvLocation1);
        tvLocationDesc = (TextView) findViewById(R.id.tvLocationDesc);
        tvPhoneAccess = (TextView) findViewById(R.id.tvPhoneAccess);
        tvPhoneDesc = (TextView) findViewById(R.id.tvPhoneDesc);


        btDisagree = (Button) findViewById(R.id.btDisagree);
        btAgree = (Button) findViewById(R.id.btAgree);

        rlLocationBg = (RelativeLayout) findViewById(R.id.rlLocationBg);
        rlLocationFg = (RelativeLayout) findViewById(R.id.rlLocationFg);
        rlPhone = (RelativeLayout) findViewById(R.id.rlPhone);

        tbLocationBg = findViewById(R.id.tbLocationBg);
        tbPhoneState = findViewById(R.id.tbPhoneState);

        backbtn.setVisibility(View.GONE);
        title.setVisibility(View.GONE);

        if(MyApplication.nightMod){
            mainbar.setBackgroundResource(R.drawable.footer_nt);

            btAgree.setBackground(ContextCompat.getDrawable(PermissionActivity.this, R.drawable.button_gray));
            btDisagree.setBackground(ContextCompat.getDrawable(PermissionActivity.this, R.drawable.button_gray));

            //footer.setBackgroundResource(R.drawable.footer_nt);
            rel.setBackgroundColor(getResources().getColor(R.color.nightBlue));

            title.setBackgroundColor(getResources().getColor(R.color.white));

            LinearLayout agreeLL = (LinearLayout) findViewById(R.id.agreeLL);
            agreeLL.setBackgroundColor(getResources().getColor(R.color.nightBlue));
        }

    }






}
