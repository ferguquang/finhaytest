package com.ngo.ducquang.test.mh11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ngo.ducquang.test.R;

public class TestInfoActivity extends AppCompatActivity
{
    private TextView text, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_info);

        text2 = findViewById(R.id.text2);
        text = findViewById(R.id.text);

        text.setText("Kiểm tra thông tin\nchuyển cấu trúc");
        text2.setText("Thay đổi cấu trúc quỹ có thể làm ảnh\nhưởng đến lợi nhuận lâu dài của bạn");
    }
}
