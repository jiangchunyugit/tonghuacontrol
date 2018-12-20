package cn.thinkfree.database.mapper;

import cn.thinkfree.database.model.FundsOrder;
import cn.thinkfree.database.model.FundsOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FundsOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funds_order
     *
     * @mbg.generated
     */
    long countByExample(FundsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funds_order
     *
     * @mbg.generated
     */
    int deleteByExample(FundsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funds_order
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funds_order
     *
     * @mbg.generated
     */
    int insert(FundsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funds_order
     *
     * @mbg.generated
     */
    int insertSelective(FundsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funds_order
     *
     * @mbg.generated
     */
    List<FundsOrder> selectByExample(FundsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funds_order
     *
     * @mbg.generated
     */
    FundsOrder selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funds_order
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FundsOrder record, @Param("example") FundsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funds_order
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FundsOrder record, @Param("example") FundsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funds_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FundsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funds_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FundsOrder record);
}