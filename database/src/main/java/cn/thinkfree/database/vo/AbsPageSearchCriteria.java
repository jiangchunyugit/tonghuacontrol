package cn.thinkfree.database.vo;

public abstract class AbsPageSearchCriteria {

    /**
     * 每页记录数
     */
    protected Integer rows = 15;
    /**
     * 页号
     */
    protected Integer page = 0;


    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }
}