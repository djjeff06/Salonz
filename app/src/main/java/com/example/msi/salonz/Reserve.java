package com.example.msi.salonz;

import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static com.example.msi.salonz.MainNavigation.sp;

public class Reserve extends Fragment {

    private TextView sms, email, call;
    private TextView curMobile, curEmail, curCat;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.activity_reserve,container,false);
        sms = (TextView) view.findViewById(R.id.sms);
        email = (TextView) view.findViewById(R.id.email);
        call = (TextView) view.findViewById(R.id.call);

        curMobile = (TextView) view.findViewById(R.id.curMobile);
        curEmail = (TextView) view.findViewById(R.id.curEmail);
        curCat = (TextView) view.findViewById(R.id.curPhone);

        return view;

    }

}
