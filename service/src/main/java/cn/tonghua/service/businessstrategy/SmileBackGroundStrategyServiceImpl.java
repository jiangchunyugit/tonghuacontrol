package cn.tonghua.service.businessstrategy;

import cn.tonghua.core.constants.AnalysisStateEnum;
import cn.tonghua.core.event.BaseEvent;
import cn.tonghua.database.event.SmileBackGroundEvent;
import cn.tonghua.database.event.StaffinfoEvent;
import cn.tonghua.database.model.FtpManager;

/**
 * @author jiang
 * @Date 2019/12/30
 * @Description 微笑打分解析解析策略+工厂模式
 */
public class SmileBackGroundStrategyServiceImpl implements BusinessStrategyService{

    @Override
    public BaseEvent analysis(FtpManager ftpManager) {
        return new SmileBackGroundEvent(ftpManager.getLocalPath());
    }

    @Override
    public int getType() {
        return AnalysisStateEnum.SMILE_2_1.getState();
    }
}
