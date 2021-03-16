package com.ids.ict.custom;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import androidx.core.app.ActivityCompat;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;


import com.ids.ict.MyApplication;

import java.util.Locale;


public class AppHelper {
    public static String UserIdretreive;



    public static Typeface getTypeFace(Context context){
        if(MyApplication.Lang.equals(MyApplication.ENGLISH))
           return Typeface.createFromAsset(context.getApplicationContext().getAssets(), "fonts/Galaxie_Polaris_Medium.otf");
        else
            return Typeface.createFromAsset(context.getApplicationContext().getAssets(), "fonts/GE_Dinar_One_Medium.otf");

    }

    public static Typeface getTypeFaceAr(Context context){

        return Typeface.createFromAsset(context.getApplicationContext().getAssets(), "fonts/GE_Dinar_One_Medium.otf");
    }

    public static Typeface getTypeFaceBold(Context context){
        if(MyApplication.Lang.equals(MyApplication.ENGLISH))
            return Typeface.createFromAsset(context.getApplicationContext().getAssets(), "fonts/Galaxie_Polaris_Medium.otf");
        else
            return Typeface.createFromAsset(context.getApplicationContext().getAssets(), "fonts/GE_Dinar_One_Medium.otf");
    }

    public static Typeface getTypeFaceBoldAr(Context context){

        return Typeface.createFromAsset(context.getApplicationContext().getAssets(), "fonts/GE_Dinar_One_Medium.otf");
    }

    public static boolean hasPermissions(Context context, String... permissions) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && context != null && permissions != null) {
            for (String permission : permissions) {
                if (ActivityCompat.checkSelfPermission(context, permission) != PackageManager.PERMISSION_GRANTED) {
                    return false;
                }
            }
        }
        return true;
    }





    public static String getArabicDay(String day){
        String arabicDay="";
        switch (day.toLowerCase()){

            case "monday":
                arabicDay="الإثنين";
                break;
            case "tuesday":
                arabicDay="الثلاثاء";
                break;
            case "wednesday":
                arabicDay="الاربعاء";
                break;
            case "thursday":
                arabicDay="الخميس";
                break;
            case "friday":
                arabicDay="الجمعة";
                break;
            case "saturday":
                arabicDay="السبت";
                break;
            case "sunday":
                arabicDay="الاحد";
                break;
            default:
                arabicDay=day;
        }
        return arabicDay;

    }



    public static boolean isProbablyArabic(String s) {
        for (int i = 0; i < s.length(); ) {
            int c = s.codePointAt(i);
            if (c >= 0x0600 && c <= 0x06E0)
                return true;
            i += Character.charCount(c);
        }
        return false;
    }






    public static void resetLanguage(Context context){
        Locale locale = new Locale("en");
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        context.getApplicationContext().getResources().updateConfiguration(config, null);
    }









    public static void setMargins (Context context,View view, int left, int top, int right, int bottom) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {

            int leftInDp = (int) TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, left, context.getResources()
                            .getDisplayMetrics());
            int topInDp = (int) TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, top, context.getResources()
                            .getDisplayMetrics());

            int rightInDp = (int) TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, right, context.getResources()
                            .getDisplayMetrics());

            int bottomInDp = (int) TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, bottom, context.getResources()
                            .getDisplayMetrics());

            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            p.setMargins(leftInDp, topInDp, rightInDp, bottomInDp);
            view.requestLayout();
        }
    }






}