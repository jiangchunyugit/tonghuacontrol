package cn.tonghua.database.recogwall;

import java.util.List;

public class WallData {

    private String cusCode;

    private String examineDt;

    private String examineTime;

    private String examineScore;

    private String moreLastexamineScore;

    private List<CacuRestAstcatcdetls> cacuRestAstcatcdetls;

    private List<Propools> propools;

    public List<CacuRestAstcatcdetls> getCacuRestAstcatcdetls() {
        return cacuRestAstcatcdetls;
    }

    public void setCacuRestAstcatcdetls(List<CacuRestAstcatcdetls> cacuRestAstcatcdetls) {
        this.cacuRestAstcatcdetls = cacuRestAstcatcdetls;
    }

    public List<Propools> getPropools() {
        return propools;
    }

    public void setPropools(List<Propools> propools) {
        this.propools = propools;
    }

    public String getCusCode() {
        return cusCode;
    }

    public void setCusCode(String cusCode) {
        this.cusCode = cusCode;
    }

    public String getExamineDt() {
        return examineDt;
    }

    public void setExamineDt(String examineDt) {
        this.examineDt = examineDt;
    }

    public String getExamineTime() {
        return examineTime;
    }

    public void setExamineTime(String examineTime) {
        this.examineTime = examineTime;
    }

    public String getExamineScore() {
        return examineScore;
    }

    public void setExamineScore(String examineScore) {
        this.examineScore = examineScore;
    }

    public String getMoreLastexamineScore() {
        return moreLastexamineScore;
    }

    public void setMoreLastexamineScore(String moreLastexamineScore) {
        this.moreLastexamineScore = moreLastexamineScore;
    }
}
