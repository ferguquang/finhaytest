package com.ngo.ducquang.test.mh6_FinhayDeXuat;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ngo.ducquang.test.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ducqu on 5/20/2018.
 */

public class FinhayOfferFragment extends Fragment
{
    private RecyclerView recyclerView;
    private OfferAdapter adapter;

    List<List<AnswerModel>> listOfList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_finhay_offer, container, false);
        recyclerView = view.findViewById(R.id.recylerView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        getData();
        initData();
    }

    private void getData()
    {
        listOfList = new ArrayList<>();

        List<AnswerModel> answer1 = new ArrayList<>();
        AnswerModel question1 = new AnswerModel();
        question1.setQuestion("Độ tuổi của bạn?");
        answer1.add(question1);
        answer1.add(new AnswerModel("Trên 55 tuổi"));
        answer1.add(new AnswerModel("41 - 55 tuổi"));
        answer1.add(new AnswerModel("26 - 40 tuổi"));
        answer1.add(new AnswerModel("18 - 25 tuổi"));
        listOfList.add(answer1);

        List<AnswerModel> answer2 = new ArrayList<>();
        AnswerModel question2 = new AnswerModel();
        question2.setQuestion("Thao bạn dài hạn là bao nhiêu năm?");
        answer2.add(question2);
        answer2.add(new AnswerModel("1 - 2 năm"));
        answer2.add(new AnswerModel("3 - 4 năm"));
        answer2.add(new AnswerModel("5 - 8 năm"));
        answer2.add(new AnswerModel("trên 8 năm"));
        listOfList.add(answer2);

        List<AnswerModel> answer3 = new ArrayList<>();
        AnswerModel question3 = new AnswerModel();
        question3.setQuestion("Kiến thức đầu tư của bạn thuộc diện nào?");
        answer3.add(question3);
        answer3.add(new AnswerModel("Không biết gì"));
        answer3.add(new AnswerModel("Biết một chút"));
        answer3.add(new AnswerModel("Vừa đủ"));
        answer3.add(new AnswerModel("Tự tin"));
        listOfList.add(answer3);

        List<AnswerModel> answer4 = new ArrayList<>();
        AnswerModel question4 = new AnswerModel();
        question4.setQuestion("Đời sống tình cảm của bạn");
        answer4.add(question4);
        answer4.add(new AnswerModel("Có gia đình và con cái"));
        answer4.add(new AnswerModel("Có gia đình nhưng chưa có con"));
        answer4.add(new AnswerModel("Có người yêu"));
        answer4.add(new AnswerModel("Cô đơn"));
        listOfList.add(answer4);

        List<AnswerModel> answer5 = new ArrayList<>();
        AnswerModel question5 = new AnswerModel();
        question5.setQuestion("Nếu một ngày thị trường giảm 10% giá trị tài sản ròng của bạn, bạn sẽ làm gì?");
        answer5.add(question5);
        answer5.add(new AnswerModel("Rút tiền về thật nhanh"));
        answer5.add(new AnswerModel("Không làm gì vì mục tiêu đầu tư của mình là dài hạn"));
        answer5.add(new AnswerModel("Đầu tư thêm vì giá mua đang rẻ"));
        listOfList.add(answer5);
    }

    public void initData()
    {
        int size = listOfList.get(0).size();
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        adapter = new OfferAdapter(0, getContext(), listOfList, getFragmentManager());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }
}
