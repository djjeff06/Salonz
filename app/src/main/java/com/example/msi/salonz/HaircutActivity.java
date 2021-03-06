package com.example.msi.salonz;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HaircutActivity extends Fragment {

    TextView h1,h2,h3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_haircut, container, false);
        h1 = (TextView) view.findViewById(R.id.h1);
        h2 = (TextView) view.findViewById(R.id.h2);
        h3 = (TextView) view.findViewById(R.id.h3);

        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fl_fragment, new HaircutActivity());
                ft.commit();
            }
        });

        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fl_fragment, new HaircutActivity());
                ft.commit();
            }
        });

        h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fl_fragment, new HaircutActivity());
                ft.commit();
            }
        });
        return view;
    }

}
