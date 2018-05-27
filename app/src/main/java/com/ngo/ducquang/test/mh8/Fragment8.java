package com.ngo.ducquang.test.mh8;

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
 * Created by ducqu on 5/27/2018.
 */

public class Fragment8 extends Fragment
{
    TextView content;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.man_hinh8_fragment, container, false);
        content = view.findViewById(R.id.content);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        content.setText("Rất nhanh thôi, những nội dung này sẽ được đưa tới bạn.\nCập nhật liên tục về Finhay nhé.");
    }
}
