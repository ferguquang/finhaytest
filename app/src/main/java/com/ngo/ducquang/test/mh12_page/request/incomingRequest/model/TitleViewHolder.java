package com.ngo.ducquang.test.mh12_page.request.incomingRequest.model;

import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import com.ngo.ducquang.test.R;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import static android.view.animation.Animation.RELATIVE_TO_SELF;

/**
 * Created by ducqu on 5/31/2018.
 */

public class TitleViewHolder extends GroupViewHolder
{
    TextView titleExpand;
    private ImageView arrow;

    public TitleViewHolder(View itemView) {
        super(itemView);

        titleExpand = itemView.findViewById(R.id.titleExpand);
        arrow = itemView.findViewById(R.id.arrow);
    }

    public void setTitleExpand(ExpandableGroup group)
    {
        if (group instanceof TitleModel)
        {
            titleExpand.setText(group.getTitle());
        }
    }

    @Override
    public void collapse() {
        animateCollapse();
    }

    @Override
    public void expand() {
        animateExpand();
    }

    private void animateExpand() {
        RotateAnimation rotate = new RotateAnimation(360, 180, RELATIVE_TO_SELF, 0.5f, RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(300);
        rotate.setFillAfter(true);
        arrow.setAnimation(rotate);
    }

    private void animateCollapse() {
        RotateAnimation rotate = new RotateAnimation(180, 360, RELATIVE_TO_SELF, 0.5f, RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(300);
        rotate.setFillAfter(true);
        arrow.setAnimation(rotate);
    }
}
