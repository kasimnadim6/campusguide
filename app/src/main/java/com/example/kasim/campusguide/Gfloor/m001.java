package com.example.kasim.campusguide.Gfloor;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.kasim.campusguide.R;
import com.github.barteksc.pdfviewer.PDFView;

public class m001 extends Fragment {

    View myview;
    PDFView pdfView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myview = inflater.inflate(R.layout.fragment_m001, container, false);

        pdfView = myview.findViewById(R.id.m001);
        pdfView.fromAsset("cpro.pdf").load();

        return myview;
    }
}
