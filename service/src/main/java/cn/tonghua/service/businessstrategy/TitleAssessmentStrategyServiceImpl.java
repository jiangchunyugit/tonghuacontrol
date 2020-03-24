package cn.tonghua.service.businessstrategy;

import cn.tonghua.core.constants.AnalysisStateEnum;
import cn.tonghua.core.event.BaseEvent;
import cn.tonghua.database.event.AssessmentEvent;
import cn.tonghua.database.event.NoticeInfoEvent;
import cn.tonghua.database.model.FtpManager;
import cn.tonghua.service.event.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jiang
 * @Date 2019/12/30
 * @Description 知识乐园解析解析策略+工厂模式
 */
public class TitleAssessmentStrategyServiceImpl implements BusinessStrategyService {

    @Override
    public BaseEvent analysis(FtpManager ftpManager) {
        return new AssessmentEvent(ftpManager.getLocalPath());
    }

    @Override
    public int getType() {
        return AnalysisStateEnum.TITLE_3_3.getState();
    }
}
