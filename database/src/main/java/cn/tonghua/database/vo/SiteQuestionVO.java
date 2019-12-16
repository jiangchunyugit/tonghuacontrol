package cn.tonghua.database.vo;

import cn.tonghua.database.model.SiteQuestion;
import cn.tonghua.database.model.UserAnswer;

import java.util.List;

public class SiteQuestionVO extends SiteQuestion {

    private List<QuestionAnswerVO> questionAnswerVOS;

    private List<UserAnswer> userAnswers;

    public List<UserAnswer> getUserAnswers() {
        return userAnswers;
    }

    public void setUserAnswers(List<UserAnswer> userAnswers) {
        this.userAnswers = userAnswers;
    }

    public List<QuestionAnswerVO> getQuestionAnswerVOS() {
        return questionAnswerVOS;
    }

    public void setQuestionAnswerVOS(List<QuestionAnswerVO> questionAnswerVOS) {
        this.questionAnswerVOS = questionAnswerVOS;
    }
}
