package com.ngo.ducquang.test.mh8;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ngo.ducquang.test.R;
import com.ngo.ducquang.test.mh7.ManHinh7Fragment;

public class ManHinh8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh8);

        FragmentManager fm = getSupportFragmentManager();
        Fragment8 fragment = (Fragment8) fm.findFragmentById(R.id.fragment);
        if (fragment == null)
        {
            FragmentTransaction ft = fm.beginTransaction();
            fragment =new Fragment8();
            ft.add(android.R.id.content, fragment,"myFragmentTag");
            ft.commit();
        }
    }
}
