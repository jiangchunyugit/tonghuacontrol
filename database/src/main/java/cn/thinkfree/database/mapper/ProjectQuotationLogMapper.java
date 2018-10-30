package cn.thinkfree.database.mapper;

import cn.thinkfree.database.model.ProjectBigScheduling;
import cn.thinkfree.database.model.ProjectQuotationLog;
import cn.thinkfree.database.model.ProjectQuotationLogExample;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

public interface ProjectQuotationLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_quotation_log
     *
     * @mbg.generated
     */
    long countByExample(ProjectQuotationLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_quotation_log
     *
     * @mbg.generated
     */
    int deleteByExample(ProjectQuotationLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_quotation_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_quotation_log
     *
     * @mbg.generated
     */
    int insert(ProjectQuotationLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_quotation_log
     *
     * @mbg.generated
     */
    int insertSelective(ProjectQuotationLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_quotation_log
     *
     * @mbg.generated
     */
    List<ProjectQuotationLog> selectByExample(ProjectQuotationLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_quotation_log
     *
     * @mbg.generated
     */
    ProjectQuotationLog selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_quotation_log
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ProjectQuotationLog record, @Param("example") ProjectQuotationLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_quotation_log
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ProjectQuotationLog record, @Param("example") ProjectQuotationLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_quotation_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ProjectQuotationLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_quotation_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ProjectQuotationLog record);

    /**
     * 获取排期基础数据
     * @param projectNo
     * @return
     */
    Set<Integer> selectByProjectNo(String projectNo);
}