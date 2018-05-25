package com.ngo.ducquang.test.mh7;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ngo.ducquang.test.R;

public class ManHinh7Activity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh9);

        FragmentManager fm = getSupportFragmentManager();
        ManHinh7Fragment fragment = (ManHinh7Fragment) fm.findFragmentById(R.id.fragment);
        if (fragment == null)
        {
            FragmentTransaction ft = fm.beginTransaction();
            fragment =new ManHinh7Fragment();
            ft.add(android.R.id.content, fragment,"myFragmentTag");
            ft.commit();
        }
    }
}
