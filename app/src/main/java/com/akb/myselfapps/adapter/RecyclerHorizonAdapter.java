
package com.akb.myselfapps.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.akb.myselfapps.item.ItemFriend;
import com.akb.myselfapps.R;

import java.util.List;

/**
 * Latihan 3
 * Nim : 10116482
 * Nama : Moch. Star Ramadhan
 * Kelas : AKB/IF-11
 * Tanggal : 5 Mei 2019
 */

public class RecyclerHorizonAdapter extends RecyclerView.Adapter<RecyclerHorizonAdapter.MyViewHolder> {

    Context mContext;
    List<ItemFriend> mData;

    public RecyclerHorizonAdapter(Context mContext, List<ItemFriend> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v= LayoutInflater.from(mContext).inflate(R.layout.layout_friendlist,viewGroup,false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.txt_name.setText(mData.get(i).getName());
        myViewHolder.img.setImageResource(mData.get(i).getImage());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView txt_name;
        private ImageView img;
        public MyViewHolder(View itemView){
            super(itemView);

            txt_name = (TextView) itemView.findViewById(R.id.txtFriendName);
            img = (ImageView) itemView.findViewById(R.id.imgPhoto);

        }
    }


}
