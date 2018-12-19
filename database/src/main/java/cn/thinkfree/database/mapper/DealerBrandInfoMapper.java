package cn.thinkfree.database.mapper;

import cn.thinkfree.database.model.DealerBrandInfo;
import cn.thinkfree.database.model.DealerBrandInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DealerBrandInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_dealer_brand_info
     *
     * @mbg.generated
     */
    long countByExample(DealerBrandInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_dealer_brand_info
     *
     * @mbg.generated
     */
    int deleteByExample(DealerBrandInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_dealer_brand_info
     *
     * @mbg.generated
     */
    int insert(DealerBrandInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_dealer_brand_info
     *
     * @mbg.generated
     */
    int insertSelective(DealerBrandInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_dealer_brand_info
     *
     * @mbg.generated
     */
    List<DealerBrandInfo> selectByExample(DealerBrandInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_dealer_brand_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DealerBrandInfo record, @Param("example") DealerBrandInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pc_dealer_brand_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DealerBrandInfo record, @Param("example") DealerBrandInfoExample example);
}