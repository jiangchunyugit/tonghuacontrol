package cn.tonghua.service.htmlcovertext;

import java.io.IOException;

public interface Html2TextService {

    String parse(String str) throws IOException;

    void test();
}
