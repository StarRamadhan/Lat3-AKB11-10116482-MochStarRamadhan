package com.akb.myselfapps.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.widget.ImageView;


import com.akb.myselfapps.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Latihan 3
 * Nim : 10116482
 * Nama : Moch. Star Ramadhan
 * Kelas : AKB/IF-11
 * Tanggal : 5 Mei 2019
 */

public class ProfileFragment extends Fragment {
    @BindView(R.id.imgLine)
    ImageView imgProfileLinkedin;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public ProfileFragment() {
        // Required empty public constructor
    }

    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
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
        // Inflate the layout for this fragment
        View viewFragment = inflater.inflate(R.layout.fragment_profile, container, false);
        ButterKnife.bind(this,viewFragment);
        return viewFragment;
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

        @OnClick(R.id.imgLine)
    public void clicked(){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("line://ti/p/shadeinstar"));
        startActivity(intent);
    }
    @OnClick(R.id.imgWhatsapp)
    public void klik2(){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://web.whatsapp.com/send?phone=+6282315851012&text=Assalamualaikum, Star"));
        startActivity(intent);
    }
    @OnClick(R.id.imgFacebook)
    public void klik3(){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.facebook.com/dhan.braves"));
        startActivity(intent);
    }
    @OnClick(R.id.imgMaps)
    public void klik4(){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Lengkong,+Bojongsoang,+Bandung,+Jawa+Barat/@-6.9807396,107.6317099,6015m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e68e9c658abb0a1:0xc3a5ef1efddb5891!8m2!3d-6.9806098!4d107.6540877"));
        startActivity(intent);
    }
    @OnClick (R.id.appVersion)
    public void klik5(){
        CustomDialog customDialog=new CustomDialog();
        customDialog.showDialog(getActivity(),"MySelfApps V0.0.1\nby Moch. Star Ramadhan\nAKB 11-10116482");
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
