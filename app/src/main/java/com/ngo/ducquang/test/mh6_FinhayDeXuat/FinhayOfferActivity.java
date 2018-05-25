package com.ngo.ducquang.test.mh6_FinhayDeXuat;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ngo.ducquang.test.R;
import com.ngo.ducquang.test.manHinh2.InvestWithDrawlFragment;

public class FinhayOfferActivity extends AppCompatActivity
{
    FinhayOfferFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finhay_offer);

        FragmentManager fm = getSupportFragmentManager();
        fragment = (FinhayOfferFragment) fm.findFragmentById(R.id.fragment);
        if (fragment == null)
        {
            FragmentTransaction ft = fm.beginTransaction();
            fragment =new FinhayOfferFragment();
            ft.add(android.R.id.content, fragment,"myFragmentTag");
            ft.commit();
        }
    }
}
