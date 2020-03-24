package cn.tonghua.service.businessstrategy;

import cn.tonghua.core.event.BaseEvent;
import cn.tonghua.database.model.FtpManager;

public interface BusinessStrategyService {

    /**
     * excel 解析
     * @param ftpManager
     * @return
     */
    BaseEvent analysis(FtpManager ftpManager);

    /**
     * 业务类型
     * @return
     */
    int getType();
}
