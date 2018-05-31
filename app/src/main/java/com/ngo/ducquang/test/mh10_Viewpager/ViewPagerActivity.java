package com.ngo.ducquang.test.mh10_Viewpager;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ngo.ducquang.test.R;
import com.ngo.ducquang.test.base.DrawableHelper;
import com.ngo.ducquang.test.base.EventBusManager;
import com.ngo.ducquang.test.base.Manager;
import com.ngo.ducquang.test.mh10_Viewpager.customViewPagerScroll.ViewPagerCustomDuration;
import com.ngo.ducquang.test.mh10_Viewpager.viewpagercard.CardViewPagerActivity;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerActivity extends AppCompatActivity
{
    private RecyclerView recylerViewHoriziontal;
    private ViewPagerCustomDuration viewPager;
    private ViewPagerAdapter viewPagerAdapter;
    private List<ViewPagerModel> dataList = new ArrayList<>();
    private HorizontalAdapter horizontalAdapter;

    private ImageView imgStatus;
    private TextView status;
    private LinearLayout llStatus;

    private int positionOld = -1;

    private SubcriberViewPager subcriberViewPager = new SubcriberViewPager()
    {
        @Override
        @Subscribe(threadMode = ThreadMode.MAIN)
        public void onClickHorizontalImage(EventClickHorizontalImage event) {
            viewPager.setCurrentItem(event.getPosition());
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        viewPager = findViewById(R.id.viewPager);
        recylerViewHoriziontal = findViewById(R.id.recylerViewHoriziontal);
        status = findViewById(R.id.status);
        imgStatus = findViewById(R.id.imgStatus);
        llStatus = findViewById(R.id.llStatus);

        addData();

        viewPagerAdapter = new ViewPagerAdapter(getApplicationContext(), dataList, viewPager);

        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setPageMargin(64);
        viewPager.setOffscreenPageLimit(3);

        // recyclerview horizontal
        LinearLayoutManager layoutManager = new LinearLayoutManager(getBaseContext());
        horizontalAdapter = new HorizontalAdapter(getBaseContext(), dataList);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        layoutManager.setReverseLayout(false);
        recylerViewHoriziontal.setLayoutManager(layoutManager);
        recylerViewHoriziontal.setHasFixedSize(true);
        recylerViewHoriziontal.setAdapter(horizontalAdapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener()
        {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels)
            {
                if (positionOld >= 0)
                {
                    dataList.get(positionOld).setChecked(false);
                }

                dataList.get(position).setChecked(true);
                positionOld = position;

                horizontalAdapter.updateData(dataList);
//
//                recylerViewHoriziontal.scrollToPosition(position);

                if (position == 2)
                {
                    status.setText("Chuyển đổi cấu trúc");
                    status.setTextColor(getResources().getColor(R.color.white));
                    imgStatus.setVisibility(View.GONE);
                    llStatus.setBackgroundDrawable(getResources().getDrawable(R.drawable.back_ground_main_button));
                }
                else
                {
                    status.setText("Đang hoạt động");
                    status.setTextColor(getResources().getColor(R.color.colorMain));
                    DrawableHelper.withContext(getApplicationContext()).withColor(R.color.colorMain).withDrawable(R.drawable.icon_asset_circle).tint().applyTo(imgStatus);
                    imgStatus.setVisibility(View.VISIBLE);
                    llStatus.setBackgroundDrawable(getResources().getDrawable(R.drawable.bg_color_main_text_view));
                }

                Manager.setPaddingView(getApplicationContext(), llStatus, 48, 8, 48, 8);
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        viewPager.setScrollDurationFactor(2);

        status.setText("Chuyển đổi cấu trúc");
        status.setTextColor(getResources().getColor(R.color.white));
        imgStatus.setVisibility(View.GONE);
        llStatus.setBackgroundDrawable(getResources().getDrawable(R.drawable.back_ground_main_button));
    }


    private void addData()
    {
        dataList.add(new ViewPagerModel(R.drawable.ic_co_trang, "Rùa Hoàn Kiếm", "Bảo toàn"));
        dataList.add(new ViewPagerModel(R.drawable.ic_creative, "Cò trắng", "An toàn"));
        dataList.add(new ViewPagerModel(R.drawable.ic_group_1, "Voi rừng", "Cân bằng"));
        dataList.add(new ViewPagerModel(R.drawable.ic_group_2, "Sao La", "Mạo hiểm"));
        dataList.add(new ViewPagerModel(R.drawable.ic_icon_bank, "Trâu nước", "Rất mạo hiểm"));
    }

    public void ClickViewPagerCard(View view) {
        startActivity(new Intent(this, CardViewPagerActivity.class));
    }

    @Override
    protected void onStart() {
        super.onStart();
        EventBusManager.instance().register(subcriberViewPager);
    }

    @Override
    protected void onStop() {
        super.onStop();
        EventBusManager.instance().unregister(subcriberViewPager);
    }
}
