package cn.tonghua.database.mapper;

import cn.tonghua.database.model.LeaveComments;
import cn.tonghua.database.model.LeaveCommentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeaveCommentsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table leave_comments
     *
     * @mbg.generated
     */
    long countByExample(LeaveCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table leave_comments
     *
     * @mbg.generated
     */
    int deleteByExample(LeaveCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table leave_comments
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table leave_comments
     *
     * @mbg.generated
     */
    int insert(LeaveComments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table leave_comments
     *
     * @mbg.generated
     */
    int insertSelective(LeaveComments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table leave_comments
     *
     * @mbg.generated
     */
    List<LeaveComments> selectByExample(LeaveCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table leave_comments
     *
     * @mbg.generated
     */
    LeaveComments selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table leave_comments
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LeaveComments record, @Param("example") LeaveCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table leave_comments
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LeaveComments record, @Param("example") LeaveCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table leave_comments
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LeaveComments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table leave_comments
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LeaveComments record);
}