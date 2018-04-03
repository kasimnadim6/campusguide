package com.example.kasim.campusguide.Gfloor;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.example.kasim.campusguide.R;

public class gfloor extends Fragment {

    ImageButton btn1,btn3,btn4,btn7,btn8,btn11,btn12,btn13,btn15;
    View myView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myView = inflater.inflate(R.layout.fragment_gfloor, container, false);

        btn1  = myView.findViewById(R.id.btn1);
        btn3  = myView.findViewById(R.id.btn3);
        btn4  = myView.findViewById(R.id.btn4);
        btn7  = myView.findViewById(R.id.btn7);
        btn8  = myView.findViewById(R.id.btn8);
        btn11 = myView.findViewById(R.id.btn11);
        btn12 = myView.findViewById(R.id.btn12);
        btn13 = myView.findViewById(R.id.btn13);
        btn15 = myView.findViewById(R.id.btn15);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new m001());
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new m003());
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new m004());
            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new m007());
            }
        });


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new m008());
            }
        });


        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new m011());
            }
        });


        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new m012());
            }
        });


        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new m013());
            }
        });


        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new m015());
            }
        });
    return myView;
    }

    private void loadFragment(Fragment fragment){
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.details,fragment);
        ft.commit();
    }
}
