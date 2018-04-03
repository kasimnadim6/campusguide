package com.example.kasim.campusguide.Gfloor;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.kasim.campusguide.R;
import com.github.barteksc.pdfviewer.PDFView;

public class m004 extends Fragment {
    View myview;
    PDFView pdfView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myview = inflater.inflate(R.layout.fragment_m004, container, false);

        pdfView = myview.findViewById(R.id.m004);
        pdfView.fromAsset("m004.pdf").load();

        return myview;
    }
}
