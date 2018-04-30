package com.example.kasim.campusguide;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.github.barteksc.pdfviewer.PDFView;

public class sccf extends Fragment implements View.OnClickListener {

    ImageButton btn1, btn2,btn3,btn4,btn5;
    PDFView pdfView;
    View myView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       myView = inflater.inflate(R.layout.fragment_sccf, container, false);
       pdfView = myView.findViewById(R.id.details);
       btn1 = myView.findViewById(R.id.btn1);/*.enableSwipe(true)
                    .swipeHorizontal(false)
                    .enableAnnotationRendering(true)*/
        btn1.setOnClickListener(this);

        btn2 = myView.findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

        btn3 = myView.findViewById(R.id.btn3);
        btn3.setOnClickListener(this);

        btn4 = myView.findViewById(R.id.btn4);
        btn4.setOnClickListener(this);

        btn5 = myView.findViewById(R.id.btn5);
        btn5.setOnClickListener(this);

        return myView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                pdfView.fromAsset("library.pdf").load();
                break;
            case R.id.btn2:
                pdfView.fromAsset("c202.pdf").load();
                break;
            case R.id.btn3:
                pdfView.fromAsset("c204.pdf").load();
                break;
            case R.id.btn4:
                pdfView.fromAsset("c205.pdf").load();
                break;
            case R.id.btn5:
                pdfView.fromAsset("c206.pdf").load();
                break;
        }
    }
}
