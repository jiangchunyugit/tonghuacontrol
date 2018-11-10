package cn.thinkfree.database.model;

import cn.thinkfree.core.model.BaseModel;

/**
 * Database Table Remarks:
 *   角色和功能项关联关系
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table user_role_fun_rel
 */
public class UserRoleFunRel extends BaseModel {
    /**
     * Database Column Remarks:
     *   功能项编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role_fun_rel.function_item_no
     *
     * @mbg.generated
     */
    private String functionItemNo;

    /**
     * Database Column Remarks:
     *   角色编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role_fun_rel.role_code
     *
     * @mbg.generated
     */
    private String roleCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role_fun_rel.function_item_no
     *
     * @return the value of user_role_fun_rel.function_item_no
     *
     * @mbg.generated
     */
    public String getFunctionItemNo() {
        return functionItemNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role_fun_rel.function_item_no
     *
     * @param functionItemNo the value for user_role_fun_rel.function_item_no
     *
     * @mbg.generated
     */
    public void setFunctionItemNo(String functionItemNo) {
        this.functionItemNo = functionItemNo == null ? null : functionItemNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role_fun_rel.role_code
     *
     * @return the value of user_role_fun_rel.role_code
     *
     * @mbg.generated
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role_fun_rel.role_code
     *
     * @param roleCode the value for user_role_fun_rel.role_code
     *
     * @mbg.generated
     */
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }
}