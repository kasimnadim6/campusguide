package com.example.kasim.campusguide;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class fragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        Intent i = getIntent();
        //int rid = i.getIntExtra("room",0);
        int fid = i.getIntExtra("floor",0);
        int bid = i.getIntExtra("block",0);
        int cid = i.getIntExtra("ccfloor",0);

        if(bid==1){
            loadFragment(new mainbuilding());
        } else if(bid==2) {
            loadFragment(new ccfbuilding());
        }


        if(fid==1){
            loadFragment(new gfloor());
        }else if(fid==2){
            loadFragment(new ffloor());
        }
    }


    private void loadFragment(Fragment fragment){
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fg,fragment);
        ft.commit();
    }


}
