package com.akb.myselfapps.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.akb.myselfapps.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Latihan 3
 * Nim : 10116482
 * Nama : Moch. Star Ramadhan
 * Kelas : AKB/IF-11
 * Tanggal : 5 Mei 2019
 */

class GalleryViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.imgGallery)
    ImageView imgGallery;
    @BindView(R.id.txtGalleryName)
    TextView txtGalleryName;
    private ArrayList<String> galleryModel=new ArrayList<>();
    public GalleryViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void setItem(ArrayList<String> item){//penerima value dari adapter
        galleryModel=item;
    }
}