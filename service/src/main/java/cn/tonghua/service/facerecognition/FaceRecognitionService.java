package cn.tonghua.service.facerecognition;

import cn.tonghua.database.recogwall.FaceRecognition;
import cn.tonghua.database.recogwall.FaceRecognitionSEO;

public interface FaceRecognitionService {

    FaceRecognition faceRecognition(FaceRecognitionSEO faceRecognitionSEO);
}
