package com.sdmit.kasim.campusguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class gfloor extends Fragment {

    Button btn1,btn3,btn4,btn7,btn8,btn11,btn12,btn13,btn15;
    View myView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myView = inflater.inflate(R.layout.fragment_gfloor, container, false);


        btn1  = myView.findViewById(R.id.m001);
        btn3  = myView.findViewById(R.id.m003);
        btn4  = myView.findViewById(R.id.m004);
        btn7  = myView.findViewById(R.id.m007);
        btn8  = myView.findViewById(R.id.m008);
        btn11 = myView.findViewById(R.id.m011);
        btn12 = myView.findViewById(R.id.m012);
        btn13 = myView.findViewById(R.id.m013);
        btn15 = myView.findViewById(R.id.m015);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),fragment.class);
                i.putExtra("room",1);
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),fragment.class);
                i.putExtra("room",3);
                startActivity(i);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),fragment.class);
                i.putExtra("room",4);
                startActivity(i);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),fragment.class);
                i.putExtra("room",7);
                startActivity(i);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),fragment.class);
                i.putExtra("room",8);
                startActivity(i);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),fragment.class);
                i.putExtra("room",11);
                startActivity(i);
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),fragment.class);
                i.putExtra("room",12);
                startActivity(i);
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),fragment.class);
                i.putExtra("room",13);
                startActivity(i);
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),fragment.class);
                i.putExtra("room",15);
                startActivity(i);
            }
        });
    return myView;
    }
}
