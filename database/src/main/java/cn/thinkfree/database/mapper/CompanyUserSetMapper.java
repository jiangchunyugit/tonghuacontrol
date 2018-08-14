package cn.thinkfree.database.mapper;

import cn.thinkfree.database.model.CompanyUserSet;
import cn.thinkfree.database.model.CompanyUserSetExample;
import java.util.List;

import cn.thinkfree.database.vo.IndexUserReportVO;
import org.apache.ibatis.annotations.Param;

public interface CompanyUserSetMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_user_set
     *
     * @mbg.generated
     */
    long countByExample(CompanyUserSetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_user_set
     *
     * @mbg.generated
     */
    int deleteByExample(CompanyUserSetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_user_set
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_user_set
     *
     * @mbg.generated
     */
    int insert(CompanyUserSet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_user_set
     *
     * @mbg.generated
     */
    int insertSelective(CompanyUserSet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_user_set
     *
     * @mbg.generated
     */
    List<CompanyUserSet> selectByExample(CompanyUserSetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_user_set
     *
     * @mbg.generated
     */
    CompanyUserSet selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_user_set
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CompanyUserSet record, @Param("example") CompanyUserSetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_user_set
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CompanyUserSet record, @Param("example") CompanyUserSetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_user_set
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CompanyUserSet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_user_set
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CompanyUserSet record);


    /**
     * 汇总公司员工信息
     * @param companyID
     */
    IndexUserReportVO countCompanyUser(String companyID);
}