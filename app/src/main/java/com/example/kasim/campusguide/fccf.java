package com.example.kasim.campusguide;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.github.barteksc.pdfviewer.PDFView;

public class fccf extends Fragment implements View.OnClickListener {

    ImageButton btn1, btn2;
    View myView;
    PDFView pdfView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myView = inflater.inflate(R.layout.fragment_fccf, container, false);
        pdfView = myView.findViewById(R.id.details);
        btn1 = myView.findViewById(R.id.btn1);/*.enableSwipe(true)
                    .swipeHorizontal(false)
                    .enableAnnotationRendering(true)*/
        btn1.setOnClickListener(this);

        btn2 = myView.findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        return myView;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                pdfView.fromAsset("c105.pdf").load();
                break;
            case R.id.btn2:
                pdfView.fromAsset("c106.pdf").load();
                break;
        }
    }
}
