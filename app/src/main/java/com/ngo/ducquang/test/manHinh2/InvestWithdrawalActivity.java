package com.ngo.ducquang.test.manHinh2;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ngo.ducquang.test.R;

public class InvestWithdrawalActivity extends AppCompatActivity {

    InvestWithDrawlFragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        FragmentManager fm = getSupportFragmentManager();
        fragment = (InvestWithDrawlFragment) fm.findFragmentById(R.id.fragment);
        if (fragment == null) {
            android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
            fragment =new InvestWithDrawlFragment();
            ft.add(android.R.id.content,fragment,"myFragmentTag");
            ft.commit();
        }
    }
}
