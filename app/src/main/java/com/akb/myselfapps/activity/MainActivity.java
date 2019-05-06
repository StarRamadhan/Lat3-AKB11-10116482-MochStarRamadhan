package com.akb.myselfapps.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.akb.myselfapps.R;
import com.akb.myselfapps.fragment.DailyFragment;
import com.akb.myselfapps.fragment.GalleryFragment;
import com.akb.myselfapps.fragment.HomeFragment;
import com.akb.myselfapps.fragment.MusicFragment;
import com.akb.myselfapps.fragment.ProfileFragment;

/**
 * Latihan 3
 * Nim : 10116482
 * Nama : Moch. Star Ramadhan
 * Kelas : AKB/IF-11
 * Tanggal : 1 Mei 2019
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = findViewById(R.id.id_botnav);
        navigation.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_cont, new HomeFragment()).commit();
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment = null;

                    switch (menuItem.getItemId()){
                        case R.id.navigation_home:
                            selectedFragment = new HomeFragment();
                            break;
                        case R.id.navigation_daily:
                            selectedFragment = new DailyFragment();
                            break;
                        case  R.id.navigation_gallery:
                            selectedFragment = new GalleryFragment();
                            break;
                        case  R.id.navigation_music:
                            selectedFragment = new MusicFragment();
                            break;
                        case  R.id.navigation_profile:
                            selectedFragment = new ProfileFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_cont,
                            selectedFragment).commit();
                    return true;
                }
            };
}
