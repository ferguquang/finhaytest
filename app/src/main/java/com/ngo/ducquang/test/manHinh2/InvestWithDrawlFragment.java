package com.ngo.ducquang.test.manHinh2;

import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ngo.ducquang.test.MainActivity;
import com.ngo.ducquang.test.R;
import com.takusemba.spotlight.OnSpotlightStateChangedListener;
import com.takusemba.spotlight.OnTargetStateChangedListener;
import com.takusemba.spotlight.Spotlight;
import com.takusemba.spotlight.shape.Circle;
import com.takusemba.spotlight.target.SimpleTarget;

public class InvestWithDrawlFragment extends Fragment implements View.OnClickListener {
    private CardView cvGroup3, cvGroup2, cvGroup1;
    private TextView timeAgo, number1, number2, text2;
    private ImageView img2;

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
        img2 = view.findViewById(R.id.img2);
        text2 = view.findViewById(R.id.text2);
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
                int[] oneLocation = new int[2];
                number1.getLocationInWindow(oneLocation);
                float oneX = oneLocation[0] + number1.getWidth() / 2f;
                float oneY = oneLocation[1] + number1.getHeight() / 2f;
                // make an target
                SimpleTarget firstTarget = new SimpleTarget.Builder(getActivity()).setPoint(number1)
                        .setShape(new ShapeRec(number1))
                        .setTitle("first title")
                        .setDescription("first description")
                        .build();


                int[] twoLocation = new int[2];
                img2.getLocationInWindow(twoLocation);
                PointF point = new PointF(twoLocation[0] + img2.getWidth() / 2f, twoLocation[1] + img2.getHeight() / 2f);
                // make an target
                SimpleTarget secondTarget = new SimpleTarget.Builder(getActivity()).setPoint(img2)
                        .setShape(new ShapeRec(img2))
                        .setTitle("second title")
                        .setDescription("second description")
                        .setOnSpotlightStartedListener(new OnTargetStateChangedListener<SimpleTarget>() {
                            @Override
                            public void onStarted(SimpleTarget target) {
                                Toast.makeText(getActivity(), "target is started", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onEnded(SimpleTarget target) {
                                Toast.makeText(getActivity(), "target is ended", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .build();

                SimpleTarget thirdTarget = new SimpleTarget.Builder(getActivity()).setPoint(cvGroup2)
                        .setShape(new ShapeRec(cvGroup2))
                        .setTitle("third title")
                        .setDescription("third description")
                        .build();

                Spotlight spotlight = Spotlight.with(getActivity())
                        .setOverlayColor(R.color.colorSpotlight)
                        .setDuration(100L)
                        .setAnimation(new DecelerateInterpolator(2f))
                        .setTargets(firstTarget, secondTarget, thirdTarget)
                        .setClosedOnTouchedOutside(true)
                        .setOnSpotlightStateListener(new OnSpotlightStateChangedListener() {
                            @Override
                            public void onStarted() {
                                Toast.makeText(getContext(), "spotlight is started", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onEnded() {
                                Toast.makeText(getContext(), "spotlight is ended", Toast.LENGTH_SHORT).show();
                            }
                        });

                spotlight.start();
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
