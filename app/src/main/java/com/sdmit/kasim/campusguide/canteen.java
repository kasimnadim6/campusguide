package com.sdmit.kasim.campusguide;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.github.barteksc.pdfviewer.PDFView;

public class canteen extends Fragment {

    PDFView pdfView;
    View myView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_canteen, container, false);

        pdfView = myView.findViewById(R.id.canteen);
        pdfView.fromAsset("canteen.pdf").load();
        return myView;
    }
}