package com.ngo.ducquang.test.base;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by ducqu on 5/30/2018.
 */

public class Manager {
    public static void setWidthHeightView(Context context, int width, int height, View view)
    {
        float scale = context.getResources().getDisplayMetrics().density;
        int dpWidthInPx  = (int) (width * scale);
        int dpHeightInPx = (int) (height * scale);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dpWidthInPx, dpHeightInPx);
        view.setLayoutParams(layoutParams);
    }

    public static void setPaddingView(Context context, View view, int left, int top, int right, int bottom)
    {
        float scale = context.getResources().getDisplayMetrics().density;
        int dpLeft  = (int) (left * scale);
        int dpTop = (int) (top * scale);
        int dpRight = (int) (right * scale);
        int dpBottom = (int) (bottom * scale);

        view.setPadding(dpLeft, dpTop, dpRight, dpBottom);
    }
}
