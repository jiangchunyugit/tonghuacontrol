package cn.tonghua.service.businessstrategy;

import cn.tonghua.core.constants.AnalysisStateEnum;
import cn.tonghua.core.event.BaseEvent;
import cn.tonghua.database.event.CompetitiveEvent;
import cn.tonghua.database.model.FtpManager;

/**
 * @author jiang
 * @Date 2019/12/30
 * @Description 知识乐园解析解析策略+工厂模式
 */
public class TitleCompetitiveStrategyServiceImpl implements BusinessStrategyService {

    @Override
    public BaseEvent analysis(FtpManager ftpManager) {
        return new CompetitiveEvent(ftpManager.getLocalPath());
    }

    @Override
    public int getType() {
        return AnalysisStateEnum.TITLE_3_2.getState();
    }
}
