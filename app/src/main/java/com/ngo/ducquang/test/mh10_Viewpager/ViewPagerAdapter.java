package com.ngo.ducquang.test.mh10_Viewpager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ngo.ducquang.test.R;

import java.util.List;

/**
 * Created by ducqu on 5/29/2018.
 */

public class ViewPagerAdapter extends PagerAdapter
{
    private ViewPager viewPager;
    private Context context;
    private List<ViewPagerModel> modelList;

    public ViewPagerAdapter(Context context, List<ViewPagerModel> modelList, ViewPager viewPager) {
        this.context = context;
        this.modelList = modelList;
        this.viewPager = viewPager;
    }

    @Override
    public int getCount() {
        return modelList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position)
    {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View viewLayout = inflater.inflate(R.layout.item_viewpager, null);

        TextView nameAnimal = viewLayout.findViewById(R.id.nameAnimal);
        TextView contentAnimal = viewLayout.findViewById(R.id.contentAnimal);
        ImageView imgAnimal = viewLayout.findViewById(R.id.imgAnimal);

        ViewPagerModel model = modelList.get(position);

        nameAnimal.setText(model.getNameAnimal());
        contentAnimal.setText(model.getContentAnimal());
        imgAnimal.setImageResource(model.getIdImage());

//        if (position == 0)
//        {
//            viewPager.setPadding(32, 0, 120, 0);
//        }
//        else if (position > 0 && position < modelList.size())
//        {
//            viewPager.setPadding(120, 0, 120, 0);
//        }
//        else if (position == modelList.size())
//        {
//            viewPager.setPadding(120, 0, 32, 0);
//        }

        ViewPager vp = (ViewPager) container;
        vp.addView(viewLayout, 0);

        return viewLayout;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object)
    {
        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }
}
