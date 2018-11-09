package cn.thinkfree.database.model;

import cn.thinkfree.core.model.BaseModel;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table pc_company_role_resource
 */
public class CompanyRoleResource extends BaseModel {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_company_role_resource.id

     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   角色id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_company_role_resource.role_id

     */
    private Integer roleId;

    /**
     * Database Column Remarks:
     *   资源id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_company_role_resource.resource_id

     */
    private Integer resourceId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_company_role_resource.id
     *
     * @return the value of pc_company_role_resource.id

     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_company_role_resource.id
     *
     * @param id the value for pc_company_role_resource.id

     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_company_role_resource.role_id
     *
     * @return the value of pc_company_role_resource.role_id

     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_company_role_resource.role_id
     *
     * @param roleId the value for pc_company_role_resource.role_id

     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_company_role_resource.resource_id
     *
     * @return the value of pc_company_role_resource.resource_id

     */
    public Integer getResourceId() {
        return resourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_company_role_resource.resource_id
     *
     * @param resourceId the value for pc_company_role_resource.resource_id

     */
    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }
}