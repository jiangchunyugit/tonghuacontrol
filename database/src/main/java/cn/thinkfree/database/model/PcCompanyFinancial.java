package cn.thinkfree.database.model;

import cn.thinkfree.core.model.BaseModel;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table pc_company_financial
 */
public class PcCompanyFinancial extends BaseModel {
    /**
     * Database Column Remarks:
     *   主键id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_company_financial.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   开户行省code
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_company_financial.account_province
     *
     * @mbg.generated
     */
    private String accountProvince;

    /**
     * Database Column Remarks:
     *   开户行市code
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_company_financial.account_city
     *
     * @mbg.generated
     */
    private String accountCity;

    /**
     * Database Column Remarks:
     *   开户行区或具体地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_company_financial.account_district
     *
     * @mbg.generated
     */
    private String accountDistrict;

    /**
     * Database Column Remarks:
     *   银行名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_company_financial.account_name
     *
     * @mbg.generated
     */
    private String accountName;

    /**
     * Database Column Remarks:
     *   开户人名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_company_financial.card_name
     *
     * @mbg.generated
     */
    private String cardName;

    /**
     * Database Column Remarks:
     *   开户支行名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_company_financial.account_branch_name
     *
     * @mbg.generated
     */
    private String accountBranchName;

    /**
     * Database Column Remarks:
     *   银行卡卡号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_company_financial.account_number
     *
     * @mbg.generated
     */
    private Integer accountNumber;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_company_financial.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_company_financial.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   公司编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_company_financial.company_id
     *
     * @mbg.generated
     */
    private String companyId;

    /**
     * Database Column Remarks:
     *   开户许可证url
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_company_financial.license_url
     *
     * @mbg.generated
     */
    private String licenseUrl;

    /**
     * Database Column Remarks:
     *   开户行区code
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_company_financial.account_area
     *
     * @mbg.generated
     */
    private String accountArea;

    /**
     * Database Column Remarks:
     *   账户类型：0：居然金融，1：银行账户
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_company_financial.account_type
     *
     * @mbg.generated
     */
    private Short accountType;

    /**
     * Database Column Remarks:
     *   纳税人识别号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_company_financial.taxpayer_registration_number
     *
     * @mbg.generated
     */
    private String taxpayerRegistrationNumber;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_company_financial.id
     *
     * @return the value of pc_company_financial.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_company_financial.id
     *
     * @param id the value for pc_company_financial.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_company_financial.account_province
     *
     * @return the value of pc_company_financial.account_province
     *
     * @mbg.generated
     */
    public String getAccountProvince() {
        return accountProvince;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_company_financial.account_province
     *
     * @param accountProvince the value for pc_company_financial.account_province
     *
     * @mbg.generated
     */
    public void setAccountProvince(String accountProvince) {
        this.accountProvince = accountProvince == null ? null : accountProvince.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_company_financial.account_city
     *
     * @return the value of pc_company_financial.account_city
     *
     * @mbg.generated
     */
    public String getAccountCity() {
        return accountCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_company_financial.account_city
     *
     * @param accountCity the value for pc_company_financial.account_city
     *
     * @mbg.generated
     */
    public void setAccountCity(String accountCity) {
        this.accountCity = accountCity == null ? null : accountCity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_company_financial.account_district
     *
     * @return the value of pc_company_financial.account_district
     *
     * @mbg.generated
     */
    public String getAccountDistrict() {
        return accountDistrict;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_company_financial.account_district
     *
     * @param accountDistrict the value for pc_company_financial.account_district
     *
     * @mbg.generated
     */
    public void setAccountDistrict(String accountDistrict) {
        this.accountDistrict = accountDistrict == null ? null : accountDistrict.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_company_financial.account_name
     *
     * @return the value of pc_company_financial.account_name
     *
     * @mbg.generated
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_company_financial.account_name
     *
     * @param accountName the value for pc_company_financial.account_name
     *
     * @mbg.generated
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_company_financial.card_name
     *
     * @return the value of pc_company_financial.card_name
     *
     * @mbg.generated
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_company_financial.card_name
     *
     * @param cardName the value for pc_company_financial.card_name
     *
     * @mbg.generated
     */
    public void setCardName(String cardName) {
        this.cardName = cardName == null ? null : cardName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_company_financial.account_branch_name
     *
     * @return the value of pc_company_financial.account_branch_name
     *
     * @mbg.generated
     */
    public String getAccountBranchName() {
        return accountBranchName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_company_financial.account_branch_name
     *
     * @param accountBranchName the value for pc_company_financial.account_branch_name
     *
     * @mbg.generated
     */
    public void setAccountBranchName(String accountBranchName) {
        this.accountBranchName = accountBranchName == null ? null : accountBranchName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_company_financial.account_number
     *
     * @return the value of pc_company_financial.account_number
     *
     * @mbg.generated
     */
    public Integer getAccountNumber() {
        return accountNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_company_financial.account_number
     *
     * @param accountNumber the value for pc_company_financial.account_number
     *
     * @mbg.generated
     */
    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_company_financial.create_time
     *
     * @return the value of pc_company_financial.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_company_financial.create_time
     *
     * @param createTime the value for pc_company_financial.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_company_financial.update_time
     *
     * @return the value of pc_company_financial.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_company_financial.update_time
     *
     * @param updateTime the value for pc_company_financial.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_company_financial.company_id
     *
     * @return the value of pc_company_financial.company_id
     *
     * @mbg.generated
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_company_financial.company_id
     *
     * @param companyId the value for pc_company_financial.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_company_financial.license_url
     *
     * @return the value of pc_company_financial.license_url
     *
     * @mbg.generated
     */
    public String getLicenseUrl() {
        return licenseUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_company_financial.license_url
     *
     * @param licenseUrl the value for pc_company_financial.license_url
     *
     * @mbg.generated
     */
    public void setLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl == null ? null : licenseUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_company_financial.account_area
     *
     * @return the value of pc_company_financial.account_area
     *
     * @mbg.generated
     */
    public String getAccountArea() {
        return accountArea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_company_financial.account_area
     *
     * @param accountArea the value for pc_company_financial.account_area
     *
     * @mbg.generated
     */
    public void setAccountArea(String accountArea) {
        this.accountArea = accountArea == null ? null : accountArea.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_company_financial.account_type
     *
     * @return the value of pc_company_financial.account_type
     *
     * @mbg.generated
     */
    public Short getAccountType() {
        return accountType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_company_financial.account_type
     *
     * @param accountType the value for pc_company_financial.account_type
     *
     * @mbg.generated
     */
    public void setAccountType(Short accountType) {
        this.accountType = accountType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_company_financial.taxpayer_registration_number
     *
     * @return the value of pc_company_financial.taxpayer_registration_number
     *
     * @mbg.generated
     */
    public String getTaxpayerRegistrationNumber() {
        return taxpayerRegistrationNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_company_financial.taxpayer_registration_number
     *
     * @param taxpayerRegistrationNumber the value for pc_company_financial.taxpayer_registration_number
     *
     * @mbg.generated
     */
    public void setTaxpayerRegistrationNumber(String taxpayerRegistrationNumber) {
        this.taxpayerRegistrationNumber = taxpayerRegistrationNumber == null ? null : taxpayerRegistrationNumber.trim();
    }
}