package com.example.kasim.campusguide;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.github.barteksc.pdfviewer.PDFView;

public class GFloor extends AppCompatActivity {

    Button btn1,btn3,btn4,btn7,btn8,btn11,btn12,btn13,btn15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gfloor);

        btn1  = findViewById(R.id.m001);
        btn3  = findViewById(R.id.m003);
        btn4  = findViewById(R.id.m004);
        btn7  = findViewById(R.id.m007);
        btn8  = findViewById(R.id.m008);
        btn11 = findViewById(R.id.m011);
        btn12 = findViewById(R.id.m012);
        btn13 = findViewById(R.id.m013);
        btn15 = findViewById(R.id.m015);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),fragment.class);
                i.putExtra("room",1);
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),fragment.class);
                i.putExtra("room",3);
                startActivity(i);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),fragment.class);
                i.putExtra("room",4);
                startActivity(i);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),fragment.class);
                i.putExtra("room",7);
                startActivity(i);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),fragment.class);
                i.putExtra("room",8);
                startActivity(i);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),fragment.class);
                i.putExtra("room",11);
                startActivity(i);
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),fragment.class);
                i.putExtra("room",12);
                startActivity(i);
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),fragment.class);
                i.putExtra("room",13);
                startActivity(i);
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),fragment.class);
                i.putExtra("room",15);
                startActivity(i);
            }
        });
    }
}
