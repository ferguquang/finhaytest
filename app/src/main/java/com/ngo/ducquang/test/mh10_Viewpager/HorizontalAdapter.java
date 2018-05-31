package com.ngo.ducquang.test.mh10_Viewpager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ngo.ducquang.test.R;
import com.ngo.ducquang.test.base.DrawableHelper;
import com.ngo.ducquang.test.base.EventBusManager;

import java.security.PublicKey;
import java.util.List;

/**
 * Created by ducqu on 5/29/2018.
 */

public class HorizontalAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
    public final int TYPE_THUMB = 0;
    public final int TYPE_STATUS = 1;

    private Context context;
    private List<ViewPagerModel> data;

    public int positionOld = -1;

    public HorizontalAdapter(Context context, List<ViewPagerModel> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = null;

        view  = inflater.inflate(R.layout.content_thumbnails_item, parent, false);
        return new ItemImageHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)
    {
        if (holder instanceof ItemImageHolder)
        {
            ItemImageHolder imageHolder = (ItemImageHolder) holder;

            imageHolder.img_thumb.setImageResource(data.get(position).getIdImage());

            float scale = context.getResources().getDisplayMetrics().density;


            if (data.get(position).isChecked())
            {
//                imageHolder.img_thumb.getLayoutParams().height = 250;
//                imageHolder.img_thumb.getLayoutParams().width = 250;
                int dpWidthInPx  = (int) (60 * scale);
                int dpHeightInPx = (int) (60 * scale);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dpWidthInPx, dpHeightInPx);
                imageHolder.img_thumb.setLayoutParams(layoutParams);
            }
            else
            {
//                imageHolder.img_thumb.getLayoutParams().height = 200;
//                imageHolder.img_thumb.getLayoutParams().width = 200;
                int dpWidthInPx  = (int) (50 * scale);
                int dpHeightInPx = (int) (50 * scale);

                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dpWidthInPx, dpHeightInPx);
                imageHolder.img_thumb.setLayoutParams(layoutParams);
            }

            imageHolder.img_thumb.requestLayout();
        }

        if (holder instanceof TextViewStatusHolder)
        {
            TextViewStatusHolder statusHolder = (TextViewStatusHolder) holder;

            if (data.get(position).isChecked())
            {
                statusHolder.status.setText("Đang hoạt động");
                DrawableHelper.withContext(context).withColor(R.color.colorMain).withDrawable(R.drawable.icon_asset_circle).tint().applyTo(statusHolder.imgStatus);
            }
            else
            {
                statusHolder.status.setText("Chuyển đổi cấu trúc");
                statusHolder.imgStatus.setVisibility(View.GONE);
            }
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ItemImageHolder extends RecyclerView.ViewHolder
    {
        ImageView img_thumb;

        public ItemImageHolder(View itemView)
        {
            super(itemView);
            img_thumb = itemView.findViewById(R.id.img_thumb);

            img_thumb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    int position = getAdapterPosition();
                    if (positionOld >= 0)
                    {
                        data.get(positionOld).setChecked(false);
                    }
                    data.get(position).setChecked(true);
                    positionOld = position;

                    notifyDataSetChanged();

                    EventBusManager.instance().post(new EventClickHorizontalImage(position));
                }
            });
        }
    }

    public class TextViewStatusHolder extends RecyclerView.ViewHolder
    {
        ImageView imgStatus;
        TextView status;
        public TextViewStatusHolder(View itemView) {
            super(itemView);

            status = itemView.findViewById(R.id.status);
            imgStatus = itemView.findViewById(R.id.imgStatus);
        }
    }

    public void updateData(List<ViewPagerModel> data)
    {
        this.data = data;
        notifyDataSetChanged();
    }
}
