package cn.tonghua.service.startmachine;

import cn.tonghua.core.bundle.MyRespBundle;
import cn.tonghua.database.model.ProjectManager;

public interface StartMachineService {

//    /**
//     * 启动程序
//     * @param servieceNm
//     * @return
//     */
//    MyRespBundle startMachine(String servieceNm);
//
//    /**
//     * 一键全开
//     * @return
//     */
//    MyRespBundle startMachine();

    /**
     * 青岛银行中控
     * @return
     */
    boolean startProject(ProjectManager projectManager);
}
