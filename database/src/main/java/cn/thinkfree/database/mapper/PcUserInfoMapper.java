package cn.thinkfree.database.mapper;

import cn.thinkfree.database.model.PcUserInfo;
import cn.thinkfree.database.model.PcUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PcUserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_user_info
     *
     * @mbg.generated
     */
    long countByExample(PcUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_user_info
     *
     * @mbg.generated
     */
    int deleteByExample(PcUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_user_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_user_info
     *
     * @mbg.generated
     */
    int insert(PcUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_user_info
     *
     * @mbg.generated
     */
    int insertSelective(PcUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_user_info
     *
     * @mbg.generated
     */
    List<PcUserInfo> selectByExample(PcUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_user_info
     *
     * @mbg.generated
     */
    PcUserInfo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_user_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") PcUserInfo record, @Param("example") PcUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_user_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") PcUserInfo record, @Param("example") PcUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_user_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(PcUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_user_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PcUserInfo record);
}