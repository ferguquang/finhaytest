package com.ngo.ducquang.test.manHinh2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ngo.ducquang.test.R;

public class InvestWithDrawlFragment extends Fragment implements View.OnClickListener {
    private CardView cvGroup3;
    private CardView cvGroup2;
    private CardView cvGroup1;
    private TextView timeAgo;
    private TextView number1;
    private TextView number2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_invest_with_drawal, container, false);
        cvGroup1 = view.findViewById(R.id.cvGroup1);
        cvGroup2 = view.findViewById(R.id.cvGroup2);
        cvGroup3 = view.findViewById(R.id.cvGroup3);
        timeAgo = view.findViewById(R.id.timeAgo);
        number1 = view.findViewById(R.id.number1);
        number2 = view.findViewById(R.id.number2);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        cvGroup1.setOnClickListener(this);
        cvGroup2.setOnClickListener(this);
        cvGroup3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.cvGroup1:
            {

                break;
            }
            case R.id.cvGroup2:
            {

                break;
            }
            case R.id.cvGroup3:
            {

                break;
            }
        }
    }
}
