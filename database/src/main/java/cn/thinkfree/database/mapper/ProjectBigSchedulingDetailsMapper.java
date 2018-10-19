package cn.thinkfree.database.mapper;

import cn.thinkfree.database.model.ProjectBigSchedulingDetails;
import cn.thinkfree.database.model.ProjectBigSchedulingDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectBigSchedulingDetailsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_big_scheduling_details
     *
     * @mbg.generated
     */
    long countByExample(ProjectBigSchedulingDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_big_scheduling_details
     *
     * @mbg.generated
     */
    int deleteByExample(ProjectBigSchedulingDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_big_scheduling_details
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_big_scheduling_details
     *
     * @mbg.generated
     */
    int insert(ProjectBigSchedulingDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_big_scheduling_details
     *
     * @mbg.generated
     */
    int insertSelective(ProjectBigSchedulingDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_big_scheduling_details
     *
     * @mbg.generated
     */
    List<ProjectBigSchedulingDetails> selectByExample(ProjectBigSchedulingDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_big_scheduling_details
     *
     * @mbg.generated
     */
    ProjectBigSchedulingDetails selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_big_scheduling_details
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ProjectBigSchedulingDetails record, @Param("example") ProjectBigSchedulingDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_big_scheduling_details
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ProjectBigSchedulingDetails record, @Param("example") ProjectBigSchedulingDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_big_scheduling_details
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ProjectBigSchedulingDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_big_scheduling_details
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ProjectBigSchedulingDetails record);
    /**
     * 获取排期
     *
     * @param projectNo
     * @param status
     * @return
     */
    List<ProjectBigSchedulingDetails> selectByProjectNo(@Param("projectNo") String projectNo, @Param("status") Integer status);
}