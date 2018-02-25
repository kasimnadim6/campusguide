package com.example.kasim.campusguide;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by kasim on 2/12/18.
 */

public class FragmentOne extends Fragment {

    View myView;
    Button btng,btn1,btn2,btn3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.frag_one,container,false);

        btng = myView.findViewById(R.id.ground);
        btn1 = myView.findViewById(R.id.first);
        btn2 = myView.findViewById(R.id.second);
        btn3 = myView.findViewById(R.id.third);
        btng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity().getBaseContext(),GFloor.class);
                startActivity(i);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity().getBaseContext(),FFloor.class);
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

