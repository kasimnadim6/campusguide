package com.example.kasim.campusguide;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.github.barteksc.pdfviewer.PDFView;

public class topfloor extends Fragment implements View.OnClickListener {

    ImageButton room1,room2,room3,room4,room5,room7,room8,room9,room10,room11,room12,room13,room14,room15;
    View myView;
    PDFView pdfView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myView = inflater.inflate(R.layout.fragment_topfloor, container, false);

        pdfView = myView.findViewById(R.id.details);
        room1 = myView.findViewById(R.id.btn1);
        room1.setOnClickListener(this);

        room2 = myView.findViewById(R.id.btn2);
        room2.setOnClickListener(this);

        room3 = myView.findViewById(R.id.btn3);
        room3.setOnClickListener(this);

        room4= myView.findViewById(R.id.btn4);
        room4.setOnClickListener(this);

        room5 = myView.findViewById(R.id.btn5);
        room5.setOnClickListener(this);

        room7 = myView.findViewById(R.id.btn7);
        room7.setOnClickListener(this);

        room8 = myView.findViewById(R.id.btn8);
        room8.setOnClickListener(this);

        room9= myView.findViewById(R.id.btn9);
        room9.setOnClickListener(this);

        room10 = myView.findViewById(R.id.btn10);
        room10.setOnClickListener(this);

        room11 = myView.findViewById(R.id.btn11);
        room11.setOnClickListener(this);

        room12 = myView.findViewById(R.id.btn12);
        room12.setOnClickListener(this);

        room13 = myView.findViewById(R.id.btn13);
        room13.setOnClickListener(this);

        room14 = myView.findViewById(R.id.btn14);
        room14.setOnClickListener(this);

        room15 = myView.findViewById(R.id.btn15);
        room15.setOnClickListener(this);

        return myView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                pdfView.fromAsset("m401.pdf").load();
                break;
            case R.id.btn2:
                pdfView.fromAsset("m403.pdf").load();
                break;
            case R.id.btn3:
                pdfView.fromAsset("m404.pdf").load();
                break;
            case R.id.btn4:
                pdfView.fromAsset("m405.pdf").load();
                break;
            case R.id.btn5:
                pdfView.fromAsset("m406.pdf").load();
                break;
            case R.id.btn7:
                pdfView.fromAsset("c004.pdf").load();
                break;
            case R.id.btn8:
                pdfView.fromAsset("m411.pdf").load();
                break;
            case R.id.btn9:
                pdfView.fromAsset("m412.pdf").load();
                break;
            case R.id.btn10:
                pdfView.fromAsset("m413.pdf").load();
                break;
            case R.id.btn11:
                pdfView.fromAsset("m414.pdf").load();
                break;
            case R.id.btn12:
                pdfView.fromAsset("c005.pdf").load();
                break;
            case R.id.btn13:
                pdfView.fromAsset("c005.pdf").load();
                break;
            case R.id.btn14:
                pdfView.fromAsset("c005.pdf").load();
                break;
            case R.id.btn15:
                pdfView.fromAsset("c005.pdf").load();
                break;
        }
    }
}
