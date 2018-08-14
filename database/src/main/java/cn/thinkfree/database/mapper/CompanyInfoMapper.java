package cn.thinkfree.database.mapper;

import cn.thinkfree.database.model.CompanyInfo;
import cn.thinkfree.database.model.CompanyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbg.generated
     */
    long countByExample(CompanyInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbg.generated
     */
    int deleteByExample(CompanyInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbg.generated
     */
    int insert(CompanyInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbg.generated
     */
    int insertSelective(CompanyInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbg.generated
     */
    List<CompanyInfo> selectByExample(CompanyInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CompanyInfo record, @Param("example") CompanyInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CompanyInfo record, @Param("example") CompanyInfoExample example);
}