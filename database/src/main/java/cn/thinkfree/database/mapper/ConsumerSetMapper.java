package cn.thinkfree.database.mapper;

import cn.thinkfree.database.model.Area;
import cn.thinkfree.database.model.AreaExample;
import cn.thinkfree.database.model.ConsumerSet;
import cn.thinkfree.database.model.ConsumerSetExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ConsumerSetMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated
     */
    long countByExample(ConsumerSetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated
     */
    int deleteByExample(ConsumerSetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated
     */
    int insert(ConsumerSet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated
     */
    int insertSelective(ConsumerSet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated
     */
    List<ConsumerSet> selectByExample(ConsumerSetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated
     */
    ConsumerSet selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ConsumerSet record, @Param("example") ConsumerSetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ConsumerSet record, @Param("example") ConsumerSetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ConsumerSet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ConsumerSet record);
}