package cn.tonghua.service.htmlcovertext;

import cn.tonghua.database.mapper.StaffInfoMapper;
import cn.tonghua.database.model.StaffInfo;
import cn.tonghua.database.model.StaffInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;
import java.io.*;

@Service
public class Html2Text extends HTMLEditorKit.ParserCallback implements Html2TextService {

    StringBuffer s;

    @Override
    public String parse(String str) throws IOException {


        str = str.replace("</p>","HH</p>");
        InputStream iin = new ByteArrayInputStream(str.getBytes());
        Reader in = new InputStreamReader(iin);
        s = new StringBuffer();
        ParserDelegator delegator = new ParserDelegator();
        // the third parameter is TRUE to ignore charset directive
        try {
            delegator.parse(in, this, Boolean.TRUE);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            iin.close();
            in.close();
        }
        return s.toString().replace("HH","\n");
    }

    @Override
    public void handleText(char[] text, int pos) {
        s.append(text);
    }

    public String getText() {
        return s.toString();
    }

    @Autowired
    StaffInfoMapper staffInfoMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void test(){

        staffInfoMapper.deleteByExample(new StaffInfoExample());
        StaffInfo staffInfo = new StaffInfo();
        staffInfo.setPhone("dfs");
        staffInfoMapper.insertSelective(staffInfo);

        // todo 主动抛出异常也要测试一下
        // todo 主动回滚
        TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
//        int a =0;
//        int c = 1;
//        int b=0;
//        try {
//            b = c/a;
//        } catch (Exception e) {
//            throw e;
////            e.printStackTrace();
//        }
//        try {
//        try {
//            throw new Exception();
//        } catch (Exception e) {
//            throw e;
//        }
//        } catch (IOException e) {
//             throw e;
//        }
    }
}