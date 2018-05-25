package com.ngo.ducquang.test.base;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/**
 * Created by ducqu on 5/25/2018.
 */

public class AnimationCustom {

    public static void expand(final View v)
    {
        v.measure(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        final int targetHeight = v.getMeasuredHeight();

        // Older versions of android (pre API 21) cancel animations for views with a height of 0.
        v.getLayoutParams().height = 1;
        v.setVisibility(View.VISIBLE);
        Animation a = new Animation()
        {
            @Override
            protected void applyTransformation(float interpolatedTime, Transformation t)
            {
                v.getLayoutParams().height = interpolatedTime == 1
                        ? ViewGroup.LayoutParams.WRAP_CONTENT
                        : (int)(targetHeight * interpolatedTime);
                v.requestLayout();
            }

            @Override
            public boolean willChangeBounds()
            {
                return true;
            }
        };

        // 1dp/ms
        int duration = (int)(targetHeight / v.getContext().getResources().getDisplayMetrics().density) + 500;
        a.setDuration(duration);
        v.startAnimation(a);
    }

    public static void collapse(final View v)
    {
        final int initialHeight = v.getMeasuredHeight();

        Animation a = new Animation()
        {
            @Override
            protected void applyTransformation(float interpolatedTime, Transformation t)
            {
                if(interpolatedTime == 1)
                {
                    v.setVisibility(View.GONE);
                }
                else
                {
                    v.getLayoutParams().height = initialHeight - (int)(initialHeight * interpolatedTime);
                    v.requestLayout();
                }
            }

            @Override
            public boolean willChangeBounds()
            {
                return true;
            }
        };

        // 1dp/ms
        int duration = (int)(initialHeight / v.getContext().getResources().getDisplayMetrics().density) + 500;
        a.setDuration(duration);
        v.startAnimation(a);
    }
}