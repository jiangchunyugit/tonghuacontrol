package cn.thinkfree.service.citybranch;

import cn.thinkfree.database.model.City;
import cn.thinkfree.database.model.CityBranch;
import cn.thinkfree.database.vo.CityBranchSEO;
import cn.thinkfree.database.vo.CityBranchVO;
import cn.thinkfree.database.vo.CityBranchWtihProCitVO;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author jiangchunyu 城市分站service接口
 */
public interface CityBranchService {

    /**
     * 添加城市分站
     */
    int addCityBranch(CityBranchVO cityBranchVO);

    /**
     * 修改城市分站信息
     */
    int updateCityBranch(CityBranchVO cityBranchVO);

    /**
     * 查询城市分站信息
     */
    PageInfo<CityBranchVO> cityBranchList(CityBranchSEO cityBranchSEO);

    /**
     * 分公司查看详细城市分站
     */
    PageInfo<CityBranchWtihProCitVO> cityBranchWithProList(CityBranchSEO cityBranchSEO);

    /**
     * 根据城市分站id查询详情(带有店面信息)
     */
    CityBranchVO cityBranchDetails(Integer id);

    /**
     * 城市分站list
     * @return
     */
    List<CityBranch> cityBranchs();

    /**
     * 更新城市分站状态（启动，禁用，删除）
     * @return
     */
    int updateCityBranchStatus(CityBranch cityBranch);

    /**
     * 根据省市查询城市分站
     */
    List<CityBranch> selectByProCit(Integer province,Integer city);

    /**
     * 城市分站城市信息
     * @return
     */
    List<City> selectCity();

    /**
     * 编辑回写
     * @param id
     * @return
     */
    CityBranchVO cityBranchById (Integer id);
}
