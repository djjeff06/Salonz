package com.example.msi.salonz;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SalonListActivity extends Fragment {

    TextView s1,s2,s3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_salon_list, container, false);
        s1 = (TextView) view.findViewById(R.id.s1);
        s2 = (TextView) view.findViewById(R.id.s2);
        s3 = (TextView) view.findViewById(R.id.s3);

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fl_fragment, new SalonistActivity());
                ft.commit();
            }
        });

        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fl_fragment, new SalonistActivity());
                ft.commit();
            }
        });

        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fl_fragment, new SalonistActivity());
                ft.commit();
            }
        });
        return view;
    }

}
