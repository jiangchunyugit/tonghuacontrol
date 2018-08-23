package cn.thinkfree.database.model;

import cn.thinkfree.core.model.BaseModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Database Table Remarks:
 *   公司资质信息表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table company_info
 */
@Api("公司信息")
public class CompanyInfo extends BaseModel {
    /**
     * Database Column Remarks:
     *   自增id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.id
     *
     * @mbg.generated
     */
    @ApiModelProperty("主键")
    private Integer id;

    /**
     * Database Column Remarks:
     *   公司编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.company_id
     *
     * @mbg.generated
     */
    @ApiModelProperty("公司编号")
    private String companyId;

    /**
     * Database Column Remarks:
     *   公司名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.company_name
     *
     * @mbg.generated
     */
    @ApiModelProperty("公司名称")
    private String companyName;

    /**
     * Database Column Remarks:
     *   公司角色id 来源user_role_set表
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.role_id
     *
     * @mbg.generated
     */
    @ApiModelProperty("公司角色")
    private String roleId;

    /**
     * Database Column Remarks:
     *   省份编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.province_code
     *
     * @mbg.generated
     */
    private Short provinceCode;

    /**
     * Database Column Remarks:
     *   公司详细地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.address
     *
     * @mbg.generated
     */
    @ApiModelProperty("公司详细地址")
    private String address;

    /**
     * Database Column Remarks:
     *   法人姓名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.legal_name
     *
     * @mbg.generated
     */
    @ApiModelProperty("法人名字")
    private String legalName;

    /**
     * Database Column Remarks:
     *   法人电话号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.legal_phone
     *
     * @mbg.generated
     */
    @ApiModelProperty("法人电话")
    private String legalPhone;

    /**
     * Database Column Remarks:
     *   法人身份证号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.legal_id_card
     *
     * @mbg.generated
     */
    @ApiModelProperty("法人身份证号")
    private String legalIdCard;

    /**
     * Database Column Remarks:
     *   营业执照编码(三证合一编码)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.business_code
     *
     * @mbg.generated
     */
    @ApiModelProperty("营业执照编码")
    private String businessCode;

    /**
     * Database Column Remarks:
     *   组织机构代码证
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.organization_code
     *
     * @mbg.generated
     */
    @ApiModelProperty("组织机构代码")
    private String organizationCode;

    /**
     * Database Column Remarks:
     *   税务登记证
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.tax_code
     *
     * @mbg.generated
     */
    @ApiModelProperty("税号")
    private String taxCode;

    /**
     * Database Column Remarks:
     *   入驻是否审核通过 1审核通过 2审核不通过
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.is_check
     *
     * @mbg.generated
     */
    @ApiModelProperty("入驻 是否审核")
    private Short isCheck;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.create_time
     *
     * @mbg.generated
     */
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * Database Column Remarks:
     *   管理员手机号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.phone
     *
     * @mbg.generated
     */
    @ApiModelProperty("管理员手机号")
    private String phone;

    /**
     * Database Column Remarks:
     *   营业执照照片地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.business_photo_url
     *
     * @mbg.generated
     */
    @ApiModelProperty("营业执照地址")
    private String businessPhotoUrl;

    /**
     * Database Column Remarks:
     *   施工资质照片地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.work_photo_url
     *
     * @mbg.generated
     */
    @ApiModelProperty("施工资质照片地址")
    private String workPhotoUrl;

    /**
     * Database Column Remarks:
     *   担保金
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.deposit_money
     *
     * @mbg.generated
     */
    @ApiModelProperty("担保金")
    private Integer depositMoney;

    /**
     * Database Column Remarks:
     *   经纬度信息
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.lbs
     *
     * @mbg.generated
     */
    @ApiModelProperty("经纬度")
    private String lbs;

    /**
     * Database Column Remarks:
     *   是否删除 1是 2否
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.is_delete
     *
     * @mbg.generated
     */
    @ApiModelProperty("是否删除")
    private Short isDelete;

    /**
     * Database Column Remarks:
     *   城市编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.city_code
     *
     * @mbg.generated
     */
    private Short cityCode;

