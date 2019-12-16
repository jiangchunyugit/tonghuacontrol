package cn.tonghua.service.facerecognition;

import cn.tonghua.database.recogwall.FaceRecognition;
import cn.tonghua.database.recogwall.FaceRecognitionCust;
import cn.tonghua.database.recogwall.FaceRecognitionSEO;
import cn.tonghua.service.utils.Base64Util;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class FaceRecognitionServiceImpl implements FaceRecognitionService {

    @Override
    public FaceRecognition faceRecognition(FaceRecognitionSEO faceRecognitionSEO) {

        FaceRecognition faceRecognition = new FaceRecognition();
        List<FaceRecognitionCust> faceRecognitionCustList = new ArrayList<>();
        faceRecognition.setData(faceRecognitionCustList);
        LocalDateTime localDateTime = LocalDateTime.now();
        String pathName = localDateTime.format(DateTimeFormatter.ISO_DATE);
        String hour = String.valueOf(localDateTime.getHour());
        String minute = String.valueOf(localDateTime.getMinute());
        String second = String.valueOf(localDateTime.getSecond());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("C:\\tonghua\\image\\");
        stringBuilder.append(pathName);
        stringBuilder.append(".");
        stringBuilder.append(hour);
        stringBuilder.append(minute);
        stringBuilder.append(second);
        stringBuilder.append(".jpg");
        if (!"B8D16B518DA58D563A629DB6961CF00A".equals(faceRecognitionSEO.getSignature())) {
            faceRecognition.setRespDesc("签名错误");
            faceRecognition.setRespCode("13004");
            return faceRecognition;
        } else if (!"850".equals(faceRecognitionSEO.getChannel())) {
            faceRecognition.setRespCode("0001");
            faceRecognition.setRespDesc("渠道号不对");
            return faceRecognition;
        } else if (!"3650".equals(faceRecognitionSEO.getOrgCode())) {
            faceRecognition.setRespCode("0001");
            faceRecognition.setRespDesc("请填写上海机构号");
            return faceRecognition;
        } else if (!"SHZT01".equals(faceRecognitionSEO.getStaticDb())) {
            faceRecognition.setRespCode("0001");
            faceRecognition.setRespDesc("请填写上海底码");
            return faceRecognition;
        } else if (Base64Util.imageSize(faceRecognitionSEO.getSceneImg())>100000) {
            faceRecognition.setRespDesc("图片大小不能超过100k");
            faceRecognition.setRespCode("0001");
            return faceRecognition;
        } else if (!Base64Util.generateImage(faceRecognitionSEO.getSceneImg(),stringBuilder.toString())) {
            faceRecognition.setRespDesc("编码格式不对");
            faceRecognition.setRespCode("0001");
            return faceRecognition;
        }
        FaceRecognitionCust faceRecognitionCust = new FaceRecognitionCust();
        faceRecognitionCust.setCustNo("14342343");
        faceRecognitionCust.setScore(BigDecimal.valueOf(0.9));

        if (Integer.valueOf(minute) % 2 != 0) {
            faceRecognitionCustList.add(faceRecognitionCust);
            faceRecognition.setRespCode("0000");
            faceRecognition.setRespDesc("交易成功");
        } else {
            faceRecognition.setRespCode("0002");
            faceRecognition.setRespDesc("未匹配成功");
        }



        return faceRecognition;
    }
}
