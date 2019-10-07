package cn.tonghua.database.mapper;

import cn.tonghua.database.model.Equipment;
import cn.tonghua.database.model.EquipmentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EquipmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment
     *
     * @mbg.generated
     */
    long countByExample(EquipmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment
     *
     * @mbg.generated
     */
    int deleteByExample(EquipmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment
     *
     * @mbg.generated
     */
    int insert(Equipment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment
     *
     * @mbg.generated
     */
    int insertSelective(Equipment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment
     *
     * @mbg.generated
     */
    List<Equipment> selectByExample(EquipmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment
     *
     * @mbg.generated
     */
    Equipment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Equipment record, @Param("example") EquipmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Equipment record, @Param("example") EquipmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Equipment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Equipment record);
}