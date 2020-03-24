package cn.tonghua.service.qingdaobusiness;

import cn.tonghua.database.model.*;
import cn.tonghua.database.vo.ProductVO;
import cn.tonghua.database.vo.SeaWorldProduct;

import java.util.List;

public interface BusinessService {

    /**
     * 文化桌企业信息
     * @return
     */
    List<MerchantWithBLOBs> merchantLists(String type);

    /**
     * 开关机操作
     * @param command
     * @return
     */
    boolean projectOperaton(String command);

    /**
     * 软件切换操作
     * @param command
     * @return
     */
    boolean changeOperaton(String command);

    /**
     * 大事记
     * @return
     */
    List<NoticeInfoWithBLOBs> noticeList();

    /**
     * 产品展示
     * @return
     */
    ProductVO productVO();

    /**
     * 海底世界产品展示
     * @return
     */
    List<SeaWorldProduct> seaWorldProductList();

    /**
     * 贵金属双面屏
     * @param type
     * @return
     */
    List<MetalDoublescreen> metalDoublescreenList(String type);

    /**
     * 一键全开
     */
    boolean allStart();

    /**
     * 一键全关
     */
    boolean allShutDown();
}
