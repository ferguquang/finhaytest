package com.ngo.ducquang.test.mh5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import com.ngo.ducquang.test.R;

public class DealSuccessActivity extends AppCompatActivity {
    private TextView dealSuccess, backToMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deal_success);

        dealSuccess = findViewById(R.id.dealSuccess);
        backToMain = findViewById(R.id.backToMain);

        String success = "Có thể mất tới" + "<b>" + " 10 ngày " + "</b>" + "để giao dịch hoàn tất.";
        dealSuccess.setText(Html.fromHtml(success));

        backToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
