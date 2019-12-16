package cn.tonghua.controller;


import cn.tonghua.core.annotation.MyRespBody;
import cn.tonghua.core.base.AbsBaseController;
import cn.tonghua.core.bundle.MyRespBundle;
import cn.tonghua.core.constants.ResultMessage;
import cn.tonghua.database.model.LeaveComments;
import cn.tonghua.database.model.SiteInfo;
import cn.tonghua.database.model.TTitle;
import cn.tonghua.database.utils.BeanValidator;
import cn.tonghua.database.vo.AnswerVO;
import cn.tonghua.database.vo.FileResourceSEO;
import cn.tonghua.database.vo.Severitys;
import cn.tonghua.service.leavecomments.LeaveCommentsService;
import cn.tonghua.service.question.QuestionService;
import cn.tonghua.service.siteinfo.SiteInfoService;
import cn.tonghua.service.ttile.TTileService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    /**
     * 问题信息
     */
    @GetMapping(value = "/titles")
    @MyRespBody
    @ApiOperation(value="问题")
    public MyRespBundle<List<TTitle>> leaveCommentslist(@ApiParam("答题模式（0：娱乐，1：竞技，3：考核）")@RequestParam(value = "mode") String mode,@ApiParam("题目类型只有在考核模式时传题目类型其他模式不限制(1:基金,2:理财,3:信用2,4:融资,5:信用,6:股票)(模式和类型中控会给趣味问答传过来)") String titletypeId
    ){

        return sendJsonData(ResultMessage.SUCCESS, tTileService.tTiles());
    }

}

