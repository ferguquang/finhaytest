package com.ngo.ducquang.test.mh12_page.request.incomingRequest.model;

import android.view.View;
import android.widget.TextView;

import com.ngo.ducquang.test.R;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

/**
 * Created by ducqu on 5/31/2018.
 */

public class ContentViewHolder extends ChildViewHolder
{
    private TextView contentExpand;

    public ContentViewHolder(View itemView)
    {
        super(itemView);

        contentExpand = itemView.findViewById(R.id.contentExpand);
    }

    public void setContentExpand(String name) {
        contentExpand.setText(name);
    }
}
