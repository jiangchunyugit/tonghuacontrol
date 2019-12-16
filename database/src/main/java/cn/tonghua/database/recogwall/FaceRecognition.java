package cn.tonghua.database.recogwall;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class FaceRecognition {

    @ApiModelProperty(value="客户信息，只有识别到人才返回这个信息")
    private List<FaceRecognitionCust> data;

    @ApiModelProperty(value="返回码0000成功，其他识别失败")
    private String respCode;

    @ApiModelProperty(value="返回信息")
    private String respDesc;

    public String getRespDesc() {
        return respDesc;
    }

    public void setRespDesc(String respDesc) {
        this.respDesc = respDesc;
    }

    public List<FaceRecognitionCust> getData() {
        return data;
    }

    public void setData(List<FaceRecognitionCust> data) {
        this.data = data;
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }
}
