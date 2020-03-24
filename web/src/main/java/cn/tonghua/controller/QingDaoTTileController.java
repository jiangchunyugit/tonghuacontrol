package cn.tonghua.controller;


import cn.tonghua.core.annotation.MyRespBody;
import cn.tonghua.core.base.AbsBaseController;
import cn.tonghua.core.bundle.MyRespBundle;
import cn.tonghua.core.constants.ResultMessage;
import cn.tonghua.database.event.AssessmentEvent;
import cn.tonghua.database.event.CompetitiveEvent;
import cn.tonghua.database.event.ConductInfoEvent;
import cn.tonghua.database.event.TouristEvent;
import cn.tonghua.database.model.DownloadError;
import cn.tonghua.database.vo.TitleVO;
import cn.tonghua.service.dowanloaderror.DownLoadErrorService;
import cn.tonghua.service.event.EventService;
import cn.tonghua.service.ftp.FTPClientService;
import cn.tonghua.service.htmlcovertext.Html2TextService;
import cn.tonghua.service.ttile.TTileService;
import cn.tonghua.service.utils.CommonGroupUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.net.ftp.FTPConnectionClosedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.Date;
import java.util.List;


/**
 * @author jiangchunyu(后台)
 * @date 2019
 * @Description
 */
@RestController
@RequestMapping(value = "/title")
@Api(value = "青岛银行趣味问答---蒋春雨",description = "青岛银行趣味问答---蒋春雨")
public class QingDaoTTileController extends AbsBaseController {

    @Autowired
    TTileService tTileService;

    @Autowired
    FTPClientService ftpClientService;


    /**
     * 问题信息
     */
    @GetMapping(value = "/titles")
    @MyRespBody
    @ApiOperation(value="问题")
    public MyRespBundle<List<TitleVO>> leaveCommentslist(@ApiParam("答题模式（0：娱乐，1：竞技，3：考核）")@RequestParam(value = "mode") String mode, @ApiParam("题目类型只有在考核模式时传题目类型其他模式不限制(1:基金,2:理财,3:信用2,4:融资,5:信用,6:股票)(模式和类型中控会给趣味问答传过来)") String titletypeId
    ){
        return sendJsonData(ResultMessage.SUCCESS, tTileService.tTiles());
    }

    /**
     * 问题信息
     */
    @PostMapping(value = "/upload")
    @MyRespBody
    @ApiOperation(value="问题")
    public MyRespBundle<String> uploadtoftp(@RequestParam("file") MultipartFile file, @RequestParam(value = "localpath") String localpath, @RequestParam(value = "ftppath") String ftppath, @RequestParam(value = "filename") String filename){

        try {
          InputStream inputStream = new FileInputStream(new File(localpath));
            ftpClientService.uploadToFtp(file.getInputStream(),filename,false,ftppath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (FTPConnectionClosedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sendJsonData(ResultMessage.SUCCESS, "succeed");
    }

    @Autowired
    EventService eventService;

    /**
     * 问题信息
     */
    @GetMapping(value = "/download")
    @MyRespBody
    @ApiOperation(value="问题")
    public MyRespBundle<String> download() throws IOException {

// @RequestParam("file") MultipartFile file

        String localpath ="D:\\ftpserver\\notice";
        String resultInfo = null;
        File file = new File(localpath);
        if (file.exists()) {
            if (CommonGroupUtils.deleteDir(localpath)) {
                resultInfo =  "1-删除成功";
            } else {
                resultInfo =  "0-删除失败";
            }
        } else {
            file.mkdir();
        }

        ftpClientService.downloadFile();
//        eventService.publish(new TouristEvent("D:\\ftpserver\\notice\\titleInfo01.xlsx"));
//        eventService.publish(new CompetitiveEvent("D:\\ftpserver\\notice\\titleInfo02.xlsx"));
//        eventService.publish(new AssessmentEvent("D:\\ftpserver\\notice\\titleInfo03.xlsx"));

        return sendJsonData(ResultMessage.SUCCESS, "success");
    }
    /**
     * 用户登入
     */
    @GetMapping(value = "/login")
    @MyRespBody
    @ApiOperation(value="登入")
    public MyRespBundle<String> login(@RequestParam(value = "orgCode") String orgCode, @RequestParam(value = "machineCode") String machineCode, @RequestParam(value = "name") String name) throws IOException {

        return sendJsonData(ResultMessage.SUCCESS, "success");
    }

    @Autowired
    Html2TextService html2TextService;

    @Autowired
    DownLoadErrorService downLoadErrorService;

    /**
     * 测试
     */
    @PostMapping(value = "/test")
    @MyRespBody
    @ApiOperation(value="测试")
    public MyRespBundle<String> tests(@RequestParam(value = "test") String test) throws IOException {

//        eventService.publish(new ConductInfoEvent("D:\\ftpserver\\notice\\noticeInfo.xlsx"));
//        DownloadError downloadError = new DownloadError();
//        downloadError.setUrl("测试");
//        downloadError.setCreatTime(new Date());
//        boolean cedhsi = downLoadErrorService.errorInsert(downloadError);
//        if (cedhsi) {
//            return sendFailMessage("shibia");
//        }

        html2TextService.test();
        return sendSuccessMessage("chengg");
//        return sendJsonData(ResultMessage.SUCCESS, html2TextService.parse(test));
    }
}

