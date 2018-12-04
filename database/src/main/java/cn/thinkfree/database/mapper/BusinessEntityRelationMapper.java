package cn.thinkfree.database.mapper;

import cn.thinkfree.database.model.BusinessEntityRelation;
import cn.thinkfree.database.model.BusinessEntityRelationExample;
import java.util.List;

import cn.thinkfree.database.vo.BusinessEntityRelationVO;
import org.apache.ibatis.annotations.Param;

public interface BusinessEntityRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_business_entity_relation
     *
     * @mbg.generated
     */
    long countByExample(BusinessEntityRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_business_entity_relation
     *
     * @mbg.generated
     */
    int deleteByExample(BusinessEntityRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_business_entity_relation
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_business_entity_relation
     *
     * @mbg.generated
     */
    int insert(BusinessEntityRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_business_entity_relation
     *
     * @mbg.generated
     */
    int insertSelective(BusinessEntityRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_business_entity_relation
     *
     * @mbg.generated
     */
    List<BusinessEntityRelation> selectByExample(BusinessEntityRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_business_entity_relation
     *
     * @mbg.generated
     */
    BusinessEntityRelation selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_business_entity_relation
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") BusinessEntityRelation record, @Param("example") BusinessEntityRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_business_entity_relation
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") BusinessEntityRelation record, @Param("example") BusinessEntityRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_business_entity_relation
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(BusinessEntityRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_business_entity_relation
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(BusinessEntityRelation record);

    /**
     * 获取分站门店信息
     * @param businessEntityCode
     * @return
     */
    List<BusinessEntityRelationVO> selectBusinessEntityRelationVO(String businessEntityCode);
}