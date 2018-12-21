package cn.thinkfree.database.mapper;

import cn.thinkfree.database.model.FundsFlow;
import cn.thinkfree.database.model.FundsFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FundsFlowMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funds_flow
     *
     * @mbg.generated
     */
    long countByExample(FundsFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funds_flow
     *
     * @mbg.generated
     */
    int deleteByExample(FundsFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funds_flow
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funds_flow
     *
     * @mbg.generated
     */
    int insert(FundsFlow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funds_flow
     *
     * @mbg.generated
     */
    int insertSelective(FundsFlow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funds_flow
     *
     * @mbg.generated
     */
    List<FundsFlow> selectByExample(FundsFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funds_flow
     *
     * @mbg.generated
     */
    FundsFlow selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funds_flow
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FundsFlow record, @Param("example") FundsFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funds_flow
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FundsFlow record, @Param("example") FundsFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funds_flow
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FundsFlow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funds_flow
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FundsFlow record);
}