package com.ngo.ducquang.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ngo.ducquang.test.finhay.InvestDetailActivity;
import com.ngo.ducquang.test.manHinh2.InvestWithdrawalActivity;
import com.ngo.ducquang.test.manhinh3.InvestHistoryActivity;
import com.ngo.ducquang.test.mh10_Viewpager.ViewPagerActivity;
import com.ngo.ducquang.test.mh11.TestInfoActivity;
import com.ngo.ducquang.test.mh12_page.LoginActivity;
import com.ngo.ducquang.test.mh12_page.request.RequestActivity;
import com.ngo.ducquang.test.mh4.CheckInfoActivity;
import com.ngo.ducquang.test.mh5.DealSuccessActivity;
import com.ngo.ducquang.test.mh6_FinhayDeXuat.FinhayOfferActivity;
import com.ngo.ducquang.test.mh7.ManHinh7Activity;
import com.ngo.ducquang.test.mh8.ManHinh8Activity;
import com.ngo.ducquang.test.mh9.ManHinhGrabActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ClickFinhay(View view) {
        startActivity(new Intent(this, InvestDetailActivity.class));
    }

    public void ClickMH2(View view) {
        startActivity(new Intent(this, InvestWithdrawalActivity.class));
    }

    public void ClickMH3(View view) {
        startActivity(new Intent(this, InvestHistoryActivity.class));
    }

    public void ClickMH4(View view) {
        startActivity(new Intent(this, CheckInfoActivity.class));
    }

    public void ClickMH5(View view) {
        startActivity(new Intent(this, DealSuccessActivity.class));
    }

    public void ClickMH6DeXuat(View view) {
        startActivity(new Intent(this, FinhayOfferActivity.class));
    }

    public void ClickMH7(View view) {
        startActivity(new Intent(this, ManHinh7Activity.class));
    }

    public void ClickMH8(View view) {
        startActivity(new Intent(this, ManHinh8Activity.class));
    }

    public void ClickMH9(View view) {
        startActivity(new Intent(this, ManHinhGrabActivity.class));
    }

    public void ClickMHViewPager(View view) {
        startActivity(new Intent(this, ViewPagerActivity.class));
    }

    public void ClickMH11(View view) {
        startActivity(new Intent(this, TestInfoActivity.class));
    }

    public void ClickMH12(View view) {
        startActivity(new Intent(this, LoginActivity.class));
    }
}
