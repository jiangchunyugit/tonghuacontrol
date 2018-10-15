package cn.thinkfree.database.model;

import cn.thinkfree.core.model.BaseModel;

/**
 * Database Table Remarks:
 *   后台_角色权限表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table pc_system_role_permission
 */
public class SystemRolePermission extends BaseModel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_system_role_permission.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   角色主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_system_role_permission.role_id
     *
     * @mbg.generated
     */
    private Integer roleId;

    /**
     * Database Column Remarks:
     *   权限主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_system_role_permission.permission_id
     *
     * @mbg.generated
     */
    private Integer permissionId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_system_role_permission.id
     *
     * @return the value of pc_system_role_permission.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_system_role_permission.id
     *
     * @param id the value for pc_system_role_permission.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_system_role_permission.role_id
     *
     * @return the value of pc_system_role_permission.role_id
     *
     * @mbg.generated
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_system_role_permission.role_id
     *
     * @param roleId the value for pc_system_role_permission.role_id
     *
     * @mbg.generated
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_system_role_permission.permission_id
     *
     * @return the value of pc_system_role_permission.permission_id
     *
     * @mbg.generated
     */
    public Integer getPermissionId() {
        return permissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_system_role_permission.permission_id
     *
     * @param permissionId the value for pc_system_role_permission.permission_id
     *
     * @mbg.generated
     */
    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }
}