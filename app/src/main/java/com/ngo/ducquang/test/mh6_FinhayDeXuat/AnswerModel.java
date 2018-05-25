package com.ngo.ducquang.test.mh6_FinhayDeXuat;

/**
 * Created by ducqu on 5/21/2018.
 */

public class AnswerModel
{
    private String answer;
    private String question;

    public AnswerModel() {
    }

    public AnswerModel(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
