package cn.tonghua.database.recogwall;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

public class FaceRecognitionCust {

    @ApiModelProperty(value="客户号")
    private String custNo;

    @ApiModelProperty(value="人脸识别准确率（用不到这个字段）")
    private BigDecimal score;

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }
}
