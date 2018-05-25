package com.ngo.ducquang.test.mh6_FinhayDeXuat;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ngo.ducquang.test.R;

import com.ngo.ducquang.test.mh7.SuitableStructureDialog;
import com.xw.repo.BubbleSeekBar;

import java.util.List;

/**
 * Created by ducqu on 5/20/2018.
 */

public class OfferAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
    private final int TYPE_SEEKBAR = 0;
    private final int TYPE_QUESTION = 1;

    private int param = 0;

    private Context context;
    private List<List<AnswerModel>> dataQuestion;
    private FragmentManager fragmentManager;

    public OfferAdapter(int param, Context context, List<List<AnswerModel>> dataQuestion, FragmentManager fragmentManager)
    {
        this.param = param;
        this.context = context;
        this.dataQuestion = dataQuestion;
        this.fragmentManager = fragmentManager;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = null;
        if (viewType == TYPE_SEEKBAR)
        {
            view = inflater.inflate(R.layout.offer_seek_bar, parent, false);
            return new SeekbarHolder(view);
        }
        else if (viewType == TYPE_QUESTION)
        {
            view = inflater.inflate(R.layout.offer_question, parent, false);
            return new QuestionHolder(view);
        }

        throw  new RuntimeException("ko có type nào");
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)
    {
        if (holder instanceof SeekbarHolder)
        {
            SeekbarHolder seekbarHolder = (SeekbarHolder) holder;

            ((SeekbarHolder) holder).bubbleSeekBar.getConfigBuilder()
                    .max(dataQuestion.size() - 1)
                    .min(0)
                    .sectionCount(dataQuestion.size() - 1)
                    .progress(param)
                    .build();

            try
            {
                String textQuestion = dataQuestion.get(param).get(0).getQuestion();
                seekbarHolder.question.setText(textQuestion);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        if (holder instanceof QuestionHolder)
        {
            QuestionHolder questionHolder = (QuestionHolder) holder;

            try
            {
                String textAnswer = dataQuestion.get(param).get(position).getAnswer();
                questionHolder.answer.setText(textAnswer);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int getItemViewType(int position)
    {
        if (position == 0)
        {
            return TYPE_SEEKBAR;
        }
        else
        {
            return TYPE_QUESTION;
        }
    }

    @Override
    public int getItemCount()
    {
        return dataQuestion.get(param).size();
    }

    public class SeekbarHolder extends RecyclerView.ViewHolder
    {
        BubbleSeekBar bubbleSeekBar;
        TextView question;

        public SeekbarHolder(View itemView)
        {
            super(itemView);

            bubbleSeekBar = itemView.findViewById(R.id.bubbleSeekBar);
            question = itemView.findViewById(R.id.question);
        }
    }

    public class QuestionHolder extends RecyclerView.ViewHolder
    {
        TextView answer;

        public QuestionHolder(View itemView)
        {
            super(itemView);

            answer = itemView.findViewById(R.id.answer);

            answer.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    if (param < dataQuestion.size() - 1)
                    {
                        param = param + 1;
                        notifyDataSetChanged();
                    }
                    else
                    {
//                        OfferSucessFragment fragment = (OfferSucessFragment) fragmentManager.findFragmentById(R.id.fragment);
//                        if (fragment == null)
//                        {
//                            FragmentTransaction ft = fragmentManager.beginTransaction();
//                            fragment = new OfferSucessFragment();
//                            ft.replace(android.R.id.content, fragment,"myFragmentTag");
//                            ft.commit();
//                        }

                        SuitableStructureDialog suitableStructureDialog = new SuitableStructureDialog();
                        suitableStructureDialog.show(fragmentManager, suitableStructureDialog.getTag());
                    }
                }
            });
        }
    }
}
