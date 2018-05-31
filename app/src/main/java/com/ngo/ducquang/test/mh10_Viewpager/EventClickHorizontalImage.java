package com.ngo.ducquang.test.mh10_Viewpager;

/**
 * Created by ducqu on 5/30/2018.
 */

public class EventClickHorizontalImage {
    private int position;

    public EventClickHorizontalImage(int position)
    {
        this.position = position;
    }

    public int getPosition()
    {
        return position;
    }

    public EventClickHorizontalImage setPosition(int position)
    {
        this.position = position;
        return this;
    }
}
