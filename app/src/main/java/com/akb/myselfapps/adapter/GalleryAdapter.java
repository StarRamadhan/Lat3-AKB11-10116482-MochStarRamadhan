
package com.akb.myselfapps.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.akb.myselfapps.item.ItemPhoto;
import com.akb.myselfapps.R;

import java.util.List;
/**
 * Latihan 3
 * Nim : 10116482
 * Nama : Moch. Star Ramadhan
 * Kelas : AKB/IF-11
 * Tanggal : 5 Mei 2019
 */
public class GalleryAdapter extends RecyclerView.Adapter<GalleryViewHolder> {
    private Context context;
    List<ItemPhoto> galleryModels;
    public GalleryAdapter(Context context,List<ItemPhoto> galleryModels){
        this.context=context;
        this.galleryModels=galleryModels;
    }
    @NonNull
    @Override
    public GalleryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.layout_gallery,viewGroup,false);
        return new GalleryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryViewHolder galleryViewHolder, int i) {
        ItemPhoto galleryModel=galleryModels.get(i);
        galleryViewHolder.txtGalleryName.setText(galleryModel.getName());
        galleryViewHolder.imgGallery.setImageResource(galleryModel.getImage());
    }

    @Override
    public int getItemCount() {
        return galleryModels.size();
    }
}