    /**
     * Database Column Remarks:
     *   区域编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.area_code
     *
     * @mbg.generated
     */
    private Integer areaCode;

    /**
     * Database Column Remarks:
     *   根公司标识
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.root_company_id
     *
     * @mbg.generated
     */
    private String rootCompanyId;

    /**
     * Database Column Remarks:
     *   上级公司
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.parent_company_id
     *
     * @mbg.generated
     */
    private String parentCompanyId;

    /**
     * Database Column Remarks:
     *   是否中心城镇
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.is_center
     *
     * @mbg.generated
     */
    private Short isCenter;

    /**
     * Database Column Remarks:
     *   公司座机
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.telephone
     *
     * @mbg.generated
     */
    private String telephone;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.id
     *
     * @return the value of company_info.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.id
     *
     * @param id the value for company_info.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.company_id
     *
     * @return the value of company_info.company_id
     *
     * @mbg.generated
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.company_id
     *
     * @param companyId the value for company_info.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.company_name
     *
     * @return the value of company_info.company_name
     *
     * @mbg.generated
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.company_name
     *
     * @param companyName the value for company_info.company_name
     *
     * @mbg.generated
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.role_id
     *
     * @return the value of company_info.role_id
     *
     * @mbg.generated
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.role_id
     *
     * @param roleId the value for company_info.role_id
     *
     * @mbg.generated
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.province_code
     *
     * @return the value of company_info.province_code
     *
     * @mbg.generated
     */
    public Short getProvinceCode() {
        return provinceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.province_code
     *
     * @param provinceCode the value for company_info.province_code
     *
     * @mbg.generated
     */
    public void setProvinceCode(Short provinceCode) {
        this.provinceCode = provinceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.address
     *
     * @return the value of company_info.address
     *
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.address
     *
     * @param address the value for company_info.address
     *
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.legal_name
     *
     * @return the value of company_info.legal_name
     *
     * @mbg.generated
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.legal_name
     *
     * @param legalName the value for company_info.legal_name
     *
     * @mbg.generated
     */
    public void setLegalName(String legalName) {
        this.legalName = legalName == null ? null : legalName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.legal_phone
     *
     * @return the value of company_info.legal_phone
     *
     * @mbg.generated
     */
    public String getLegalPhone() {
        return legalPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.legal_phone
     *
     * @param legalPhone the value for company_info.legal_phone
     *
     * @mbg.generated
     */
    public void setLegalPhone(String legalPhone) {
        this.legalPhone = legalPhone == null ? null : legalPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.legal_id_card
     *
     * @return the value of company_info.legal_id_card
     *
     * @mbg.generated
     */
    public String getLegalIdCard() {
        return legalIdCard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.legal_id_card
     *
     * @param legalIdCard the value for company_info.legal_id_card
     *
     * @mbg.generated
     */
    public void setLegalIdCard(String legalIdCard) {
        this.legalIdCard = legalIdCard == null ? null : legalIdCard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.business_code
     *
     * @return the value of company_info.business_code
     *
     * @mbg.generated
     */
    public String getBusinessCode() {
        return businessCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.business_code
     *
     * @param businessCode the value for company_info.business_code
     *
     * @mbg.generated
     */
    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode == null ? null : businessCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.organization_code
     *
     * @return the value of company_info.organization_code
     *
     * @mbg.generated
     */
    public String getOrganizationCode() {
        return organizationCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.organization_code
     *
     * @param organizationCode the value for company_info.organization_code
     *
     * @mbg.generated
     */
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode == null ? null : organizationCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.tax_code
     *
     * @return the value of company_info.tax_code
     *
     * @mbg.generated
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.tax_code
     *
     * @param taxCode the value for company_info.tax_code
     *
     * @mbg.generated
     */
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode == null ? null : taxCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.is_check
     *
     * @return the value of company_info.is_check
     *
     * @mbg.generated
     */
    public Short getIsCheck() {
        return isCheck;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.is_check
     *
     * @param isCheck the value for company_info.is_check
     *
     * @mbg.generated
     */
    public void setIsCheck(Short isCheck) {
        this.isCheck = isCheck;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.create_time
     *
     * @return the value of company_info.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.create_time
     *
     * @param createTime the value for company_info.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.phone
     *
     * @return the value of company_info.phone
     *
     * @mbg.generated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.phone
     *
     * @param phone the value for company_info.phone
     *
     * @mbg.generated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.business_photo_url
     *
     * @return the value of company_info.business_photo_url
     *
     * @mbg.generated
     */
    public String getBusinessPhotoUrl() {
        return businessPhotoUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.business_photo_url
     *
     * @param businessPhotoUrl the value for company_info.business_photo_url
     *
     * @mbg.generated
     */
    public void setBusinessPhotoUrl(String businessPhotoUrl) {
        this.businessPhotoUrl = businessPhotoUrl == null ? null : businessPhotoUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.work_photo_url
     *
     * @return the value of company_info.work_photo_url
     *
     * @mbg.generated
     */
    public String getWorkPhotoUrl() {
        return workPhotoUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.work_photo_url
     *
     * @param workPhotoUrl the value for company_info.work_photo_url
     *
     * @mbg.generated
     */
    public void setWorkPhotoUrl(String workPhotoUrl) {
        this.workPhotoUrl = workPhotoUrl == null ? null : workPhotoUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.deposit_money
     *
     * @return the value of company_info.deposit_money
     *
     * @mbg.generated
     */
    public Integer getDepositMoney() {
        return depositMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.deposit_money
     *
     * @param depositMoney the value for company_info.deposit_money
     *
     * @mbg.generated
     */
    public void setDepositMoney(Integer depositMoney) {
        this.depositMoney = depositMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.lbs
     *
     * @return the value of company_info.lbs
     *
     * @mbg.generated
     */
    public String getLbs() {
        return lbs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.lbs
     *
     * @param lbs the value for company_info.lbs
     *
     * @mbg.generated
     */
    public void setLbs(String lbs) {
        this.lbs = lbs == null ? null : lbs.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.is_delete
     *
     * @return the value of company_info.is_delete
     *
     * @mbg.generated
     */
    public Short getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.is_delete
     *
     * @param isDelete the value for company_info.is_delete
     *
     * @mbg.generated
     */
    public void setIsDelete(Short isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.city_code
     *
     * @return the value of company_info.city_code
     *
     * @mbg.generated
     */
    public Short getCityCode() {
        return cityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.city_code
     *
     * @param cityCode the value for company_info.city_code
     *
     * @mbg.generated
     */
    public void setCityCode(Short cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.area_code
     *
     * @return the value of company_info.area_code
     *
     * @mbg.generated
     */
    public Integer getAreaCode() {
        return areaCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.area_code
     *
     * @param areaCode the value for company_info.area_code
     *
     * @mbg.generated
     */
    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.root_company_id
     *
     * @return the value of company_info.root_company_id
     *
     * @mbg.generated
     */
    public String getRootCompanyId() {
        return rootCompanyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.root_company_id
     *
     * @param rootCompanyId the value for company_info.root_company_id
     *
     * @mbg.generated
     */
    public void setRootCompanyId(String rootCompanyId) {
        this.rootCompanyId = rootCompanyId == null ? null : rootCompanyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.parent_company_id
     *
     * @return the value of company_info.parent_company_id
     *
     * @mbg.generated
     */
    public String getParentCompanyId() {
        return parentCompanyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.parent_company_id
     *
     * @param parentCompanyId the value for company_info.parent_company_id
     *
     * @mbg.generated
     */
    public void setParentCompanyId(String parentCompanyId) {
        this.parentCompanyId = parentCompanyId == null ? null : parentCompanyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.is_center
     *
     * @return the value of company_info.is_center
     *
     * @mbg.generated
     */
    public Short getIsCenter() {
        return isCenter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.is_center
     *
     * @param isCenter the value for company_info.is_center
     *
     * @mbg.generated
     */
    public void setIsCenter(Short isCenter) {
        this.isCenter = isCenter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.telephone
     *
     * @return the value of company_info.telephone
     *
     * @mbg.generated
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.telephone
     *
     * @param telephone the value for company_info.telephone
     *
     * @mbg.generated
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }
}