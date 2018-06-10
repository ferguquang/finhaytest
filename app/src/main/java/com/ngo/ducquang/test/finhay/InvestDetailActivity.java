package com.ngo.ducquang.test.finhay;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.ngo.ducquang.test.R;
import com.ngo.ducquang.test.base.ApiService;
import com.ngo.ducquang.test.base.TabPagerAdapter;
import com.ngo.ducquang.test.callAPI.Customer;
import com.ngo.ducquang.test.callAPI.Data;
import com.ngo.ducquang.test.callAPI.StatusModel;
import com.ngo.ducquang.test.finhay.bank1.BankInfo1;
import com.ngo.ducquang.test.finhay.bank2.BankInfo2;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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

    public void ClickRetrofit(View view) {
        String token = "TWQcG7twae8qMoXkaIg/cq6xzO0qDV87B638gpHW5wgB$a$n$G";
        ApiService.Factory.getInstance().getProject(token, "").enqueue(new Callback<StatusModel>() {
            @Override
            public void onResponse(Call<StatusModel> call, Response<StatusModel> response) {
                Data data = response.body().getData();

                List<Customer> customerList = data.getCustomers();

                Log.d("", "");
            }

            @Override
            public void onFailure(Call<StatusModel> call, Throwable t) {

            }
        });
    }
}
