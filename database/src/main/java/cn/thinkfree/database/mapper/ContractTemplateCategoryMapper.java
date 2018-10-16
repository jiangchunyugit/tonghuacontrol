package cn.thinkfree.database.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.thinkfree.database.model.ContractTemplateCategory;
import cn.thinkfree.database.model.ContractTemplateCategoryExample;

public interface ContractTemplateCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_contract_template_category
     *
     * @mbg.generated
     */
    long countByExample(ContractTemplateCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_contract_template_category
     *
     * @mbg.generated
     */
    int deleteByExample(ContractTemplateCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_contract_template_category
     *
     * @mbg.generated
     */
    int insert(ContractTemplateCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_contract_template_category
     *
     * @mbg.generated
     */
    int insertSelective(ContractTemplateCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_contract_template_category
     *
     * @mbg.generated
     */
    List<ContractTemplateCategory> selectByExample(ContractTemplateCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_contract_template_category
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ContractTemplateCategory record, @Param("example") ContractTemplateCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_contract_template_category
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ContractTemplateCategory record, @Param("example") ContractTemplateCategoryExample example);
    
    
    
    /**
     * 查询分类 
     * @param example
     * @return
     */
    List<ContractTemplateCategory> selectContractTemplateCategoryByType(ContractTemplateCategory example);
}