package cn.tonghua.database.vo;

import cn.tonghua.database.model.SiteInfo;

import java.util.List;

public class SiteVO extends SiteInfo {

    private List<SiteQuestionVO> siteQuestionVOSs;

    public List<SiteQuestionVO> getSiteQuestionVOSs() {
        return siteQuestionVOSs;
    }

    public void setSiteQuestionVOSs(List<SiteQuestionVO> siteQuestionVOSs) {
        this.siteQuestionVOSs = siteQuestionVOSs;
    }
}
