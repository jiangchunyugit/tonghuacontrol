package cn.thinkfree.database.model;

import cn.thinkfree.core.model.BaseModel;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table approval_flow_log
 */
public class ApprovalFlowLog extends BaseModel {
    /**
     * Database Column Remarks:
     *   主键ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approval_flow_log.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   审批数据内容
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approval_flow_log.approval_flow_content
     *
     * @mbg.generated
     */
    private String approvalFlowContent;

    /**
     * Database Column Remarks:
     *   对应审批节点编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approval_flow_log.node_num
     *
     * @mbg.generated
     */
    private String nodeNum;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approval_flow_log.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   创建者userId
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approval_flow_log.create_user_id
     *
     * @mbg.generated
     */
    private String createUserId;

    /**
     * Database Column Remarks:
     *   审批产生的json数据
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approval_flow_log.data_text
     *
     * @mbg.generated
     */
    private String dataText;

    /**
     * Database Column Remarks:
     *   对应create_log表中的unique_code
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approval_flow_log.create_log_num
     *
     * @mbg.generated
     */
    private String createLogNum;

    /**
     * Database Column Remarks:
     *   该节点审批的操作项
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approval_flow_log.options_id
     *
     * @mbg.generated
     */
    private Integer optionsId;

    /**
     * Database Column Remarks:
     *   操作信息描述
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approval_flow_log.options_msg
     *
     * @mbg.generated
     */
    private String optionsMsg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approval_flow_log.entrust_time
     *
     * @mbg.generated
     */
    private Date entrustTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approval_flow_log.entrust_user_id
     *
     * @mbg.generated
     */
    private String entrustUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approval_flow_log.is_invalid
     *
     * @mbg.generated
     */
    private Integer isInvalid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approval_flow_log.type_id
     *
     * @mbg.generated
     */
    private String typeId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approval_flow_log.id
     *
     * @return the value of approval_flow_log.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approval_flow_log.id
     *
     * @param id the value for approval_flow_log.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approval_flow_log.approval_flow_content
     *
     * @return the value of approval_flow_log.approval_flow_content
     *
     * @mbg.generated
     */
    public String getApprovalFlowContent() {
        return approvalFlowContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approval_flow_log.approval_flow_content
     *
     * @param approvalFlowContent the value for approval_flow_log.approval_flow_content
     *
     * @mbg.generated
     */
    public void setApprovalFlowContent(String approvalFlowContent) {
        this.approvalFlowContent = approvalFlowContent == null ? null : approvalFlowContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approval_flow_log.node_num
     *
     * @return the value of approval_flow_log.node_num
     *
     * @mbg.generated
     */
    public String getNodeNum() {
        return nodeNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approval_flow_log.node_num
     *
     * @param nodeNum the value for approval_flow_log.node_num
     *
     * @mbg.generated
     */
    public void setNodeNum(String nodeNum) {
        this.nodeNum = nodeNum == null ? null : nodeNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approval_flow_log.create_time
     *
     * @return the value of approval_flow_log.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approval_flow_log.create_time
     *
     * @param createTime the value for approval_flow_log.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approval_flow_log.create_user_id
     *
     * @return the value of approval_flow_log.create_user_id
     *
     * @mbg.generated
     */
    public String getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approval_flow_log.create_user_id
     *
     * @param createUserId the value for approval_flow_log.create_user_id
     *
     * @mbg.generated
     */
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approval_flow_log.data_text
     *
     * @return the value of approval_flow_log.data_text
     *
     * @mbg.generated
     */
    public String getDataText() {
        return dataText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approval_flow_log.data_text
     *
     * @param dataText the value for approval_flow_log.data_text
     *
     * @mbg.generated
     */
    public void setDataText(String dataText) {
        this.dataText = dataText == null ? null : dataText.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approval_flow_log.create_log_num
     *
     * @return the value of approval_flow_log.create_log_num
     *
     * @mbg.generated
     */
    public String getCreateLogNum() {
        return createLogNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approval_flow_log.create_log_num
     *
     * @param createLogNum the value for approval_flow_log.create_log_num
     *
     * @mbg.generated
     */
    public void setCreateLogNum(String createLogNum) {
        this.createLogNum = createLogNum == null ? null : createLogNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approval_flow_log.options_id
     *
     * @return the value of approval_flow_log.options_id
     *
     * @mbg.generated
     */
    public Integer getOptionsId() {
        return optionsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approval_flow_log.options_id
     *
     * @param optionsId the value for approval_flow_log.options_id
     *
     * @mbg.generated
     */
    public void setOptionsId(Integer optionsId) {
        this.optionsId = optionsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approval_flow_log.options_msg
     *
     * @return the value of approval_flow_log.options_msg
     *
     * @mbg.generated
     */
    public String getOptionsMsg() {
        return optionsMsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approval_flow_log.options_msg
     *
     * @param optionsMsg the value for approval_flow_log.options_msg
     *
     * @mbg.generated
     */
    public void setOptionsMsg(String optionsMsg) {
        this.optionsMsg = optionsMsg == null ? null : optionsMsg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approval_flow_log.entrust_time
     *
     * @return the value of approval_flow_log.entrust_time
     *
     * @mbg.generated
     */
    public Date getEntrustTime() {
        return entrustTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approval_flow_log.entrust_time
     *
     * @param entrustTime the value for approval_flow_log.entrust_time
     *
     * @mbg.generated
     */
    public void setEntrustTime(Date entrustTime) {
        this.entrustTime = entrustTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approval_flow_log.entrust_user_id
     *
     * @return the value of approval_flow_log.entrust_user_id
     *
     * @mbg.generated
     */
    public String getEntrustUserId() {
        return entrustUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approval_flow_log.entrust_user_id
     *
     * @param entrustUserId the value for approval_flow_log.entrust_user_id
     *
     * @mbg.generated
     */
    public void setEntrustUserId(String entrustUserId) {
        this.entrustUserId = entrustUserId == null ? null : entrustUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approval_flow_log.is_invalid
     *
     * @return the value of approval_flow_log.is_invalid
     *
     * @mbg.generated
     */
    public Integer getIsInvalid() {
        return isInvalid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approval_flow_log.is_invalid
     *
     * @param isInvalid the value for approval_flow_log.is_invalid
     *
     * @mbg.generated
     */
    public void setIsInvalid(Integer isInvalid) {
        this.isInvalid = isInvalid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approval_flow_log.type_id
     *
     * @return the value of approval_flow_log.type_id
     *
     * @mbg.generated
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approval_flow_log.type_id
     *
     * @param typeId the value for approval_flow_log.type_id
     *
     * @mbg.generated
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }
}