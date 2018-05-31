package com.ngo.ducquang.test.mh12_page.request.incomingRequest.model;

import android.os.Parcel;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

/**
 * Created by ducqu on 5/31/2018.
 */

public class TitleModel extends ExpandableGroup<ContentModel> {
    private String title;

    public TitleModel(String title, List<ContentModel> items) {
        super(title, items);
    }

    protected TitleModel(Parcel in) {
        super(in);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
