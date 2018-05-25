package com.ngo.ducquang.test.manhinh3;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ngo.ducquang.test.R;
import com.ngo.ducquang.test.base.DrawableHelper;

import java.util.List;

public class InvestHistoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
    private final int TYPE_ITEM = 1;

    private Context context;
    private List<InvestHistoryModel> dataList;

    public InvestHistoryAdapter(Context context, List<InvestHistoryModel> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = null;
        if (viewType == TYPE_ITEM)
        {
            itemView = inflater.inflate(R.layout.item_history_deal, parent, false);
            return new RecyclerViewHolder(itemView);
        }

        throw new RuntimeException("k có type này " + viewType);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof RecyclerViewHolder)
        {
            RecyclerViewHolder itemHolder = (RecyclerViewHolder) holder;

            InvestHistoryModel investHistoryModel = dataList.get(position);

            itemHolder.time.setText(investHistoryModel.getTime());
            itemHolder.actionName.setText(investHistoryModel.getActionName());
            itemHolder.money.setText(investHistoryModel.getMoney());

            // set màu cho chữ, icon hình tròn
            if (investHistoryModel.getStatus() == 0)
            {
                // hoàn thành
                setColorCircle(R.color.colorMain, itemHolder.status);
            }
            else if (investHistoryModel.getStatus() == 1)
            {
                // đang xử lý
                setColorCircle(R.color.mauCam, itemHolder.status);
            }
            else {
                // đã hủy
                setColorCircle(R.color.red, itemHolder.status);
            }

            if (position %2 == 0)
            {
                itemHolder.llItemHistory.setBackgroundColor(context.getResources().getColor(R.color.white));
            }
            else
            {
                itemHolder.llItemHistory.setBackgroundColor(context.getResources().getColor(R.color.bgMH2));
            }
        }
    }

    @Override
    public int getItemViewType(int position) {
        return TYPE_ITEM;
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder
    {
        TextView time, actionName, money;
        ImageView status;
        LinearLayout llItemHistory;

        public RecyclerViewHolder(View itemView) {
            super(itemView);

            time = itemView.findViewById(R.id.time);
            actionName = itemView.findViewById(R.id.actionName);
            status = itemView.findViewById(R.id.status);
            money = itemView.findViewById(R.id.money);
            llItemHistory = itemView.findViewById(R.id.llItemHistory);
        }
    }

    private void setColorCircle(int color, ImageView imageView)
    {
        DrawableHelper.withContext(context).withColor(color).withDrawable(R.drawable.icon_asset_circle).tint().applyTo(imageView);
    }

}
