package com.ngo.ducquang.test.mh12_page.request.sendRequest;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ngo.ducquang.test.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by ducqu on 5/31/2018.
 */

public class SendFragment extends Fragment
{
    private SendAdapter adapter;
    private List<SendModel> dataList;
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.send_fragment, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        dataList = new ArrayList<>();
        dataList.add(new SendModel("tên 1", "28-07-2018"));
        dataList.add(new SendModel("tên 2", "29-07-2018"));
        dataList.add(new SendModel("tên 3", "30-07-2018"));
        dataList.add(new SendModel("tên 4", "31-07-2018"));
        dataList.add(new SendModel("tên 5", "28-07-2018"));

        initData();
    }

    public void initData()
    {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());

        adapter = new SendAdapter(getContext(), dataList);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
    }
}
