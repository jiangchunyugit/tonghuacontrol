package cn.thinkfree.database.mapper;

import cn.thinkfree.database.model.MaterialsRemLeaseContract;
import cn.thinkfree.database.model.MaterialsRemLeaseContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialsRemLeaseContractMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table materials_rem_lease_contract
     *
     * @mbg.generated
     */
    long countByExample(MaterialsRemLeaseContractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table materials_rem_lease_contract
     *
     * @mbg.generated
     */
    int deleteByExample(MaterialsRemLeaseContractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table materials_rem_lease_contract
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table materials_rem_lease_contract
     *
     * @mbg.generated
     */
    int insert(MaterialsRemLeaseContract record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table materials_rem_lease_contract
     *
     * @mbg.generated
     */
    int insertSelective(MaterialsRemLeaseContract record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table materials_rem_lease_contract
     *
     * @mbg.generated
     */
    List<MaterialsRemLeaseContract> selectByExample(MaterialsRemLeaseContractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table materials_rem_lease_contract
     *
     * @mbg.generated
     */
    MaterialsRemLeaseContract selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table materials_rem_lease_contract
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MaterialsRemLeaseContract record, @Param("example") MaterialsRemLeaseContractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table materials_rem_lease_contract
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MaterialsRemLeaseContract record, @Param("example") MaterialsRemLeaseContractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table materials_rem_lease_contract
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MaterialsRemLeaseContract record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table materials_rem_lease_contract
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MaterialsRemLeaseContract record);
}