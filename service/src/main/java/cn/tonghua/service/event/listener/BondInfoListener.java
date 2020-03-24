package cn.tonghua.service.event.listener;

import cn.tonghua.core.logger.AbsLogPrinter;
import cn.tonghua.database.event.BondInfoEvent;
import cn.tonghua.database.mapper.BondInfoMapper;
import cn.tonghua.database.model.BondInfo;
import cn.tonghua.service.utils.CommonGroupUtils;
import cn.tonghua.service.utils.ExcelToListMap;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author jiangchunyu(后台)
 * @date 20191230
 * @Description远程端同步数据监听器
 */
@Component
public class BondInfoListener extends AbsLogPrinter {

    @Autowired
    BondInfoMapper bondInfoMapper;
    /**
     * 废弃不用
     */
    @EventListener
    @Async
    public void staffinfo(BondInfoEvent bondInfoEvent) throws InterruptedException {

        FileInputStream in =null;
        try {
            // 读取本地文件游客模式题库
            in=new FileInputStream(bondInfoEvent.getSource());
        } catch (FileNotFoundException e) {
            printErrorMes("读本地文件异常");
            e.printStackTrace();
        }
        // 拼接解析Excel字段
        List<ExcelToListMap.TableTitle> map = new ArrayList<>();
        ExcelToListMap.TableTitle ZQDM = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle ZQQC = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle ZQQM = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle ZQLB = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle FXKSRQ = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle FXJSRQ = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle QXR = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle DQR = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle GRGMSX = new ExcelToListMap.TableTitle();


        ZQDM.setToTitle("ZQDM");
        ZQQC.setToTitle("ZQQC");
        ZQQM.setToTitle("ZQQM");
        ZQLB.setToTitle("ZQLB");
        FXKSRQ.setToTitle("FXKSRQ");
        FXJSRQ.setToTitle("FXJSRQ");
        QXR.setToTitle("QXR");
        DQR.setToTitle("DQR");
        GRGMSX.setToTitle("GRGMSX");

        ZQDM.setExcelTitle("ZQDM");
        ZQQC.setExcelTitle("ZQQC");
        ZQQM.setExcelTitle("ZQQM");
        ZQLB.setExcelTitle("ZQLB");
        FXKSRQ.setExcelTitle("FXKSRQ");
        FXJSRQ.setExcelTitle("FXJSRQ");
        QXR.setExcelTitle("QXR");
        DQR.setExcelTitle("DQR");
        GRGMSX.setExcelTitle("GRGMSX");

        map.add(ZQDM);
        map.add(ZQQC);
        map.add(ZQQM);
        map.add(ZQLB);
        map.add(FXKSRQ);
        map.add(FXJSRQ);
        map.add(QXR);
        map.add(DQR);
        map.add(GRGMSX);


        List<Map<String, String>> maps = new ArrayList<>();
        List<BondInfo> bondInfos = new ArrayList<>();
        try {
            maps = ExcelToListMap.analysis(in,map);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
        maps.forEach(e->{
            BondInfo bondInfo = new BondInfo();

            bondInfo.setZqdm(e.get("ZQDM"));
            bondInfo.setZqqc(e.get("ZQQC"));
            bondInfo.setZqqm(e.get("ZQQM"));
            bondInfo.setZqlb(CommonGroupUtils.bondinfoConvert(e.get("ZQLB")));
            bondInfo.setFxksrq(e.get("FXKSRQ"));
            bondInfo.setFxjsrq(e.get("FXJSRQ"));
            bondInfo.setQxr(e.get("QXR"));
            bondInfo.setDqr(e.get("DQR"));
            bondInfo.setGrgmsx(e.get("GRGMSX"));
            bondInfos.add(bondInfo);
            bondInfoMapper.insertSelective(bondInfo);
        });
    }
}
