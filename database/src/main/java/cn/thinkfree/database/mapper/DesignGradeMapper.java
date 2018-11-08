package cn.thinkfree.database.mapper;

import cn.thinkfree.database.model.DesignGrade;
import cn.thinkfree.database.model.DesignGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DesignGradeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design_grade
     *
     * @mbg.generated
     */
    long countByExample(DesignGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design_grade
     *
     * @mbg.generated
     */
    int deleteByExample(DesignGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design_grade
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design_grade
     *
     * @mbg.generated
     */
    int insert(DesignGrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design_grade
     *
     * @mbg.generated
     */
    int insertSelective(DesignGrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design_grade
     *
     * @mbg.generated
     */
    List<DesignGrade> selectByExample(DesignGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design_grade
     *
     * @mbg.generated
     */
    DesignGrade selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design_grade
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DesignGrade record, @Param("example") DesignGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design_grade
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DesignGrade record, @Param("example") DesignGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design_grade
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DesignGrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design_grade
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DesignGrade record);
}