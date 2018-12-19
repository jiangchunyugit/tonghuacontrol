package cn.thinkfree.database.model;

import cn.thinkfree.core.model.BaseModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Database Table Remarks:
 *   经销商入驻品牌
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table pc_dealer_brand_info
 */
@ApiModel(value="cn.thinkfree.database.model.DealerBrandInfo")
public class DealerBrandInfo extends BaseModel {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_dealer_brand_info.id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="id主键")
    private Integer id;

    /**
     * Database Column Remarks:
     *   经销商品牌名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_dealer_brand_info.dealer_brand_name
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="dealerBrandName经销商品牌名称")
    private String dealerBrandName;

    /**
     * Database Column Remarks:
     *   经销商品类名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_dealer_brand_info.dealer_category_name
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="dealerCategoryName经销商品类名称")
    private String dealerCategoryName;

    /**
     * Database Column Remarks:
     *   经销商品牌授权书
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_dealer_brand_info.brand_authorization_card_url
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="brandAuthorizationCardUrl经销商品牌授权书")
    private String brandAuthorizationCardUrl;

    /**
     * Database Column Remarks:
     *   品牌授权书有效期
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_dealer_brand_info.brand_authorization_card_validity
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="brandAuthorizationCardValidity品牌授权书有效期")
    private String brandAuthorizationCardValidity;

    /**
     * Database Column Remarks:
     *   是否有效1是0否
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_dealer_brand_info.is_valid
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="isValid是否有效1是0否")
    private Integer isValid;

    /**
     * Database Column Remarks:
     *   公司id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_dealer_brand_info.company_id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="companyId公司id")
    private String companyId;

    /**
     * Database Column Remarks:
     *   审核状态：0：运营审核中 1：运营审核不通过 
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_dealer_brand_info.audit_status
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="auditStatus审核状态：0：运营审核中 1：运营审核不通过 ")
    private Integer auditStatus;

    /**
     * Database Column Remarks:
     *   品牌编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_dealer_brand_info.sbbm
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="sbbm品牌编号")
    private String sbbm;

    /**
     * Database Column Remarks:
     *   品牌种类ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_dealer_brand_info.spfldm_2
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="spfldm2品牌种类ID")
    private String spfldm2;

    /**
     * Database Column Remarks:
     *   经销商公司id（埃森哲）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_dealer_brand_info.dealer_company_id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value="dealerCompanyId经销商公司id（埃森哲）")
    private String dealerCompanyId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_dealer_brand_info.id
     *
     * @return the value of pc_dealer_brand_info.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_dealer_brand_info.id
     *
     * @param id the value for pc_dealer_brand_info.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_dealer_brand_info.dealer_brand_name
     *
     * @return the value of pc_dealer_brand_info.dealer_brand_name
     *
     * @mbg.generated
     */
    public String getDealerBrandName() {
        return dealerBrandName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_dealer_brand_info.dealer_brand_name
     *
     * @param dealerBrandName the value for pc_dealer_brand_info.dealer_brand_name
     *
     * @mbg.generated
     */
    public void setDealerBrandName(String dealerBrandName) {
        this.dealerBrandName = dealerBrandName == null ? null : dealerBrandName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_dealer_brand_info.dealer_category_name
     *
     * @return the value of pc_dealer_brand_info.dealer_category_name
     *
     * @mbg.generated
     */
    public String getDealerCategoryName() {
        return dealerCategoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_dealer_brand_info.dealer_category_name
     *
     * @param dealerCategoryName the value for pc_dealer_brand_info.dealer_category_name
     *
     * @mbg.generated
     */
    public void setDealerCategoryName(String dealerCategoryName) {
        this.dealerCategoryName = dealerCategoryName == null ? null : dealerCategoryName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_dealer_brand_info.brand_authorization_card_url
     *
     * @return the value of pc_dealer_brand_info.brand_authorization_card_url
     *
     * @mbg.generated
     */
    public String getBrandAuthorizationCardUrl() {
        return brandAuthorizationCardUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_dealer_brand_info.brand_authorization_card_url
     *
     * @param brandAuthorizationCardUrl the value for pc_dealer_brand_info.brand_authorization_card_url
     *
     * @mbg.generated
     */
    public void setBrandAuthorizationCardUrl(String brandAuthorizationCardUrl) {
        this.brandAuthorizationCardUrl = brandAuthorizationCardUrl == null ? null : brandAuthorizationCardUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_dealer_brand_info.brand_authorization_card_validity
     *
     * @return the value of pc_dealer_brand_info.brand_authorization_card_validity
     *
     * @mbg.generated
     */
    public String getBrandAuthorizationCardValidity() {
        return brandAuthorizationCardValidity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_dealer_brand_info.brand_authorization_card_validity
     *
     * @param brandAuthorizationCardValidity the value for pc_dealer_brand_info.brand_authorization_card_validity
     *
     * @mbg.generated
     */
    public void setBrandAuthorizationCardValidity(String brandAuthorizationCardValidity) {
        this.brandAuthorizationCardValidity = brandAuthorizationCardValidity == null ? null : brandAuthorizationCardValidity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_dealer_brand_info.is_valid
     *
     * @return the value of pc_dealer_brand_info.is_valid
     *
     * @mbg.generated
     */
    public Integer getIsValid() {
        return isValid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_dealer_brand_info.is_valid
     *
     * @param isValid the value for pc_dealer_brand_info.is_valid
     *
     * @mbg.generated
     */
    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_dealer_brand_info.company_id
     *
     * @return the value of pc_dealer_brand_info.company_id
     *
     * @mbg.generated
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_dealer_brand_info.company_id
     *
     * @param companyId the value for pc_dealer_brand_info.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_dealer_brand_info.audit_status
     *
     * @return the value of pc_dealer_brand_info.audit_status
     *
     * @mbg.generated
     */
    public Integer getAuditStatus() {
        return auditStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_dealer_brand_info.audit_status
     *
     * @param auditStatus the value for pc_dealer_brand_info.audit_status
     *
     * @mbg.generated
     */
    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_dealer_brand_info.sbbm
     *
     * @return the value of pc_dealer_brand_info.sbbm
     *
     * @mbg.generated
     */
    public String getSbbm() {
        return sbbm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_dealer_brand_info.sbbm
     *
     * @param sbbm the value for pc_dealer_brand_info.sbbm
     *
     * @mbg.generated
     */
    public void setSbbm(String sbbm) {
        this.sbbm = sbbm == null ? null : sbbm.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_dealer_brand_info.spfldm_2
     *
     * @return the value of pc_dealer_brand_info.spfldm_2
     *
     * @mbg.generated
     */
    public String getSpfldm2() {
        return spfldm2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_dealer_brand_info.spfldm_2
     *
     * @param spfldm2 the value for pc_dealer_brand_info.spfldm_2
     *
     * @mbg.generated
     */
    public void setSpfldm2(String spfldm2) {
        this.spfldm2 = spfldm2 == null ? null : spfldm2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_dealer_brand_info.dealer_company_id
     *
     * @return the value of pc_dealer_brand_info.dealer_company_id
     *
     * @mbg.generated
     */
    public String getDealerCompanyId() {
        return dealerCompanyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_dealer_brand_info.dealer_company_id
     *
     * @param dealerCompanyId the value for pc_dealer_brand_info.dealer_company_id
     *
     * @mbg.generated
     */
    public void setDealerCompanyId(String dealerCompanyId) {
        this.dealerCompanyId = dealerCompanyId == null ? null : dealerCompanyId.trim();
    }
}