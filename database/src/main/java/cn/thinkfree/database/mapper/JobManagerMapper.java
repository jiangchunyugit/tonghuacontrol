package cn.thinkfree.database.mapper;

import cn.thinkfree.database.model.JobManager;
import cn.thinkfree.database.model.JobManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobManagerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_manager
     *
     * @mbg.generated
     */
    long countByExample(JobManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_manager
     *
     * @mbg.generated
     */
    int deleteByExample(JobManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_manager
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_manager
     *
     * @mbg.generated
     */
    int insert(JobManager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_manager
     *
     * @mbg.generated
     */
    int insertSelective(JobManager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_manager
     *
     * @mbg.generated
     */
    List<JobManager> selectByExample(JobManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_manager
     *
     * @mbg.generated
     */
    JobManager selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_manager
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") JobManager record, @Param("example") JobManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_manager
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") JobManager record, @Param("example") JobManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_manager
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(JobManager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_manager
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(JobManager record);

    Integer getJobOff(@Param("jobName") String jobName);

    void updateJobStatus(@Param("jobName") String jobName,@Param("status") String status);
}