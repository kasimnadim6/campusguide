package com.sdmit.kasim.campusguide;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.github.barteksc.pdfviewer.PDFView;

public class gfloor extends Fragment implements View.OnClickListener {

    ImageButton btn1, btn3, btn4, btn7, btn8, btn11, btn12, btn13, btn15;
    View myView;
    PDFView pdfView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myView = inflater.inflate(R.layout.fragment_gfloor, container, false);
        pdfView = myView.findViewById(R.id.details);


        btn1 = myView.findViewById(R.id.btn1);/*.enableSwipe(true)
                    .swipeHorizontal(false)
                    .enableAnnotationRendering(true)*/
        btn1.setOnClickListener(this);

        btn3 = myView.findViewById(R.id.btn3);
        btn3.setOnClickListener(this);

        btn4 = myView.findViewById(R.id.btn4);
        btn4.setOnClickListener(this);

        btn7 = myView.findViewById(R.id.btn7);
        btn7.setOnClickListener(this);

        btn8 = myView.findViewById(R.id.btn8);
        btn8.setOnClickListener(this);

        btn11 = myView.findViewById(R.id.btn11);
        btn11.setOnClickListener(this);

        btn12 = myView.findViewById(R.id.btn12);
        btn12.setOnClickListener(this);

        btn13 = myView.findViewById(R.id.btn13);
        btn13.setOnClickListener(this);

        btn15 = myView.findViewById(R.id.btn15);
        btn15.setOnClickListener(this);

        return myView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                pdfView.fromAsset("m001.pdf")/*.enableDoubletap(true)
                           .scrollHandle(new DefaultScrollHandle(getContext(),true))*/
                        .load();
                break;
            case R.id.btn3:
                pdfView.fromAsset("m003.pdf").load();
                break;
            case R.id.btn4:
                pdfView.fromAsset("m004.pdf").load();
                break;
            case R.id.btn7:
                pdfView.fromAsset("m004.pdf").load();
                break;
            case R.id.btn8:
                 pdfView.fromAsset("m008.pdf").load();
                 break;
            case R.id.btn11:
                 pdfView.fromAsset("m011.pdf").load();
                 break;
            case R.id.btn12:
                 pdfView.fromAsset("m012.pdf").load();
                 break;
            case R.id.btn13:
                 pdfView.fromAsset("m013.pdf").load();
                 break;
            case R.id.btn15:
                 pdfView.fromAsset("m015.pdf").load();
                 break;
            }
        }

    }
