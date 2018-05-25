package com.ngo.ducquang.test.mh6_FinhayDeXuat.seekbar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ProgressBar;

/**
 * Created by ducqu on 5/22/2018.
 */

public class ProgressBarAnimation extends Animation {
    private ProgressBar mProgressBar;
    private float       mFrom;
    private float       mTo;

    public ProgressBarAnimation(final ProgressBar progressBar, final float from, final float to) {
        super();
        this.mProgressBar = progressBar;
        this.mFrom = from;
        this.mTo = to;
    }

    @Override
    protected void applyTransformation(final float interpolatedTime, final Transformation t) {
        super.applyTransformation(interpolatedTime, t);
        float value = mFrom + (mTo - mFrom) * interpolatedTime;
        mProgressBar.setProgress((int) value);
    }
}
