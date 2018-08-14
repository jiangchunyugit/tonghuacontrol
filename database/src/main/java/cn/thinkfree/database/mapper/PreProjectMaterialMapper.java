package cn.thinkfree.database.mapper;

import cn.thinkfree.database.model.PreProjectMaterial;
import cn.thinkfree.database.model.PreProjectMaterialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PreProjectMaterialMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_project_material
     *
     * @mbg.generated
     */
    long countByExample(PreProjectMaterialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_project_material
     *
     * @mbg.generated
     */
    int deleteByExample(PreProjectMaterialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_project_material
     *
     * @mbg.generated
     */
    int insert(PreProjectMaterial record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_project_material
     *
     * @mbg.generated
     */
    int insertSelective(PreProjectMaterial record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_project_material
     *
     * @mbg.generated
     */
    List<PreProjectMaterial> selectByExample(PreProjectMaterialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_project_material
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") PreProjectMaterial record, @Param("example") PreProjectMaterialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_project_material
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") PreProjectMaterial record, @Param("example") PreProjectMaterialExample example);
}