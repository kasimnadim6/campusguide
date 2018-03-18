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
        int id = i.getIntExtra("room",0);

        if(id==1)loadFragment (new m001());
        else if(id==3) loadFragment(new m003());
    }
    private void loadFragment(Fragment fragment){
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fg,fragment);
        ft.commit();
    }
}
