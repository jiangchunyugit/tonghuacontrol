package cn.tonghua.service.siteinfo;

import cn.tonghua.database.model.SiteInfo;

public interface SiteInfoService {

    /**
     * 查看详情
     * @param id
     * @return
     */
    SiteInfo siteInfo(int id);

    /**
     * 点赞
     * @return
     */
    boolean likeSite(int id);
}
