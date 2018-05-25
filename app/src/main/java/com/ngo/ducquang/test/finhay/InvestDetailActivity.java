package com.ngo.ducquang.test.finhay;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.ngo.ducquang.test.R;
import com.ngo.ducquang.test.base.TabPagerAdapter;
import com.ngo.ducquang.test.finhay.bank1.BankInfo1;
import com.ngo.ducquang.test.finhay.bank2.BankInfo2;

public class InvestDetailActivity extends AppCompatActivity
{
    private ViewPager viewPager;
    private TabLayout tabLayout;

    private TabPagerAdapter tabPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invest_detail);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        tabPagerAdapter = new TabPagerAdapter(getSupportFragmentManager());
        tabPagerAdapter.addFragment(new BankInfo1(), "Vietcombank");
        tabPagerAdapter.addFragment(new BankInfo2(), "MBBank");

        viewPager.setAdapter(tabPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
