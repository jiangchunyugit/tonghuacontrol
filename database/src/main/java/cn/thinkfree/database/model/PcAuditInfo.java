package cn.thinkfree.database.model;

import cn.thinkfree.core.model.BaseModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table pc_audit_info
 */
@ApiModel(value="cn.thinkfree.database.model.PcAuditInfo")
public class PcAuditInfo extends BaseModel {
    /**
     * Database Column Remarks:
     *   主键id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_audit_info.id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="id主键id")
    private Integer id;

    /**
     * Database Column Remarks:
     *   审核类型0入驻 1合同 2变更 3续签4结算比例 5结算规则6:创建账号(录入）7经销商合同 8：经销商品牌审核
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_audit_info.audit_type
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="auditType审核类型0入驻 1合同 2变更 3续签4结算比例 5结算规则6:创建账号(录入）7经销商合同 8：经销商品牌审核")
    private String auditType;

    /**
     * Database Column Remarks:
     *   审核级别0初次审核1二级审核
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_audit_info.audit_level
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="auditLevel审核级别0初次审核1二级审核")
    private String auditLevel;

    /**
     * Database Column Remarks:
     *   审核人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_audit_info.audit_persion
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="auditPersion审核人")
    private String auditPersion;

    /**
     * Database Column Remarks:
     *   审核状态 0不通过1通过
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_audit_info.audit_status
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="auditStatus审核状态 0不通过1通过")
    private String auditStatus;

    /**
     * Database Column Remarks:
     *   审核时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_audit_info.audit_time
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="auditTime审核时间")
    private Date auditTime;

    /**
     * Database Column Remarks:
     *   公司编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_audit_info.company_id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="companyId公司编号")
    private String companyId;

    /**
     * Database Column Remarks:
     *   审核成功或者失败的原因
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_audit_info.audit_case
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="auditCase审核成功或者失败的原因")
    private String auditCase;

    /**
     * Database Column Remarks:
     *   合同编号/规则编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_audit_info.contract_number
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="contractNumber合同编号/规则编号/品牌id")
    private String contractNumber;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_audit_info.create_time
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="createTime创建时间")
    private Date createTime;

    /**
     * Database Column Remarks:
     *   审批人账号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_audit_info.audit_account
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="auditAccount审批人账号")
    private String auditAccount;

    public PcAuditInfo(String auditType, String auditLevel, String auditPersion, String auditStatus, Date auditTime, String companyId, String auditCase, String contractNumber, Date createTime, String auditAccount) {
        this.auditType = auditType;
        this.auditLevel = auditLevel;
        this.auditPersion = auditPersion;
        this.auditStatus = auditStatus;
        this.auditTime = auditTime;
        this.companyId = companyId;
        this.auditCase = auditCase;
        this.contractNumber = contractNumber;
        this.createTime = createTime;
        this.auditAccount = auditAccount;
    }

    public PcAuditInfo() {
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_audit_info.id
     *
     * @return the value of pc_audit_info.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_audit_info.id
     *
     * @param id the value for pc_audit_info.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_audit_info.audit_type
     *
     * @return the value of pc_audit_info.audit_type
     *
     * @mbg.generated
     */
    public String getAuditType() {
        return auditType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_audit_info.audit_type
     *
     * @param auditType the value for pc_audit_info.audit_type
     *
     * @mbg.generated
     */
    public void setAuditType(String auditType) {
        this.auditType = auditType == null ? null : auditType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_audit_info.audit_level
     *
     * @return the value of pc_audit_info.audit_level
     *
     * @mbg.generated
     */
    public String getAuditLevel() {
        return auditLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_audit_info.audit_level
     *
     * @param auditLevel the value for pc_audit_info.audit_level
     *
     * @mbg.generated
     */
    public void setAuditLevel(String auditLevel) {
        this.auditLevel = auditLevel == null ? null : auditLevel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_audit_info.audit_persion
     *
     * @return the value of pc_audit_info.audit_persion
     *
     * @mbg.generated
     */
    public String getAuditPersion() {
        return auditPersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_audit_info.audit_persion
     *
     * @param auditPersion the value for pc_audit_info.audit_persion
     *
     * @mbg.generated
     */
    public void setAuditPersion(String auditPersion) {
        this.auditPersion = auditPersion == null ? null : auditPersion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_audit_info.audit_status
     *
     * @return the value of pc_audit_info.audit_status
     *
     * @mbg.generated
     */
    public String getAuditStatus() {
        return auditStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_audit_info.audit_status
     *
     * @param auditStatus the value for pc_audit_info.audit_status
     *
     * @mbg.generated
     */
    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_audit_info.audit_time
     *
     * @return the value of pc_audit_info.audit_time
     *
     * @mbg.generated
     */
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_audit_info.audit_time
     *
     * @param auditTime the value for pc_audit_info.audit_time
     *
     * @mbg.generated
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_audit_info.company_id
     *
     * @return the value of pc_audit_info.company_id
     *
     * @mbg.generated
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_audit_info.company_id
     *
     * @param companyId the value for pc_audit_info.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_audit_info.audit_case
     *
     * @return the value of pc_audit_info.audit_case
     *
     * @mbg.generated
     */
    public String getAuditCase() {
        return auditCase;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_audit_info.audit_case
     *
     * @param auditCase the value for pc_audit_info.audit_case
     *
     * @mbg.generated
     */
    public void setAuditCase(String auditCase) {
        this.auditCase = auditCase == null ? null : auditCase.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_audit_info.contract_number
     *
     * @return the value of pc_audit_info.contract_number
     *
     * @mbg.generated
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_audit_info.contract_number
     *
     * @param contractNumber the value for pc_audit_info.contract_number
     *
     * @mbg.generated
     */
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber == null ? null : contractNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_audit_info.create_time
     *
     * @return the value of pc_audit_info.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_audit_info.create_time
     *
     * @param createTime the value for pc_audit_info.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_audit_info.audit_account
     *
     * @return the value of pc_audit_info.audit_account
     *
     * @mbg.generated
     */
    public String getAuditAccount() {
        return auditAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_audit_info.audit_account
     *
     * @param auditAccount the value for pc_audit_info.audit_account
     *
     * @mbg.generated
     */
    public void setAuditAccount(String auditAccount) {
        this.auditAccount = auditAccount == null ? null : auditAccount.trim();
    }
}