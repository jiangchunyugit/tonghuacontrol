package cn.thinkfree.database.mapper;

import cn.thinkfree.database.model.PcApplyInfo;
import cn.thinkfree.database.model.PcApplyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PcApplyInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_apply_info
     *
     * @mbg.generated
     */
    long countByExample(PcApplyInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_apply_info
     *
     * @mbg.generated
     */
    int deleteByExample(PcApplyInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_apply_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_apply_info
     *
     * @mbg.generated
     */
    int insert(PcApplyInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_apply_info
     *
     * @mbg.generated
     */
    int insertSelective(PcApplyInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_apply_info
     *
     * @mbg.generated
     */
    List<PcApplyInfo> selectByExample(PcApplyInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_apply_info
     *
     * @mbg.generated
     */
    PcApplyInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_apply_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") PcApplyInfo record, @Param("example") PcApplyInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_apply_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") PcApplyInfo record, @Param("example") PcApplyInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_apply_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(PcApplyInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_apply_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PcApplyInfo record);
}