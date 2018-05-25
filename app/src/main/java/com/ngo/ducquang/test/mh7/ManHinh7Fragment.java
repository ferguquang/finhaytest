package com.ngo.ducquang.test.mh7;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.ngo.ducquang.test.R;
import com.ngo.ducquang.test.base.AnimationCustom;
import com.ngo.ducquang.test.base.DrawableHelper;

/**
 * Created by ducqu on 5/24/2018.
 */

public class ManHinh7Fragment extends Fragment implements View.OnClickListener
{
    private RelativeLayout rll1, rll2, rll3;
    private TextView nameAnimal, status, content;
    private ImageView imgAnimal, assetCircle, expand, collapse;
    private LinearLayout function;
    private ScrollView scrollView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.man_hinh7_fragment, container, false);
        rll1 = view.findViewById(R.id.rll1);
        rll2 = view.findViewById(R.id.rll2);
        rll3 = view.findViewById(R.id.rll3);
        nameAnimal = view.findViewById(R.id.nameAnimal);
        status = view.findViewById(R.id.status);
        content = view.findViewById(R.id.content);
        imgAnimal = view.findViewById(R.id.imgAnimal);
        assetCircle = view.findViewById(R.id.assetCircle);
        expand = view.findViewById(R.id.expand);
        collapse = view.findViewById(R.id.collapse);
        function = view.findViewById(R.id.function);
        scrollView = view.findViewById(R.id.scrollView);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        rll1.setOnClickListener(this);
        expand.setOnClickListener(this);
        collapse.setOnClickListener(this);
        DrawableHelper.withContext(getContext()).withColor(R.color.colorMain).withDrawable(R.drawable.icon_asset_circle).tint().applyTo(assetCircle);

        AnimationCustom.collapse(function);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.rll1:
            {
                SuitableStructureDialog dialog = new SuitableStructureDialog();
                dialog.show(getFragmentManager(), dialog.getTag());
                break;
            }
            case R.id.expand:
            {
                AnimationCustom.expand(function);
                collapse.setVisibility(View.VISIBLE);
                expand.setVisibility(View.GONE);

                scrollView.postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        scrollView.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 700);
                break;
            }
            case R.id.collapse:
            {
                AnimationCustom.collapse(function);
                collapse.setVisibility(View.GONE);
                expand.setVisibility(View.VISIBLE);
                break;
            }
        }
    }
}
