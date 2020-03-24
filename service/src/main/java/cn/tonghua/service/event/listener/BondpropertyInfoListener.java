package cn.tonghua.service.event.listener;

import cn.tonghua.core.logger.AbsLogPrinter;
import cn.tonghua.database.event.BondpropertyInfoEvent;
import cn.tonghua.database.mapper.BondpropertyInfoMapper;
import cn.tonghua.database.model.BondpropertyInfo;
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
public class BondpropertyInfoListener extends AbsLogPrinter {

    @Autowired
    BondpropertyInfoMapper bondpropertyInfoMapper;
    /**
     * 废弃不用
     */
    @EventListener
    @Async
    public void staffinfo(BondpropertyInfoEvent bondpropertyInfoEvent) throws InterruptedException {

        FileInputStream in =null;
        try {
            // 读取本地文件游客模式题库
            in=new FileInputStream(bondpropertyInfoEvent.getSource());
        } catch (FileNotFoundException e) {
            printErrorMes("读本地文件异常");
            e.printStackTrace();
        }
        // 拼接解析Excel字段
        List<ExcelToListMap.TableTitle> map = new ArrayList<>();
        ExcelToListMap.TableTitle PRD_NAME = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle PRD_CODE = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle FACE_RATE = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle PSUB_UNIT = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle CURR_TYPE = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle EXIST_LIMIT = new ExcelToListMap.TableTitle();

        PRD_NAME.setToTitle("PRD_NAME");
        PRD_CODE.setToTitle("PRD_CODE");
        FACE_RATE.setToTitle("FACE_RATE");
        PSUB_UNIT.setToTitle("PSUB_UNIT");
        CURR_TYPE.setToTitle("CURR_TYPE");
        EXIST_LIMIT.setToTitle("EXIST_LIMIT");

        PRD_NAME.setExcelTitle("PRD_NAME");
        PRD_CODE.setExcelTitle("PRD_CODE");
        FACE_RATE.setExcelTitle("FACE_RATE");
        PSUB_UNIT.setExcelTitle("PSUB_UNIT");
        CURR_TYPE.setExcelTitle("CURR_TYPE");
        EXIST_LIMIT.setExcelTitle("EXIST_LIMIT");

        map.add(PRD_NAME);
        map.add(PRD_CODE);
        map.add(FACE_RATE);
        map.add(PSUB_UNIT);
        map.add(CURR_TYPE);
        map.add(EXIST_LIMIT);

        List<Map<String, String>> maps = new ArrayList<>();
        List<BondpropertyInfo> bondpropertyInfos = new ArrayList<>();
        try {
            maps = ExcelToListMap.analysis(in,map);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
        maps.forEach(e->{
            BondpropertyInfo bondpropertyInfo = new BondpropertyInfo();
            bondpropertyInfo.setPrdName(e.get("PRD_NAME"));
            bondpropertyInfo.setPrdCode(e.get("PRD_CODE"));
            bondpropertyInfo.setFaceRate(e.get("FACE_RATE"));
            bondpropertyInfo.setPsubUnit(e.get("PSUB_UNIT"));
            bondpropertyInfo.setCurrType(CommonGroupUtils.moneyConvert(e.get("CURR_TYPE")));
            bondpropertyInfo.setExistLimit(e.get("EXIST_LIMIT").replace("M","月").replace("Y","年"));
            bondpropertyInfos.add(bondpropertyInfo);
            bondpropertyInfoMapper.insertSelective(bondpropertyInfo);
        });
    }

}
