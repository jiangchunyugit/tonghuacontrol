package cn.thinkfree.controller;

import cn.thinkfree.core.annotation.MyRespBody;
import cn.thinkfree.core.base.AbsBaseController;
import cn.thinkfree.core.bundle.MyRespBundle;
import cn.thinkfree.core.constants.ResultMessage;
import cn.thinkfree.database.vo.AfConfigEditVO;
import cn.thinkfree.database.vo.AfConfigVO;
import cn.thinkfree.service.approvalflow.AfConfigService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * TODO
 *
 * @author song
 * @version 1.0
 * @date 2018/10/25 18:21
 */
@RestController
@Api("审批流配置")
@RequestMapping("af-config")
public class AfConfigController extends AbsBaseController {

    @Resource
    private AfConfigService configService;

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @MyRespBody
    @ApiOperation(value="查询所有审批流")
    @ApiParam(name = "planNo", value= "方案编号", required = true)
    public MyRespBundle<List<AfConfigVO>> list(@RequestParam(name = "configNo", required = false) String planNo){
        return sendJsonData(ResultMessage.SUCCESS, configService.list(planNo));
    }

    @RequestMapping(value = "/detail", method = RequestMethod.POST)
    @MyRespBody
    @ApiOperation(value="获取审批流节点信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "configNo", value = "审批流配置编号", required = true),
            @ApiImplicitParam(name = "planNo", value = "方案编号", required = true)
    })
    public MyRespBundle<AfConfigVO> detail(@RequestParam(name = "configNo") String configNo, @RequestParam(name = "planNo") String planNo){
        return sendJsonData(ResultMessage.SUCCESS, configService.detail(configNo, planNo));
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @MyRespBody
    @ApiOperation(value="修改审批流配置")
    @ApiParam(name = "configEditVO", value= "审批流信息", required = true)
    public MyRespBundle<AfConfigVO> edit(@RequestBody AfConfigEditVO configEditVO){
        configService.edit(configEditVO);
        return sendSuccessMessage(ResultMessage.SUCCESS.message);
    }
}
