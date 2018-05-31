package com.ngo.ducquang.test.mh12_page;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ngo.ducquang.test.R;
import com.ngo.ducquang.test.mh12_page.request.RequestActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void ClickLogin(View view) {
        startActivity(new Intent(this, RequestActivity.class));
    }
}
