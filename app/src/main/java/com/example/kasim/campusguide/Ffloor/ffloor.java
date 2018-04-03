package com.example.kasim.campusguide.Ffloor;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.kasim.campusguide.Gfloor.m001;
import com.example.kasim.campusguide.Gfloor.m003;
import com.example.kasim.campusguide.R;

public class ffloor extends Fragment {

    View myview;

    ImageButton bt1,bt2,bt3,bt4,bt5;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       myview = inflater.inflate(R.layout.fragment_ffloor, container, false);

       bt1 = myview.findViewById(R.id.m001);
       bt2= myview.findViewById(R.id.m003);
       bt1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               loadFragment(new m001());
           }
       });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new m003());
            }
        });
    return myview;
    }
    private void loadFragment(Fragment fragment){
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.details,fragment);
        ft.commit();
    }
}
