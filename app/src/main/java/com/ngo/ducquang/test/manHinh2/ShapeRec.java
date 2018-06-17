package com.ngo.ducquang.test.manHinh2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.View;

import com.takusemba.spotlight.shape.Shape;

/**
 * Created by ducqu on 6/7/2018.
 */

public class ShapeRec implements Shape {
    private View view;

    public ShapeRec(View view) {
        this.view = view;
    }

    @Override
    public void draw(Canvas canvas, PointF point, float value, Paint paint) {
        float left = view.getLeft();
        float top = view.getTop();
        float right = view.getRight();
        float bottom = view.getBottom();
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(0);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawRect(30, 50, 200, 350, paint);
    }

    @Override
    public int getHeight() {
        return view.getHeight();
    }

    @Override
    public int getWidth() {
        return view.getWidth();
    }
}
