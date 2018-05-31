package com.ngo.ducquang.test.mh12_page.request;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ngo.ducquang.test.R;
import com.ngo.ducquang.test.base.TabPagerAdapter;
import com.ngo.ducquang.test.mh12_page.request.incomingRequest.IncomingFragment;
import com.ngo.ducquang.test.mh12_page.request.sendRequest.SendFragment;

public class RequestActivity extends AppCompatActivity
{
    private ViewPager viewPager;
    private TabPagerAdapter adapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);

        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);

        adapter = new TabPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new IncomingFragment(), "YÊU CẦU GỬI ĐẾN");
        adapter.addFragment(new SendFragment(), "YÊU CẦU GỬI ĐI");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
