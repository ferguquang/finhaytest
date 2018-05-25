package com.ngo.ducquang.test.mh4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ngo.ducquang.test.R;

public class CheckInfoActivity extends AppCompatActivity
{
    private LinearLayout llOK;
    private TextView moneyNumber, feeMoney, receivedMoney, numberAccount, nameAccount, nameBank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_info);

        llOK = findViewById(R.id.llOK);
        moneyNumber = findViewById(R.id.moneyNumber);
        feeMoney = findViewById(R.id.feeMoney);
        receivedMoney = findViewById(R.id.receivedMoney);
        numberAccount = findViewById(R.id.numberAccount);
        nameAccount = findViewById(R.id.nameAccount);
        nameBank = findViewById(R.id.nameBank);

        llOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
