package com.example.kasim.campusguide;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.github.barteksc.pdfviewer.PDFView;

public class ffloor extends Fragment {

    View myview;
    PDFView pdfView;
    ImageButton bt1,bt2,bt3,bt4,bt5;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       myview = inflater.inflate(R.layout.fragment_ffloor, container, false);
    return myview;
    }
}
