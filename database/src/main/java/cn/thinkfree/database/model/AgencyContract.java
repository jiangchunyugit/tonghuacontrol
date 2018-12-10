package cn.thinkfree.database.model;

import cn.thinkfree.core.model.BaseModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table pc_agency_contract
 */
@ApiModel(value="cn.thinkfree.database.model.AgencyContract")
public class AgencyContract extends BaseModel {
    /**
     * Database Column Remarks:
     *   主鍵id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_agency_contract.id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="id主鍵id",hidden = true)
    private Integer id;

    /**
     * Database Column Remarks:
     *   合同编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_agency_contract.contract_number
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="contractNumber合同编号")
    private String contractNumber;

    /**
     * Database Column Remarks:
     *   公司编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_agency_contract.company_id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="companyId公司编号")
    private String companyId;

    /**
     * Database Column Remarks:
     *   合同结束时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_agency_contract.end_time
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="endTime合同结束时间")
    private Date endTime;

    /**
     * Database Column Remarks:
     *   合同状态 0待提交1运营审核中2运营审核通过3运营审核不通4财务审核中 5财务审核通过 6财务审核不通过7待签约8生效中9冻结10过期11作废
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_agency_contract.status
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="status合同状态 0待提交1运营审核中2运营审核通过3运营审核不通4财务审核中 5财务审核通过 6财务审核不通过7待签约8生效中9冻结10过期11作废")
    private String status;

    /**
     * Database Column Remarks:
     *   分公司名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_agency_contract.filiale_name
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="filialeName分公司名称")
    private String filialeName;

    /**
     * Database Column Remarks:
     *   分公司code
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_agency_contract.filiale_id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="filialeId分公司code")
    private String filialeId;

    /**
     * Database Column Remarks:
     *   城市站name
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_agency_contract.metro_name
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="metroName城市站name")
    private String metroName;

    /**
     * Database Column Remarks:
     *   城市站code
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_agency_contract.metro_id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="metroId城市站code")
    private String metroId;

    /**
     * Database Column Remarks:
     *   门店名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_agency_contract.store_name
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="storeName门店名称")
    private String storeName;

    /**
     * Database Column Remarks:
     *   门店id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_agency_contract.store_id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="storeId门店id")
    private Integer storeId;

    /**
     * Database Column Remarks:
     *   甲方名称（默认用居然之家）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_agency_contract.owner_name
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="ownerName甲方名称（默认用居然之家）")
    private String ownerName;

    /**
     * Database Column Remarks:
     *   签约代理人名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_agency_contract.agent_name
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="agentName签约代理人名")
    private String agentName;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_agency_contract.create_time
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="createTime创建时间")
    private Date createTime;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_agency_contract.update_time
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="updateTime修改时间")
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   pdf---url
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_agency_contract.pdf_url
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="pdfUrlpdf---url")
    private String pdfUrl;

    /**
     * Database Column Remarks:
     *   公司名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_agency_contract.company_name
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="companyName公司名称")
    private String companyName;

    /**
     * Database Column Remarks:
     *   法人名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_agency_contract.legal_name
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="legalName法人名称")
    private String legalName;

    /**
     * Database Column Remarks:
     *   三证合一
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_agency_contract.unify_social_credit_code
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="unifySocialCreditCode三证合一")
    private String unifySocialCreditCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_agency_contract.id
     *
     * @return the value of pc_agency_contract.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_agency_contract.id
     *
     * @param id the value for pc_agency_contract.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_agency_contract.contract_number
     *
     * @return the value of pc_agency_contract.contract_number
     *
     * @mbg.generated
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_agency_contract.contract_number
     *
     * @param contractNumber the value for pc_agency_contract.contract_number
     *
     * @mbg.generated
     */
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber == null ? null : contractNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_agency_contract.company_id
     *
     * @return the value of pc_agency_contract.company_id
     *
     * @mbg.generated
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_agency_contract.company_id
     *
     * @param companyId the value for pc_agency_contract.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_agency_contract.end_time
     *
     * @return the value of pc_agency_contract.end_time
     *
     * @mbg.generated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_agency_contract.end_time
     *
     * @param endTime the value for pc_agency_contract.end_time
     *
     * @mbg.generated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_agency_contract.status
     *
     * @return the value of pc_agency_contract.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_agency_contract.status
     *
     * @param status the value for pc_agency_contract.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_agency_contract.filiale_name
     *
     * @return the value of pc_agency_contract.filiale_name
     *
     * @mbg.generated
     */
    public String getFilialeName() {
        return filialeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_agency_contract.filiale_name
     *
     * @param filialeName the value for pc_agency_contract.filiale_name
     *
     * @mbg.generated
     */
    public void setFilialeName(String filialeName) {
        this.filialeName = filialeName == null ? null : filialeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_agency_contract.filiale_id
     *
     * @return the value of pc_agency_contract.filiale_id
     *
     * @mbg.generated
     */
    public String getFilialeId() {
        return filialeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_agency_contract.filiale_id
     *
     * @param filialeId the value for pc_agency_contract.filiale_id
     *
     * @mbg.generated
     */
    public void setFilialeId(String filialeId) {
        this.filialeId = filialeId == null ? null : filialeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_agency_contract.metro_name
     *
     * @return the value of pc_agency_contract.metro_name
     *
     * @mbg.generated
     */
    public String getMetroName() {
        return metroName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_agency_contract.metro_name
     *
     * @param metroName the value for pc_agency_contract.metro_name
     *
     * @mbg.generated
     */
    public void setMetroName(String metroName) {
        this.metroName = metroName == null ? null : metroName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_agency_contract.metro_id
     *
     * @return the value of pc_agency_contract.metro_id
     *
     * @mbg.generated
     */
    public String getMetroId() {
        return metroId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_agency_contract.metro_id
     *
     * @param metroId the value for pc_agency_contract.metro_id
     *
     * @mbg.generated
     */
    public void setMetroId(String metroId) {
        this.metroId = metroId == null ? null : metroId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_agency_contract.store_name
     *
     * @return the value of pc_agency_contract.store_name
     *
     * @mbg.generated
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_agency_contract.store_name
     *
     * @param storeName the value for pc_agency_contract.store_name
     *
     * @mbg.generated
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_agency_contract.store_id
     *
     * @return the value of pc_agency_contract.store_id
     *
     * @mbg.generated
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_agency_contract.store_id
     *
     * @param storeId the value for pc_agency_contract.store_id
     *
     * @mbg.generated
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_agency_contract.owner_name
     *
     * @return the value of pc_agency_contract.owner_name
     *
     * @mbg.generated
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_agency_contract.owner_name
     *
     * @param ownerName the value for pc_agency_contract.owner_name
     *
     * @mbg.generated
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName == null ? null : ownerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_agency_contract.agent_name
     *
     * @return the value of pc_agency_contract.agent_name
     *
     * @mbg.generated
     */
    public String getAgentName() {
        return agentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_agency_contract.agent_name
     *
     * @param agentName the value for pc_agency_contract.agent_name
     *
     * @mbg.generated
     */
    public void setAgentName(String agentName) {
        this.agentName = agentName == null ? null : agentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_agency_contract.create_time
     *
     * @return the value of pc_agency_contract.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_agency_contract.create_time
     *
     * @param createTime the value for pc_agency_contract.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_agency_contract.update_time
     *
     * @return the value of pc_agency_contract.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_agency_contract.update_time
     *
     * @param updateTime the value for pc_agency_contract.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_agency_contract.pdf_url
     *
     * @return the value of pc_agency_contract.pdf_url
     *
     * @mbg.generated
     */
    public String getPdfUrl() {
        return pdfUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_agency_contract.pdf_url
     *
     * @param pdfUrl the value for pc_agency_contract.pdf_url
     *
     * @mbg.generated
     */
    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl == null ? null : pdfUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_agency_contract.company_name
     *
     * @return the value of pc_agency_contract.company_name
     *
     * @mbg.generated
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_agency_contract.company_name
     *
     * @param companyName the value for pc_agency_contract.company_name
     *
     * @mbg.generated
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_agency_contract.legal_name
     *
     * @return the value of pc_agency_contract.legal_name
     *
     * @mbg.generated
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_agency_contract.legal_name
     *
     * @param legalName the value for pc_agency_contract.legal_name
     *
     * @mbg.generated
     */
    public void setLegalName(String legalName) {
        this.legalName = legalName == null ? null : legalName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_agency_contract.unify_social_credit_code
     *
     * @return the value of pc_agency_contract.unify_social_credit_code
     *
     * @mbg.generated
     */
    public String getUnifySocialCreditCode() {
        return unifySocialCreditCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_agency_contract.unify_social_credit_code
     *
     * @param unifySocialCreditCode the value for pc_agency_contract.unify_social_credit_code
     *
     * @mbg.generated
     */
    public void setUnifySocialCreditCode(String unifySocialCreditCode) {
        this.unifySocialCreditCode = unifySocialCreditCode == null ? null : unifySocialCreditCode.trim();
    }
}