package cn.tonghua.service.businessstrategy;

import cn.tonghua.core.constants.AnalysisStateEnum;
import cn.tonghua.core.event.BaseEvent;
import cn.tonghua.database.event.BondpropertyInfoEvent;
import cn.tonghua.database.event.ConductInfoEvent;
import cn.tonghua.database.model.FtpManager;


/**
 * @author jiang
 * @Date 2019/12/30
 * @Description 大事记解析解析策略+工厂模式
 */
public class BondpropertyInfoServiceImpl implements BusinessStrategyService {

    @Override
    public BaseEvent analysis(FtpManager ftpManager) {
        return new BondpropertyInfoEvent(ftpManager.getLocalPath());
    }

    @Override
    public int getType() {
        return AnalysisStateEnum.PRODUCT_BONDPROPERTYINFO_1_3.getState();
    }
}
