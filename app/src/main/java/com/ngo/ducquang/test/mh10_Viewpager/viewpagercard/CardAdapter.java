package com.ngo.ducquang.test.mh10_Viewpager.viewpagercard;

import android.support.v7.widget.CardView;

/**
 * Created by ducqu on 5/29/2018.
 */

public interface CardAdapter
{
    int MAX_ELEVATION_FACTOR = 8;

    float getBaseElevation();

    CardView getCardViewAt(int position);

    int getCount();
}
