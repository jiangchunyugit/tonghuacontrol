package cn.thinkfree.database.mapper;

import cn.thinkfree.database.model.StoreInfo;
import cn.thinkfree.database.model.StoreInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_store_info
     *
     * @mbg.generated
     */
    long countByExample(StoreInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_store_info
     *
     * @mbg.generated
     */
    int deleteByExample(StoreInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_store_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_store_info
     *
     * @mbg.generated
     */
    int insert(StoreInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_store_info
     *
     * @mbg.generated
     */
    int insertSelective(StoreInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_store_info
     *
     * @mbg.generated
     */
    List<StoreInfo> selectByExample(StoreInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_store_info
     *
     * @mbg.generated
     */
    StoreInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_store_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") StoreInfo record, @Param("example") StoreInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_store_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") StoreInfo record, @Param("example") StoreInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_store_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(StoreInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_store_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(StoreInfo record);
}