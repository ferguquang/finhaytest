package com.ngo.ducquang.test.mh12_page.request.incomingRequest;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ngo.ducquang.test.R;
import com.ngo.ducquang.test.mh12_page.request.incomingRequest.model.ContentModel;
import com.ngo.ducquang.test.mh12_page.request.incomingRequest.model.TitleModel;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ducqu on 5/31/2018.
 */

public class IncomingFragment extends Fragment
{

    private RecyclerView recyclerView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.incoming_fragment, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        List<TitleModel> list = getTitle();

        RecyclerView.ItemAnimator animator = recyclerView.getItemAnimator();
        if (animator instanceof DefaultItemAnimator) {
            ((DefaultItemAnimator) animator).setSupportsChangeAnimations(false);
        }

        ExpandAdapter adapter  = new ExpandAdapter(list);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    public List<TitleModel> getTitle()
    {
        return Arrays.asList(getTitle1(),
                getTitle2());
    }

    public TitleModel getTitle1()
    {
        return new TitleModel("Chưa xử lý", makeContent());
    }

    public List<ContentModel> makeContent()
    {
        ContentModel model1 = new ContentModel("content 1");
        ContentModel model2 = new ContentModel("content 2");
        ContentModel model3 = new ContentModel("content 3");
        ContentModel model4 = new ContentModel("content 4");

        return Arrays.asList(model1, model2, model3, model4);
    }

    public TitleModel getTitle2()
    {
        return new TitleModel("Hoàn thành", makeContent2());
    }

    public List<ContentModel> makeContent2()
    {
        ContentModel model1 = new ContentModel("content 1");
        ContentModel model2 = new ContentModel("content 2");
        ContentModel model3 = new ContentModel("content 3");
        ContentModel model4 = new ContentModel("content 4");
        return Arrays.asList(model1, model2, model3, model4);
    }
}
