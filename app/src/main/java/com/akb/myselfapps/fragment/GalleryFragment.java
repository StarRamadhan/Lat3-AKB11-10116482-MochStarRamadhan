package com.akb.myselfapps.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.akb.myselfapps.item.ItemPhoto;
import com.akb.myselfapps.R;
import com.akb.myselfapps.adapter.GalleryAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
/**
 * Latihan 3
 * Nim : 10116482
 * Nama : Moch. Star Ramadhan
 * Kelas : AKB/IF-11
 * Tanggal : 5 Mei 2019
 */
public class GalleryFragment extends Fragment {

    @BindView(R.id.listPhoto)
    RecyclerView recyclerViewGallery;
    List<ItemPhoto> galleryItem;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public GalleryFragment() {
        // Required empty public constructor
    }

    public static GalleryFragment newInstance(String param1, String param2) {
        GalleryFragment fragment = new GalleryFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View viewFragment=inflater.inflate(R.layout.fragment_gallery, container, false);
        ButterKnife.bind(this,viewFragment);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(getContext(),2);
        initData();
        recyclerViewGallery.setLayoutManager(gridLayoutManager);
        recyclerViewGallery.setHasFixedSize(true);
        GalleryAdapter galleryAdapter=new GalleryAdapter(getContext(),galleryItem);
        recyclerViewGallery.setAdapter(galleryAdapter);
        return viewFragment;
    }

    private void initData() {
        galleryItem=new ArrayList<>();
        galleryItem.add(new ItemPhoto(R.drawable.profil,"Real Star"));
        galleryItem.add(new ItemPhoto(R.drawable.star_wars,"Star Wars"));
        galleryItem.add(new ItemPhoto(R.drawable.star_lord,"Star Lord"));
        galleryItem.add(new ItemPhoto(R.drawable.star_fish,"Star Fish"));
        galleryItem.add(new ItemPhoto(R.drawable.star_platinum,"Star Platinum"));
        galleryItem.add(new ItemPhoto(R.drawable.star_buck,"StarBuck"));
        galleryItem.add(new ItemPhoto(R.drawable.star_rising,"Rising Star"));
        galleryItem.add(new ItemPhoto(R.drawable.star_fruit,"Star Fruit"));
        galleryItem.add(new ItemPhoto(R.drawable.star_mild,"Star Mild"));
        galleryItem.add(new ItemPhoto(R.drawable.star_all,"All Star"));



    }

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}