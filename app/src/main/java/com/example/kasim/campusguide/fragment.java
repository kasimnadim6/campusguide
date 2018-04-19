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
        }else if(bid==3) {
            loadFragment(new library());
        }else if(bid==4) {
            loadFragment(new canteen());
        }else if(bid==5) {
            loadFragment(new playground());
        }else if(bid==6) {
            loadFragment(new parking());
        }else if(bid==7) {
            loadFragment(new staff());
        }else if(bid==8) {
            loadFragment(new hostel());
        }


        if(fid==1){
            loadFragment(new gfloor());
        }else if(fid==2){
            loadFragment(new ffloor());
        }


        if(cid==1){
            loadFragment(new gccf());
        }else if(cid==2){
            loadFragment(new fccf());
        }else if(cid==3){
            loadFragment(new sccf());
        }
    }


    private void loadFragment(Fragment fragment){
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fg,fragment);
        ft.commit();
    }


}
