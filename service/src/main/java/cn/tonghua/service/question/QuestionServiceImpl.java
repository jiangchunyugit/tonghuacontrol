package cn.tonghua.service.question;

import cn.tonghua.database.mapper.UserAnswerMapper;
import cn.tonghua.database.model.UserAnswer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    UserAnswerMapper userAnswerMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean questionAnswer(List<UserAnswer> userAnswers) {

        if (userAnswers!= null && userAnswers.size() >0) {

            Date today = new Date();
            userAnswers.forEach(e ->{
                e.setCreateTime(today);
                userAnswerMapper.insertSelective(e);
            });
            return true;
        }
        return false;
    }
}
