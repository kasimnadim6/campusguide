package com.sdmit.kasim.campusguide;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.github.barteksc.pdfviewer.PDFView;

public class hostel extends Fragment {

    PDFView pdfView;
    View myView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myView = inflater.inflate(R.layout.fragment_hostel, container, false);

        pdfView = myView.findViewById(R.id.hostel);
        pdfView.fromAsset("hostel.pdf").load();
        return myView;
    }
}