package com.ngo.ducquang.test.mh9;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ngo.ducquang.test.R;

public class ManHinhGrabActivity extends AppCompatActivity
{
    TextView countDown, numberKM, point;
    RelativeLayout acceptJob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_grab);

        countDown = findViewById(R.id.countDown);
        numberKM = findViewById(R.id.numberKM);
        point = findViewById(R.id.point);
        acceptJob = findViewById(R.id.acceptJob);

        new CountDownTimer(30000, 1000)
        {
            public void onTick(long millisUntilFinished)
            {
                countDown.setText("" + millisUntilFinished / 1000);
            }

            public void onFinish()
            {
                finish();
            }
        }.start();
    }
}
