package com.ngo.ducquang.test.mh12_page.request.incomingRequest.model;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ngo.ducquang.test.R;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

/**
 * Created by ducqu on 5/31/2018.
 */

public class ContentViewHolder extends ChildViewHolder
{
    private TextView contentExpand, name, time, status, manager;
    private LinearLayout llStatus;

    public ContentViewHolder(View itemView)
    {
        super(itemView);

        contentExpand = itemView.findViewById(R.id.contentExpand);
        name = itemView.findViewById(R.id.name);
        time = itemView.findViewById(R.id.time);
        status = itemView.findViewById(R.id.status);
        manager = itemView.findViewById(R.id.manager);
        llStatus = itemView.findViewById(R.id.llStatus);
    }

    public void binding(Context context, ContentModel contentModel)
    {
        name.setText(contentModel.getName());
        contentExpand.setText(contentModel.getContent());
        time.setText(contentModel.getTime());
        if (contentModel.getStatus().equals("0"))
        {
            status.setText("Đã hoàn thành");
            llStatus.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.boder_coner));
        }
        else if (contentModel.getStatus().equals("1"))
        {
            status.setText("Chưa trả lời");
            llStatus.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.boder_coner_cho));
        }
        else
        {
            status.setText("Đã quá hạn");
            llStatus.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.boder_coner_huy));
        }

        manager.setText(contentModel.getManager());
    }
}
