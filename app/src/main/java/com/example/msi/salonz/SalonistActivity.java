package com.example.msi.salonz;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SalonistActivity extends Fragment {

    TextView st1,st2,st3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_salonist, container, false);
        st1 = (TextView) view.findViewById(R.id.st1);
        st2 = (TextView) view.findViewById(R.id.st2);
        st3 = (TextView) view.findViewById(R.id.st3);

        st1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fl_fragment, new HaircutActivity());
                ft.commit();
            }
        });

        st2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fl_fragment, new HaircutActivity());
                ft.commit();
            }
        });

        st3.setOnClickListener(new View.OnClickListener() {
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
