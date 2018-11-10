package cn.thinkfree.database.mapper;

import cn.thinkfree.database.model.DesignerStyleRelation;
import cn.thinkfree.database.model.DesignerStyleRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DesignerStyleRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table designer_style_relation
     *
     * @mbg.generated
     */
    long countByExample(DesignerStyleRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table designer_style_relation
     *
     * @mbg.generated
     */
    int deleteByExample(DesignerStyleRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table designer_style_relation
     *
     * @mbg.generated
     */
    int insert(DesignerStyleRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table designer_style_relation
     *
     * @mbg.generated
     */
    int insertSelective(DesignerStyleRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table designer_style_relation
     *
     * @mbg.generated
     */
    List<DesignerStyleRelation> selectByExample(DesignerStyleRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table designer_style_relation
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DesignerStyleRelation record, @Param("example") DesignerStyleRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table designer_style_relation
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DesignerStyleRelation record, @Param("example") DesignerStyleRelationExample example);
}