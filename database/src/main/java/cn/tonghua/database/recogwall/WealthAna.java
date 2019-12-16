package cn.tonghua.database.recogwall;

public class WealthAna {

    private WallData data;

    private WallError error;

    private WallHeader header;

    public WallData getData() {
        return data;
    }

    public void setData(WallData data) {
        this.data = data;
    }

    public WallError getError() {
        return error;
    }

    public void setError(WallError error) {
        this.error = error;
    }

    public WallHeader getHeader() {
        return header;
    }

    public void setHeader(WallHeader header) {
        this.header = header;
    }
}
