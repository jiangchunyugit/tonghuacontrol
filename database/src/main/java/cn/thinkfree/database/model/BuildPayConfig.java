package cn.thinkfree.database.model;

import cn.thinkfree.core.model.BaseModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Database Table Remarks:
 *   支付方案表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table build_pay_config
 */
public class BuildPayConfig extends BaseModel {
    /**
     * Database Column Remarks:
     *   支付方案编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column build_pay_config.pay_scheme_no
     *
     * @mbg.generated
     */
    @ApiModelProperty("支付方案编号")
    private String paySchemeNo;

    /**
     * Database Column Remarks:
     *   关联方案编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column build_pay_config.scheme_no
     *
     * @mbg.generated
     */
    @ApiModelProperty("关联方案编号")
    private String schemeNo;

    /**
     * Database Column Remarks:
     *   工程进度名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column build_pay_config.progress_name
     *
     * @mbg.generated
     */
    @ApiModelProperty("工程进度名称")
    private String progressName;

    /**
     * Database Column Remarks:
     *   阶段编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column build_pay_config.stage_code
     *
     * @mbg.generated
     */
    @ApiModelProperty("阶段编码")
    private String stageCode;

    /**
     * Database Column Remarks:
     *   支付超时提醒（小时）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column build_pay_config.pay_time_out
     *
     * @mbg.generated
     */
    @ApiModelProperty("支付超时提醒（小时）")
    private Integer payTimeOut;

    /**
     * Database Column Remarks:
     *   备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column build_pay_config.remark
     *
     * @mbg.generated
     */
    @ApiModelProperty("备注")
    private String remark;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column build_pay_config.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   是否删除，1已删除，2未删除
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column build_pay_config.delete_state
     *
     * @mbg.generated
     */
    private Integer deleteState;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column build_pay_config.pay_scheme_no
     *
     * @return the value of build_pay_config.pay_scheme_no
     *
     * @mbg.generated
     */
    public String getPaySchemeNo() {
        return paySchemeNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column build_pay_config.pay_scheme_no
     *
     * @param paySchemeNo the value for build_pay_config.pay_scheme_no
     *
     * @mbg.generated
     */
    public void setPaySchemeNo(String paySchemeNo) {
        this.paySchemeNo = paySchemeNo == null ? null : paySchemeNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column build_pay_config.scheme_no
     *
     * @return the value of build_pay_config.scheme_no
     *
     * @mbg.generated
     */
    public String getSchemeNo() {
        return schemeNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column build_pay_config.scheme_no
     *
     * @param schemeNo the value for build_pay_config.scheme_no
     *
     * @mbg.generated
     */
    public void setSchemeNo(String schemeNo) {
        this.schemeNo = schemeNo == null ? null : schemeNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column build_pay_config.progress_name
     *
     * @return the value of build_pay_config.progress_name
     *
     * @mbg.generated
     */
    public String getProgressName() {
        return progressName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column build_pay_config.progress_name
     *
     * @param progressName the value for build_pay_config.progress_name
     *
     * @mbg.generated
     */
    public void setProgressName(String progressName) {
        this.progressName = progressName == null ? null : progressName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column build_pay_config.stage_code
     *
     * @return the value of build_pay_config.stage_code
     *
     * @mbg.generated
     */
    public String getStageCode() {
        return stageCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column build_pay_config.stage_code
     *
     * @param stageCode the value for build_pay_config.stage_code
     *
     * @mbg.generated
     */
    public void setStageCode(String stageCode) {
        this.stageCode = stageCode == null ? null : stageCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column build_pay_config.pay_time_out
     *
     * @return the value of build_pay_config.pay_time_out
     *
     * @mbg.generated
     */
    public Integer getPayTimeOut() {
        return payTimeOut;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column build_pay_config.pay_time_out
     *
     * @param payTimeOut the value for build_pay_config.pay_time_out
     *
     * @mbg.generated
     */
    public void setPayTimeOut(Integer payTimeOut) {
        this.payTimeOut = payTimeOut;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column build_pay_config.remark
     *
     * @return the value of build_pay_config.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column build_pay_config.remark
     *
     * @param remark the value for build_pay_config.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column build_pay_config.create_time
     *
     * @return the value of build_pay_config.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column build_pay_config.create_time
     *
     * @param createTime the value for build_pay_config.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column build_pay_config.delete_state
     *
     * @return the value of build_pay_config.delete_state
     *
     * @mbg.generated
     */
    public Integer getDeleteState() {
        return deleteState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column build_pay_config.delete_state
     *
     * @param deleteState the value for build_pay_config.delete_state
     *
     * @mbg.generated
     */
    public void setDeleteState(Integer deleteState) {
        this.deleteState = deleteState;
    }
}