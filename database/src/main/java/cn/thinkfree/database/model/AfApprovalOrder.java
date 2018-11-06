package cn.thinkfree.database.model;

import cn.thinkfree.core.model.BaseModel;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table a_f_approval_order
 */
public class AfApprovalOrder extends BaseModel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column a_f_approval_order.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   审批流配置与方案关联编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column a_f_approval_order.config_scheme_no
     *
     * @mbg.generated
     */
    private String configSchemeNo;

    /**
     * Database Column Remarks:
     *   审批顺序方案编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column a_f_approval_order.approval_order_no
     *
     * @mbg.generated
     */
    private String approvalOrderNo;

    /**
     * Database Column Remarks:
     *   方案名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column a_f_approval_order.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * Database Column Remarks:
     *   第一个角色编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column a_f_approval_order.first_role_id
     *
     * @mbg.generated
     */
    private String firstRoleId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column a_f_approval_order.id
     *
     * @return the value of a_f_approval_order.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column a_f_approval_order.id
     *
     * @param id the value for a_f_approval_order.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column a_f_approval_order.config_scheme_no
     *
     * @return the value of a_f_approval_order.config_scheme_no
     *
     * @mbg.generated
     */
    public String getConfigSchemeNo() {
        return configSchemeNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column a_f_approval_order.config_scheme_no
     *
     * @param configSchemeNo the value for a_f_approval_order.config_scheme_no
     *
     * @mbg.generated
     */
    public void setConfigSchemeNo(String configSchemeNo) {
        this.configSchemeNo = configSchemeNo == null ? null : configSchemeNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column a_f_approval_order.approval_order_no
     *
     * @return the value of a_f_approval_order.approval_order_no
     *
     * @mbg.generated
     */
    public String getApprovalOrderNo() {
        return approvalOrderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column a_f_approval_order.approval_order_no
     *
     * @param approvalOrderNo the value for a_f_approval_order.approval_order_no
     *
     * @mbg.generated
     */
    public void setApprovalOrderNo(String approvalOrderNo) {
        this.approvalOrderNo = approvalOrderNo == null ? null : approvalOrderNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column a_f_approval_order.name
     *
     * @return the value of a_f_approval_order.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column a_f_approval_order.name
     *
     * @param name the value for a_f_approval_order.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column a_f_approval_order.first_role_id
     *
     * @return the value of a_f_approval_order.first_role_id
     *
     * @mbg.generated
     */
    public String getFirstRoleId() {
        return firstRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column a_f_approval_order.first_role_id
     *
     * @param firstRoleId the value for a_f_approval_order.first_role_id
     *
     * @mbg.generated
     */
    public void setFirstRoleId(String firstRoleId) {
        this.firstRoleId = firstRoleId == null ? null : firstRoleId.trim();
    }
}