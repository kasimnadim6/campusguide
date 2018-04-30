package com.example.kasim.campusguide;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.github.barteksc.pdfviewer.PDFView;

public class staff extends Fragment {
    PDFView pdfView;
    View myView;
    Button b1,b2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myView = inflater.inflate(R.layout.fragment_staff, container, false);

        pdfView = myView.findViewById(R.id.staff);
        b1 = myView.findViewById(R.id.b1);
        b2 = myView.findViewById(R.id.b2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pdfView.fromAsset("Staff allotted quatress1.pdf").load();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pdfView.fromAsset("Staff allotted quatress.pdf").load();
            }
        });

        return myView;
    }
}