package cn.thinkfree.database.mapper;

import cn.thinkfree.database.appvo.DesignOrderVo;
import cn.thinkfree.database.appvo.OrderPlayVo;
import cn.thinkfree.database.appvo.ProjectOrderDetailVo;
import cn.thinkfree.database.model.DesignerOrder;
import cn.thinkfree.database.model.DesignerOrderExample;
import java.util.List;

import cn.thinkfree.database.vo.AcceptanceResultsVO;
import cn.thinkfree.database.vo.ConstructionContractVO;
import cn.thinkfree.database.vo.DesignContractVO;
import cn.thinkfree.database.vo.ProjectOrderVO;
import org.apache.ibatis.annotations.Param;

public interface DesignerOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table designer_order
     *
     * @mbg.generated
     */
    long countByExample(DesignerOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table designer_order
     *
     * @mbg.generated
     */
    int deleteByExample(DesignerOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table designer_order
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table designer_order
     *
     * @mbg.generated
     */
    int insert(DesignerOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table designer_order
     *
     * @mbg.generated
     */
    int insertSelective(DesignerOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table designer_order
     *
     * @mbg.generated
     */
    List<DesignerOrder> selectByExample(DesignerOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table designer_order
     *
     * @mbg.generated
     */
    DesignerOrder selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table designer_order
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DesignerOrder record, @Param("example") DesignerOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table designer_order
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DesignerOrder record, @Param("example") DesignerOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table designer_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DesignerOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table designer_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DesignerOrder record);
    /**
     * 根据项目编号查询
     * @param projectNo
     * @return
     */
    ProjectOrderDetailVo selectByProjectNo(String projectNo);

    /**
     * 查询项目派单总条数
     * @param projectOrderVO
     * @return
     */
    Integer selectProjectOrderCount(@Param("projectOrderVO")ProjectOrderVO projectOrderVO);
    /**
     * @Author jiang
     * @Description 分页查询项目派单
     * @Date
     * @Param projectOrderVO
     * @return
     **/
    List<ProjectOrderVO> selectProjectOrderByPage(@Param("projectOrderVO") ProjectOrderVO projectOrderVO,@Param("pageNum") Integer pageNum,@Param("pageSize") Integer pageSize);

    OrderPlayVo selectByProjectNoAndStatus(@Param("projectNo") String projectNo, @Param("status") Integer status);

    List<DesignContractVO> selectContractByPage(@Param("designContractVO") DesignContractVO designContractVO, @Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);

    Integer selectContractCount(@Param("designContractVO") DesignContractVO designContractVO);


    List<DesignOrderVo> selectByDesignerId(@Param("designerId") String designerId,@Param("status") Integer status);
}