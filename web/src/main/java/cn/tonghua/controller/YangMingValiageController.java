package cn.tonghua.controller;


import cn.tonghua.core.annotation.MyRespBody;
import cn.tonghua.core.base.AbsBaseController;
import cn.tonghua.core.bundle.MyRespBundle;
import cn.tonghua.core.constants.ResultMessage;
import cn.tonghua.database.model.LeaveComments;
import cn.tonghua.database.model.SiteInfo;
import cn.tonghua.database.model.UserAnswer;
import cn.tonghua.database.utils.BeanValidator;
import cn.tonghua.database.vo.AnswerVO;
import cn.tonghua.database.vo.FileResourceSEO;
import cn.tonghua.database.vo.Severitys;
import cn.tonghua.service.leavecomments.LeaveCommentsService;
import cn.tonghua.service.question.QuestionService;
import cn.tonghua.service.siteinfo.SiteInfoService;
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
@RequestMapping(value = "/yangming")
@Api(value = "前端使用---阳明古镇---蒋春雨",description = "前端使用---阳明古镇---蒋春雨")
public class YangMingValiageController extends AbsBaseController {

    @Autowired
    LeaveCommentsService leaveCommentsService;

    @Autowired
    SiteInfoService siteInfoService;

    @Autowired
    QuestionService questionService;


    /**
     * 查询留言信息
     */
    @GetMapping(value = "/leavecomments")
    @MyRespBody
    @ApiOperation(value="留言查询")
    public MyRespBundle<PageInfo<LeaveComments>> leaveCommentslist(@ApiParam("查询留言参数")FileResourceSEO fileResourceSEO){

        PageInfo<LeaveComments> pageInfo = leaveCommentsService.leaveCommentsList(fileResourceSEO);

        return sendJsonData(ResultMessage.SUCCESS, pageInfo);
    }

    /**
     * 查询留言信息
     */
    @GetMapping(value = "/leavecommentsbypara")
    @MyRespBody
    @ApiOperation(value="留言查询通过参数")
    public MyRespBundle<PageInfo<LeaveComments>> leaveCommentslistByPara(@ApiParam("查看留言")@RequestParam(value = "page")int  page,@ApiParam("条数")@RequestParam(value = "rows")int rows){

        PageInfo<LeaveComments> pageInfo = leaveCommentsService.leaveCommentsByPara(page,rows);

        return sendJsonData(ResultMessage.SUCCESS, pageInfo);
    }

    /**
     * 保存留言信息
     */
    @RequestMapping(value = "/leavecomment", method = RequestMethod.GET)
    @MyRespBody
    @ApiOperation(value="保存留言")
    public MyRespBundle<String> leaveComment(@ApiParam("留言")@RequestParam(value = "comments")String comments,@ApiParam("景点信息")@RequestParam(value = "id")int id){

        if (leaveCommentsService.saveComments(comments,id)){
            return sendSuccessMessage("操作成功");
        }

        return sendFailMessage("操作失败");
    }

    /**
     * 查询景点信息
     */
    @RequestMapping(value = "/siteinfo", method = RequestMethod.GET)
    @MyRespBody
    @ApiOperation(value="景点查询")
    public MyRespBundle<SiteInfo> siteInfo(@ApiParam("景点id") @RequestParam(value = "id")int id){

        SiteInfo siteInfo = siteInfoService.siteInfo(id);
        return sendJsonData(ResultMessage.SUCCESS, siteInfo);
    }

    /**
     * 保存留言信息
     */
    @RequestMapping(value = "/likesite", method = RequestMethod.GET)
    @MyRespBody
    @ApiOperation(value="点赞")
    public MyRespBundle<String> likeSite(@ApiParam("景点信息")@RequestParam(value = "id") int id){

        if (siteInfoService.likeSite(id)){
            return sendSuccessMessage("操作成功");
        }

        return sendFailMessage("操作失败");
    }

    /**
     * 问卷调查提交
     */
    @RequestMapping(value = "/question", method = RequestMethod.POST)
    @MyRespBody
    @ApiOperation(value="问卷提交")
    public MyRespBundle<String> questionSubmit(@ApiParam("问答信息")@RequestBody AnswerVO answerVO){

        BeanValidator.validate(answerVO, Severitys.Insert.class);
        if (questionService.questionAnswer(answerVO.getAnswerList())){
            return sendSuccessMessage("操作成功");
        }

        return sendFailMessage("操作失败");
    }
}

