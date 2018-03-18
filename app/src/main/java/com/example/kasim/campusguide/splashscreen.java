package com.example.kasim.campusguide;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);


        SharedPreferences settings = getSharedPreferences("prefs",0);
        boolean FirstRun = settings.getBoolean("FirstRun",true);

        if(FirstRun) {
            //do something
            new Thread() {
                public void run() {
                    try {
                        sleep(1000);
                        Intent i = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(i);
                        finish();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }else {

            Intent myIntent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(myIntent);
            finish();
        }
    }
}
