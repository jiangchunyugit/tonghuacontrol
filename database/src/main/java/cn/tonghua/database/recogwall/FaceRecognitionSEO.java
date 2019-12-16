package cn.tonghua.database.recogwall;

import cn.tonghua.database.vo.Severitys;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;

public class FaceRecognitionSEO {

    @ApiModelProperty(value="渠道号，999")
    @NotBlank(message = "渠道号不可为空",groups = {Severitys.Insert.class})
    private String channel;

    @ApiModelProperty(value="交易码 默认V001")
    @NotBlank(message = "交易码不可为空",groups = {Severitys.Insert.class})
    private String tradingCode;

    @ApiModelProperty(value="机构号,北京3550，上海3650")
    @NotBlank(message = "机构号不可为空",groups = {Severitys.Insert.class})
    private String orgCode;

    @ApiModelProperty(value="底库编号,1.上海互动墙传SHZT01，2.北京互动墙传BJZT01，跟机构号要对应")
    @NotBlank(message = "底库编码不可为空",groups = {Severitys.Insert.class})
    private String staticDb;

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getTradingCode() {
        return tradingCode;
    }

    public void setTradingCode(String tradingCode) {
        this.tradingCode = tradingCode;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getStaticDb() {
        return staticDb;
    }

    public void setStaticDb(String staticDb) {
        this.staticDb = staticDb;
    }

    public String getSceneImg() {
        return sceneImg;
    }

    public void setSceneImg(String sceneImg) {
        this.sceneImg = sceneImg;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @ApiModelProperty(value="现场照,图片大小小于100K，并且人脸图像清晰，不要出现多人脸情况")
    @NotBlank(message = "照片不可为空",groups = {Severitys.Insert.class})
    private String sceneImg;

    @ApiModelProperty(value="签名:FRS_渠道号（999）_交易码（V001）_IBISVIP,再MD5加密")
    @NotBlank(message = "签名不可为空",groups = {Severitys.Insert.class})
    private String signature;



}
