package com.sdmit.kasim.campusguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Timer;

import me.relex.circleindicator.CircleIndicator;

public class mainbuilding extends Fragment {

    View myView;
    Button btng, btn1, btn2, btn3;
    protected static CircleIndicator indicator;
    protected static ViewPager mPager;
    private static int currentPage = 0;
    private static final Integer[] images = {R.drawable.mainbuildingcover, R.drawable.canteencover,
            R.drawable.parkingcover, R.drawable.hostelcover, R.drawable.playgroundcover, R.drawable.librarycover, R.drawable.staffquaters};
    private ArrayList<Integer> imagesArray = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myView = inflater.inflate(R.layout.fragment_mainbuilding, container, false);

        //init();
        imagesArray.addAll(Arrays.asList(images));

        mPager = myView.findViewById(R.id.pager);
        mPager.setAdapter(new ImageAdapter(getActivity(), imagesArray));
        indicator = myView.findViewById(R.id.indicator);
        indicator.setViewPager(mPager);

        // Auto start of viewpager
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
        /*swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 2500, 2500);*/

        btng = myView.findViewById(R.id.ground);
        btn1 = myView.findViewById(R.id.first);
        btn2 = myView.findViewById(R.id.second);
        btn3 = myView.findViewById(R.id.third);

        btng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), fragment.class);
                i.putExtra("floor", 1);
                startActivity(i);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), fragment.class);
                i.putExtra("floor", 2);
                startActivity(i);
            }
        });

       /* btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity().getBaseContext(),SFloor.class);
                startActivity(i);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity().getBaseContext(),TFloor.class);
                startActivity(i);
            }
        });*/
        return myView;
    }
}
