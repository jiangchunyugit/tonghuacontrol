package cn.tonghua.database.vo;

import cn.tonghua.database.model.UserAnswer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@ApiModel("答案信息")
public class AnswerVO {

    @ApiModelProperty("答案list")
    @NotEmpty(message = "答案list不可为空",groups = {Severitys.Insert.class})
    private List<UserAnswer> answerList;

    public List<UserAnswer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<UserAnswer> answerList) {
        this.answerList = answerList;
    }
}
