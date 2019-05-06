package com.akb.myselfapps.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.akb.myselfapps.item.ItemAct;
import com.akb.myselfapps.item.ItemFriend;
import com.akb.myselfapps.R;
import com.akb.myselfapps.adapter.RecyclerHorizonAdapter;
import com.akb.myselfapps.adapter.RecyclerVerticalAdapter;

import java.util.ArrayList;
import java.util.List;
/**
 * Latihan 3
 * Nim : 10116482
 * Nama : Moch. Star Ramadhan
 * Kelas : AKB/IF-11
 * Tanggal : 4 Mei 2019
 */
public class DailyFragment extends Fragment {
    View v;
    //    private RecyclerView myrecyclerview;
//    private static final String TAG = "DailyFragment";
//    private ArrayList<String> mNames = new ArrayList<>();
//    private ArrayList<String> mImagesUrls = new ArrayList<>();
    private RecyclerView myrecyclerview,myrecyclerview1;
    private List<ItemFriend> listFriend;
    private List<ItemAct> listActivity;
    public DailyFragment() {

    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_daily, container, false);
        //LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);


        myrecyclerview = (RecyclerView) v.findViewById(R.id.recyclerHorizon);
        myrecyclerview1 = (RecyclerView) v.findViewById(R.id.recyclerAct);
        RecyclerHorizonAdapter recyclerHorizonAdapter = new RecyclerHorizonAdapter(getContext(), listFriend);
        RecyclerVerticalAdapter recyclerVerticalAdapter = new RecyclerVerticalAdapter(getContext(), listActivity);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        myrecyclerview1.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerHorizonAdapter);
        myrecyclerview1.setAdapter(recyclerVerticalAdapter);
        return v;
        //initImageBitmaps();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listFriend = new ArrayList<>();
        listFriend.add(new ItemFriend("M Fajar", R.drawable.fl_fajar_m));
        listFriend.add(new ItemFriend("Faldi Favian", R.drawable.fl_faldi_f));
        listFriend.add(new ItemFriend("Nurcahya Eko", R.drawable.fl_nuchaya_e));
        listFriend.add(new ItemFriend("Fajar I", R.drawable.fl_fajar_i));
        listFriend.add(new ItemFriend("M Iqbal", R.drawable.fl_iqbal_s));
        listFriend.add(new ItemFriend("Idham R", R.drawable.fl_idham_r));
        listFriend.add(new ItemFriend("Ilham P", R.drawable.fl_ilham_p));
        listFriend.add(new ItemFriend("Donny H", R.drawable.fl_don_hassan));
        listFriend.add(new ItemFriend("Imam DC", R.drawable.fl_imam_dc));

        listActivity = new ArrayList<>();
        listActivity.add(new ItemAct("Kuliah sesuai jadwal"));
        listActivity.add(new ItemAct("Makan 2-3 kali"));
        listActivity.add(new ItemAct("Shalat 5 waktu"));
        listActivity.add(new ItemAct("Mengerjakan tugas & Review Materi"));
        listActivity.add(new ItemAct("Design vektor / logo"));
        listActivity.add(new ItemAct("Push Rank Arena Of Valor"));
        //initRecyclerView();
    }
    //private void initRecyclerView(){}
}