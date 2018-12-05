package cn.thinkfree.database.mapper;

import cn.thinkfree.database.appvo.PersionVo;
import cn.thinkfree.database.model.EmployeeMsg;
import cn.thinkfree.database.model.EmployeeMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMsgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_msg
     *
     * @mbg.generated
     */
    long countByExample(EmployeeMsgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_msg
     *
     * @mbg.generated
     */
    int deleteByExample(EmployeeMsgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_msg
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_msg
     *
     * @mbg.generated
     */
    int insert(EmployeeMsg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_msg
     *
     * @mbg.generated
     */
    int insertSelective(EmployeeMsg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_msg
     *
     * @mbg.generated
     */
    List<EmployeeMsg> selectByExample(EmployeeMsgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_msg
     *
     * @mbg.generated
     */
    EmployeeMsg selectByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_msg
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EmployeeMsg record, @Param("example") EmployeeMsgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_msg
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EmployeeMsg record, @Param("example") EmployeeMsgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_msg
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EmployeeMsg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_msg
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EmployeeMsg record);

    /**
     * 根据人员id查询人员信息
     * @param userId
     * @return
     */
    PersionVo selectByUserId(@Param("userId") String userId);

    List<PersionVo> selectAllByUserId(@Param("userId") String userId);

    List<EmployeeMsg> selectForUserId(String userId);
}