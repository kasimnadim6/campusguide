package com.sdmit.kasim.campusguide;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.github.barteksc.pdfviewer.PDFView;

public class ffloor extends Fragment implements View.OnClickListener {

    ImageButton room1,room2,room3,room4,room6,room7,room8,room9,room10,room11;
    View myView;
    PDFView pdfView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myView = inflater.inflate(R.layout.fragment_ffloor, container, false);

        pdfView = myView.findViewById(R.id.details);
        room1 = myView.findViewById(R.id.btn1);
        room1.setOnClickListener(this);

        room2 = myView.findViewById(R.id.btn2);
        room2.setOnClickListener(this);

        room3 = myView.findViewById(R.id.btn3);
        room3.setOnClickListener(this);

        room4= myView.findViewById(R.id.btn4);
        room4.setOnClickListener(this);

        room6 = myView.findViewById(R.id.btn6);
        room6.setOnClickListener(this);

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

        return myView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                pdfView.fromAsset("m101.pdf").load();
                break;
            case R.id.btn2:
                pdfView.fromAsset("m104.pdf").load();
                break;
            case R.id.btn3:
                pdfView.fromAsset("m105.pdf").load();
                break;
            case R.id.btn4:
                pdfView.fromAsset("m106.pdf").load();
                break;
            case R.id.btn6:
                pdfView.fromAsset("m108.pdf").load();
                break;
            case R.id.btn7:
                pdfView.fromAsset("m109.pdf").load();
                break;
            case R.id.btn8:
                pdfView.fromAsset("m111.pdf").load();
                break;
            case R.id.btn9:
                pdfView.fromAsset("m112.pdf").load();
                break;
                case R.id.btn10:
                pdfView.fromAsset("m115.pdf").load();
                break;
            case R.id.btn11:
                pdfView.fromAsset("m116.pdf").load();
                break;
        }
    }
}