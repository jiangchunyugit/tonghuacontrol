package cn.thinkfree.database.mapper;

import cn.thinkfree.database.model.ApprovalFlowFormElement;
import cn.thinkfree.database.model.ApprovalFlowOptions;
import cn.thinkfree.database.model.ApprovalFlowOptionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApprovalFlowOptionsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval_flow_options
     *
     * @mbg.generated
     */
    long countByExample(ApprovalFlowOptionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval_flow_options
     *
     * @mbg.generated
     */
    int deleteByExample(ApprovalFlowOptionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval_flow_options
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval_flow_options
     *
     * @mbg.generated
     */
    int insert(ApprovalFlowOptions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval_flow_options
     *
     * @mbg.generated
     */
    int insertSelective(ApprovalFlowOptions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval_flow_options
     *
     * @mbg.generated
     */
    List<ApprovalFlowOptions> selectByExample(ApprovalFlowOptionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval_flow_options
     *
     * @mbg.generated
     */
    ApprovalFlowOptions selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval_flow_options
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ApprovalFlowOptions record, @Param("example") ApprovalFlowOptionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval_flow_options
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ApprovalFlowOptions record, @Param("example") ApprovalFlowOptionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval_flow_options
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ApprovalFlowOptions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval_flow_options
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ApprovalFlowOptions record);

    List<ApprovalFlowOptions> findByExternalUniqueCode(String ExternalUniqueCode);
}