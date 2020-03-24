package cn.tonghua.service.businessstrategy;

import cn.tonghua.core.constants.AnalysisStateEnum;
import cn.tonghua.core.event.BaseEvent;
import cn.tonghua.database.event.NoticeInfoEvent;
import cn.tonghua.database.event.TouristEvent;
import cn.tonghua.database.model.FtpManager;
import cn.tonghua.service.event.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jiang
 * @Date 2019/12/30
 * @Description 知识乐园解析解析策略+工厂模式
 */
public class TitleTouristStrategyServiceImpl implements BusinessStrategyService {

    @Override
    public BaseEvent analysis(FtpManager ftpManager) {
        return new TouristEvent(ftpManager.getLocalPath());
    }

    @Override
    public int getType() {
        return AnalysisStateEnum.TITLE_3_1.getState();
    }
}
