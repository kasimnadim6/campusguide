package com.example.kasim.campusguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainBuilding extends AppCompatActivity {

    Button btng,btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_building);

        btng = findViewById(R.id.ground);
        btn1 = findViewById(R.id.first);
        btn2 = findViewById(R.id.second);
        btn3 = findViewById(R.id.third);

        btng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),GFloor.class);
                startActivity(i);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),FFloor.class);
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
}
