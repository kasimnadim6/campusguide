package com.example.kasim.campusguide;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splashscreen extends AppCompatActivity {

    private ImageView logo,head,foot;
    private TextView text,text1;
    Animation animation;
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        logo = findViewById(R.id.logo);
        foot = findViewById(R.id.foot);
        head = findViewById(R.id.head);
        text = findViewById(R.id.text);
        text1 = findViewById(R.id.text1);

        animation  = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.push_down);
        logo.setAnimation(animation);

        animation  = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.push_right);
        text.setAnimation(animation);

        animation  = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.push_right);
        text1.setAnimation(animation);

        animation  = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.push_right);
        foot.setAnimation(animation);

        animation  = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.push_left);
        head.setAnimation(animation);

       /* handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                finish();
            }
        },1000);  */
       Thread thread = new Thread()
       {
           @Override
           public void run() {
               try {
                   sleep(2000);
                   Intent i = new Intent(getApplicationContext(),MainActivity.class);
                   startActivity(i);
                   finish();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               super.run();
           }
       };
        thread.start();
    }
}
