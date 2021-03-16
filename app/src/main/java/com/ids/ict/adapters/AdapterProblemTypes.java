package com.ids.ict.adapters;

import android.content.Context;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;


import com.ids.ict.MyApplication;
import com.ids.ict.R;
import com.ids.ict.adapters.interfaces.RVOnItemClickListener;
import com.ids.ict.classes.Models.ResultResponseTypes;

import java.util.ArrayList;


public class AdapterProblemTypes extends RecyclerView.Adapter<AdapterProblemTypes.VHItems> {

    private ArrayList<ResultResponseTypes> items;
    private RVOnItemClickListener itemClickListener;
    private int rowPosition;


    public AdapterProblemTypes(ArrayList<ResultResponseTypes> items, RVOnItemClickListener itemClickListener, int position) {
        this.items = items;
        this.itemClickListener=itemClickListener;
        this.rowPosition=position;
    }

    @Override
    public VHItems onCreateViewHolder(ViewGroup parent, int viewType) {
        return new VHItems(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_problem_types, parent, false));
    }

    @Override
    public void onBindViewHolder(VHItems holder, int position) {
       try{ holder.btProblemTypes.setText(items.get(position).getName());}catch (Exception e){}
        //holder.ctvCourseName.setText("asdsad");
        try{
        if(items.get(position).getSelected()){
            if (MyApplication.nightMod) {
                holder.btProblemTypes.setBackgroundColor(ContextCompat.getColor(holder.itemView.getContext(), R.color.nightBlue));
                holder.btProblemTypes.setTextColor(holder.itemView.getContext().getResources().getColor(R.color.white));
            } else {
                holder.btProblemTypes.setBackground(holder.itemView.getContext().getResources().getDrawable(
                        R.drawable.background));
            }
        }

        else {
            if (MyApplication.nightMod) {
                holder.btProblemTypes.setBackgroundColor(ContextCompat.getColor(holder.itemView.getContext(), R.color.nightBlue_unselected));
                holder.btProblemTypes.setTextColor(holder.itemView.getContext().getResources().getColor(R.color.white));
            } else {

                holder.btProblemTypes.setBackgroundColor(holder.itemView.getContext().getResources().getColor(
                        R.color.gray_light));
            }

        }
        }catch (Exception e){
            if (MyApplication.nightMod) {
                holder.btProblemTypes.setBackgroundColor(ContextCompat.getColor(holder.itemView.getContext(), R.color.nightBlue_unselected));
                holder.btProblemTypes.setTextColor(holder.itemView.getContext().getResources().getColor(R.color.white));
            } else {

                holder.btProblemTypes.setBackgroundColor(holder.itemView.getContext().getResources().getColor(
                        R.color.gray_light));
            }
        }

        holder.itemView.getLayoutParams().width = getScreenWidth(holder.itemView.getContext())/2;


    }

    public static int getScreenWidth(Context context) {
        WindowManager wm= (WindowManager) context
                .getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);
        return dm.widthPixels;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public ArrayList<ResultResponseTypes> getItems() {
        return items;
    }

    protected class VHItems extends RecyclerView.ViewHolder implements View.OnClickListener {

        private Button btProblemTypes;


        public VHItems(View itemView) {
            super(itemView);
            btProblemTypes = itemView.findViewById(R.id.btProblemTypes);


            btProblemTypes.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            itemClickListener.onItemClicked(v, getLayoutPosition());
        }
    }
}