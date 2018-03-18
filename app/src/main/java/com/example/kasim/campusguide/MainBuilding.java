package com.example.kasim.campusguide;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;
import me.relex.circleindicator.CircleIndicator;

public class MainBuilding extends AppCompatActivity {

    Button btng, btn1, btn2, btn3;
    protected static ViewPager mPager;
    private static int currentPage = 0;
    private static final Integer[] images = {R.drawable.mainbuildingcover, R.drawable.canteencover,
            R.drawable.parkingcover,R.drawable.hostelcover, R.drawable.playgroundcover, R.drawable.librarycover, R.drawable.staffquaters};
    private ArrayList<Integer> imagesArray = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_building);
        init();

        btng = findViewById(R.id.ground);
        btn1 = findViewById(R.id.first);
        btn2 = findViewById(R.id.second);
        btn3 = findViewById(R.id.third);

        btng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), GFloor.class);
                startActivity(i);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), FFloor.class);
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
    }

    private void init() {
        imagesArray.addAll(Arrays.asList(images));

        mPager = findViewById(R.id.pager);
        mPager.setAdapter(new ImageAdapter(MainBuilding.this, imagesArray));
        CircleIndicator indicator = findViewById(R.id.indicator);
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
    }
}

