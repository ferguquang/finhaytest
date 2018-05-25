package com.ngo.ducquang.test.manhinh3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.ngo.ducquang.test.R;
import com.ngo.ducquang.test.base.DrawableHelper;

import java.util.ArrayList;
import java.util.List;

public class InvestHistoryActivity extends AppCompatActivity
{
    private RecyclerView recyclerView;
    private InvestHistoryAdapter investHistoryAdapter;
    private List<InvestHistoryModel> data;
    private ImageView ic_status3, ic_status2, ic_status1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invest_history);

        recyclerView = findViewById(R.id.recylerView);
        ic_status3 = findViewById(R.id.ic_status3);
        ic_status2 = findViewById(R.id.ic_status2);
        ic_status1 = findViewById(R.id.ic_status1);

        initData();
        setColorIconStatus();
    }

    private void setColorIconStatus() {
        DrawableHelper.withContext(getApplicationContext()).withColor(R.color.colorMain).withDrawable(R.drawable.icon_asset_circle).tint().applyTo(ic_status1);
        DrawableHelper.withContext(getApplicationContext()).withColor(R.color.mauCam).withDrawable(R.drawable.icon_asset_circle).tint().applyTo(ic_status2);
        DrawableHelper.withContext(getApplicationContext()).withColor(R.color.red).withDrawable(R.drawable.icon_asset_circle).tint().applyTo(ic_status3);
    }

    private List<InvestHistoryModel> dataList()
    {
        data = new ArrayList<>();
        data.add(new InvestHistoryModel("15/05.2018", "Đầu tư thêm", "10", 0));
        data.add(new InvestHistoryModel("15/05.2018", "Đầu tư thêm 2", "32456442", 1));
        data.add(new InvestHistoryModel("15/05.2018", "Đầu tư thêm 3", "32120442", 2));
        data.add(new InvestHistoryModel("15/05.2018", "Đầu tư thêm 4", "1254", 0));
        data.add(new InvestHistoryModel("15/05.2018", "Đầu tư thêm 4", "1254", 2));
        data.add(new InvestHistoryModel("15/05.2018", "Đầu tư thêm 4", "1254", 2));
        data.add(new InvestHistoryModel("15/05.2018", "Đầu tư thêm 4", "1254", 2));
        data.add(new InvestHistoryModel("15/05.2018", "Đầu tư thêm 4", "1254", 0));
        data.add(new InvestHistoryModel("15/05.2018", "Đầu tư thêm 4", "1254", 0));
        data.add(new InvestHistoryModel("15/05.2018", "Đầu tư thêm 4", "1254", 1));
        data.add(new InvestHistoryModel("15/05.2018", "Đầu tư thêm 4", "1254", 0));
        data.add(new InvestHistoryModel("15/05.2018", "Đầu tư thêm 4", "1254", 1));
        data.add(new InvestHistoryModel("15/05.2018", "Đầu tư thêm 4", "1254", 0));
        data.add(new InvestHistoryModel("15/05.2018", "Đầu tư thêm 4", "1254", 1));
        data.add(new InvestHistoryModel("15/05.2018", "Đầu tư thêm 4", "1254", 0));
        data.add(new InvestHistoryModel("15/05.2018", "Đầu tư thêm 4", "1254", 1));
        return data;
    }

    public void initData()
    {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        investHistoryAdapter = new InvestHistoryAdapter(getApplicationContext(), dataList());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(investHistoryAdapter);
    }
}
