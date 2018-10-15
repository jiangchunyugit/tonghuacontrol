package cn.thinkfree.database.mapper;

import cn.thinkfree.database.model.CityBranch;
import cn.thinkfree.database.model.CityBranchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CityBranchMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_city_branch
     *
     * @mbg.generated
     */
    long countByExample(CityBranchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_city_branch
     *
     * @mbg.generated
     */
    int deleteByExample(CityBranchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_city_branch
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_city_branch
     *
     * @mbg.generated
     */
    int insert(CityBranch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_city_branch
     *
     * @mbg.generated
     */
    int insertSelective(CityBranch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_city_branch
     *
     * @mbg.generated
     */
    List<CityBranch> selectByExample(CityBranchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_city_branch
     *
     * @mbg.generated
     */
    CityBranch selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_city_branch
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CityBranch record, @Param("example") CityBranchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_city_branch
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CityBranch record, @Param("example") CityBranchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_city_branch
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CityBranch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_city_branch
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CityBranch record);
}