package com.ngo.ducquang.test.mh6_FinhayDeXuat;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ngo.ducquang.test.R;

/**
 * Created by ducqu on 5/22/2018.
 */

public class OfferSucessFragment extends Fragment
{
    private TextView backToMain, textResult, textContentResult, dealSuccess;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_deal_success, container, false);
        textContentResult = view.findViewById(R.id.textContentResult);
        backToMain = view.findViewById(R.id.backToMain);
        textResult = view.findViewById(R.id.textResult);
        dealSuccess = view.findViewById(R.id.dealSuccess);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        dealSuccess.setVisibility(View.GONE);

        String content = "Bạn đã trở thành một nhà đầu tư đúng nghĩa!\nFinhay sẽ đề xuất cấu trúc đầu tư phù hợp sau khi đánh giá mức độ nhận rủi ro của bạn.";
        textContentResult.setText(content);
        backToMain.setText("Xác định khẩu vị rủi ro");

        backToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
