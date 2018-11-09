package cn.thinkfree.database.mapper;

import cn.thinkfree.database.model.CompanyRoleResource;
import cn.thinkfree.database.model.CompanyRoleResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyRoleResourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_company_role_resource

     */
    long countByExample(CompanyRoleResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_company_role_resource

     */
    int deleteByExample(CompanyRoleResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_company_role_resource

     */
    int insert(CompanyRoleResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_company_role_resource

     */
    int insertSelective(CompanyRoleResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_company_role_resource

     */
    List<CompanyRoleResource> selectByExample(CompanyRoleResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_company_role_resource

     */
    int updateByExampleSelective(@Param("record") CompanyRoleResource record, @Param("example") CompanyRoleResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_company_role_resource

     */
    int updateByExample(@Param("record") CompanyRoleResource record, @Param("example") CompanyRoleResourceExample example);
}