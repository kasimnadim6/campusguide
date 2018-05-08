package com.sdmit.kasim.campusguide;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Timer;
import me.relex.circleindicator.CircleIndicator;

public class ccfbuilding extends Fragment {

    View myView;
    Button btng, btn1, btn2;
    protected static CircleIndicator indicator;
    protected static ViewPager mPager;
    private static int currentPage = 0;

    private static final Integer[] images = {R.drawable.image3,R.drawable.sdmcover,
            R.drawable.image2,R.drawable.image1,R.drawable.hostelcover};
    private ArrayList<Integer> imagesArray = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myView = inflater.inflate(R.layout.fragment_ccfbuilding, container, false);

        imagesArray.addAll(Arrays.asList(images));

        mPager = myView.findViewById(R.id.pager);
        mPager.setAdapter(new ImageAdapter(getActivity(), imagesArray));
        indicator = myView.findViewById(R.id.indicator);
        indicator.setViewPager(mPager);

        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == images.length) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();

        btng = myView.findViewById(R.id.ground);
        btn1 = myView.findViewById(R.id.first);
        btn2 = myView.findViewById(R.id.second);

        btng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), fragment.class);
                i.putExtra("ccfloor", 1);
                startActivity(i);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), fragment.class);
                i.putExtra("ccfloor", 2);
                startActivity(i);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), fragment.class);
                i.putExtra("ccfloor", 3);
                startActivity(i);
            }
        });
        return myView;
    }
}