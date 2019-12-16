package cn.tonghua.service.question;

import cn.tonghua.database.model.UserAnswer;

import java.util.List;

public interface QuestionService {

    boolean questionAnswer(List<UserAnswer> userAnswers);
}
