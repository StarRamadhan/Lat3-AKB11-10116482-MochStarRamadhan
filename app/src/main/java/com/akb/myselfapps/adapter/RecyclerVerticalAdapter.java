package com.akb.myselfapps.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.akb.myselfapps.item.ItemAct;
import com.akb.myselfapps.R;

import java.util.List;

public class RecyclerVerticalAdapter extends RecyclerView.Adapter<RecyclerVerticalAdapter.MyViewHolder1> {

    Context mContext1;
    List<ItemAct> mData1;

    public RecyclerVerticalAdapter(Context mContext1, List<ItemAct> mData1) {
        this.mContext1 = mContext1;
        this.mData1 = mData1;
    }

    @NonNull
    @Override
    public MyViewHolder1 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(mContext1).inflate(R.layout.layout_daily_act,viewGroup,false);
        MyViewHolder1 vHolder = new MyViewHolder1(v);

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder1 myViewHolder1, int i) {

        myViewHolder1.txt_act.setText(mData1.get(i).getSchedule());

    }

    @Override
    public int getItemCount() {
        return mData1.size();
    }

    public static class MyViewHolder1 extends RecyclerView.ViewHolder{

        private TextView txt_act;

        public MyViewHolder1(@NonNull View itemView) {
            super(itemView);
            txt_act = (TextView) itemView.findViewById(R.id.txtActivity);
        }
    }
}
