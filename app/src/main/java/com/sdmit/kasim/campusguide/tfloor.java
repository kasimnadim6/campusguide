package com.sdmit.kasim.campusguide;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.github.barteksc.pdfviewer.PDFView;

public class tfloor extends Fragment implements View.OnClickListener {

    ImageButton room1,room2,room3,room4,room5,room7,room8,room9,room10,room11,room12;
    View myView;
    PDFView pdfView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myView = inflater.inflate(R.layout.fragment_tfloor, container, false);

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
        return myView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                pdfView.fromAsset("m301.pdf").load();
                break;
            case R.id.btn2:
                pdfView.fromAsset("m303.pdf").load();
                break;
            case R.id.btn3:
                pdfView.fromAsset("m304.pdf").load();
                break;
            case R.id.btn4:
                pdfView.fromAsset("m305.pdf").load();
                break;
            case R.id.btn5:
                pdfView.fromAsset("m306.pdf").load();
                break;
            case R.id.btn7:
                pdfView.fromAsset("m308.pdf").load();
                break;
            case R.id.btn8:
                pdfView.fromAsset("m309.pdf").load();
                break;
            case R.id.btn9:
                pdfView.fromAsset("m312.pdf").load();
                break;
            case R.id.btn10:
                pdfView.fromAsset("m313.pdf").load();
                break;
            case R.id.btn11:
                pdfView.fromAsset("m314.pdf").load();
                break;
            case R.id.btn12:
                pdfView.fromAsset("m315.pdf").load();
                break;
        }
    }
}