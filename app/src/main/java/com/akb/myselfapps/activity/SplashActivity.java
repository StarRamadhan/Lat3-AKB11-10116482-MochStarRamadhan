package com.akb.myselfapps.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.akb.myselfapps.R;
import com.akb.myselfapps.WelcomeActivity;

/**
 * Latihan 3
 * Nim : 10116482
 * Nama : Moch. Star Ramadhan
 * Kelas : AKB/IF-11
 * Tanggal : 1 Mei 2019
 */
public class SplashActivity extends AppCompatActivity {
    private int waktu_loading=1500;

    //4000=4 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent menu=new Intent(SplashActivity.this, WelcomeActivity.class);
                startActivity(menu);
                finish();

            }
        },waktu_loading);
    }
}