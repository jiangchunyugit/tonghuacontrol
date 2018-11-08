package cn.thinkfree.controller;


import java.util.Map;

import cn.thinkfree.database.model.PcAuditInfo;
import cn.thinkfree.database.model.PcAuditTemporaryInfo;
import cn.thinkfree.database.vo.*;

import com.github.pagehelper.PageInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import cn.thinkfree.core.annotation.MyRespBody;
import cn.thinkfree.core.base.AbsBaseController;
import cn.thinkfree.core.bundle.MyRespBundle;
import cn.thinkfree.core.constants.ResultMessage;
import cn.thinkfree.service.companysubmit.CompanySubmitService;
import cn.thinkfree.service.contract.ContractService;
import cn.thinkfree.service.contracttemplate.ContractTemplateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


/**
 * @author ying007
 * @date 2018/09/14
 * 公司资质
 */
@RestController
@RequestMapping(value = "/companyAudit")
@Api(value = "公司入驻",description = "公司入驻")
public class CompanyInfoSubmitController extends AbsBaseController {
    @Autowired
    CompanySubmitService companySubmitService;
    
    @Autowired
	ContractService contractService;
    @Autowired
    ContractTemplateService contractTemplateService;





    /**
     * 查询审批不通过的原因
     * @param companyId
     * @return
     */
    @RequestMapping(value = "/findAuditCase", method = RequestMethod.GET)
    @MyRespBody
    @ApiOperation(value="前端--运营后台--公司管理--设计/装饰公司--列表--状态--不通过原因--李阳")
    public MyRespBundle<PcAuditInfo> findAuditCase(@ApiParam("公司id")@RequestParam(value = "companyId") String companyId){
        PcAuditInfo auditInfo = companySubmitService.findAuditCase(companyId);
        return sendJsonData(success, "操作成功", auditInfo);
    }


    /**
     * 审批详情查询
     * @param companyId
     * @return
     */
    @RequestMapping(value = "/findAuditStatus", method = RequestMethod.GET)
    @MyRespBody
    @ApiOperation(value="前端--装饰/设计公司管理中心--入驻2--签约完成--审批详情查询--李阳")
    public MyRespBundle<AuditInfoVO> findAuditStatus(@ApiParam("公司id")@RequestParam(value = "companyId") String companyId){
        AuditInfoVO auditInfoVO = companySubmitService.findAuditStatus(companyId);
        return sendJsonData(success, "操作成功", auditInfoVO);
    }

    /**
     * 入驻公司资质变更回显
     * @param companyId
     * @return
     */
    @RequestMapping(value = "/findCompanyInfo", method = RequestMethod.GET)
    @MyRespBody
    @ApiOperation(value="前端--装饰/设计公司管理中心--公司变更页面--资质变更回显--李阳")
    public MyRespBundle<CompanySubmitVo> findCompanyInfo(@ApiParam("公司id")@RequestParam(value = "companyId") String companyId){
        CompanySubmitVo companySubmitVo = companySubmitService.findCompanyInfo(companyId);
        return sendJsonData(success, "操作成功", companySubmitVo);
    }

    /**
     * 入驻公司资质变更更新
     * @param companyTemporaryVo
     * @return
     */
    @RequestMapping(value = "/changeCompanyInfo", method = RequestMethod.POST)
    @MyRespBody
    @ApiOperation(value="前端--装饰/设计公司管理中心--公司变更页面--资质变更提交--李阳")
    public MyRespBundle<String> changeCompanyInfo(@ApiParam("变更的公司资质信息")CompanyTemporaryVo companyTemporaryVo){
        boolean flag = companySubmitService.changeCompanyInfo(companyTemporaryVo);
        if(flag){
            return sendJsonData(ResultMessage.SUCCESS, "操作成功");
        }
        return sendJsonData(ResultMessage.FAIL, "操作失败");
    }

    /**
     * 入驻公司资质变更审批回显
     * @param companyId
     * @return
     */
    @RequestMapping(value = "/findCompanyTemporaryInfo", method = RequestMethod.GET)
    @MyRespBody
    @ApiOperation(value="前端--运营后台--公司管理--资质变更--办理--公司详情--公司资质变更审批回显。注：申请列表的申请事项如果是资质变更，则使用此接口--李阳")
    public MyRespBundle<PcAuditTemporaryInfo> findCompanyTemporaryInfo(@ApiParam("公司id")@RequestParam(value = "companyId") String companyId){
        PcAuditTemporaryInfo pcAuditTemporaryInfo = companySubmitService.findCompanyTemporaryInfo(companyId);
        return sendJsonData(success, "操作成功", pcAuditTemporaryInfo);
    }


    /**
     * 入驻公司资质变更审批
     * @param pcAuditInfo
     * @return
     */
    @ApiOperation(value = "前端--运营后台----公司详情--公司变更审批--李阳", notes = "运营审核")
    @PostMapping("/auditChangeCompany")
    @MyRespBody
    public MyRespBundle<String> auditChangeCompany(@ApiParam("审批参数")PcAuditInfo pcAuditInfo){
        String msg = companySubmitService.auditChangeCompany(pcAuditInfo);
        return sendJsonData(ResultMessage.SUCCESS, msg);

    }


    @RequestMapping(value = "/upCompanyInfo", method = RequestMethod.POST)
    @MyRespBody
    @ApiOperation(value="前端--装饰/设计公司管理中心--完善公司资质--提交--李阳")
    public MyRespBundle<String> upCompanyInfo(@ApiParam("公司资质信息")CompanySubmitVo companySubmitVo){
        boolean flag = companySubmitService.upCompanyInfo(companySubmitVo);
        if(flag){
            return sendJsonData(ResultMessage.SUCCESS, "操作成功");
        }
        return sendJsonData(ResultMessage.FAIL, "操作失败");
    }

    /**
     * 公司资质查询list
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @MyRespBody
    @ApiOperation(value="前端--运营后台----公司管理--装饰/设计公司--列表--李阳")
    public MyRespBundle<PageInfo<CompanyListVo>> list(@ApiParam("条件查询参数")CompanyListSEO companyListSEO){
        PageInfo<CompanyListVo> pageInfo = companySubmitService.list(companyListSEO);
        return sendJsonData(success, "操作成功", pageInfo);
    }

    /**
     * 导出
     */
//    @RequestMapping(value = "/downLoad", method = RequestMethod.GET)
//    @ExceptionHandler(value=Exception.class)
//    @ApiOperation(value="前端--运营后台----公司管理--装饰/设计公司--导出excel--李阳")
//    public void downLoad(HttpServletResponse response, @ApiParam("条件查询参数")CompanyListSEO companyListSEO){
//        companySubmitService.downLoad(response, companyListSEO);
//    }

    /**
     * 查看合同
     * @author lqd
     * @return Message
     * 
     */
    @ApiOperation(value = "前端--运营后台----公司管理--装饰/设计公司--查看合同----李阳", notes = "查看合同",consumes = "application/text")
    @PostMapping("/getContractDetailInfo")
    public MyRespBundle<Map<String,Object>> getContractDetailInfo(@ApiParam("合同编号")@RequestParam(required = true) String contractNumber,
    		@ApiParam("公司编号")@RequestParam(required = true) String companyId){
    	Map<String,Object>  resMap  =  contractService.getContractDetailInfo(contractNumber, companyId);
        return sendJsonData(ResultMessage.SUCCESS,resMap);
    }
    /**
     * 查询字典
     * @author lqd
     * @return Message
     * 
     */
    @ApiOperation(value = "前端--运营后台----公司管理--装饰/设计公司--查看合同--合同条款字典--吕启栋", notes = "合同条款设置(设置合同条款需要查询字典接口)")
    @PostMapping("/queryContractDic")
    public MyRespBundle<String> queryContractDic(@RequestParam String type){
    	 Map<String,String>  resMap  = contractTemplateService.queryContractDic(type);
        return sendJsonData(ResultMessage.SUCCESS,resMap);
    }
    
    
    
    /**
     * 
     * 合同条款设置
     * @author lqd
     * @return Message
     */
    @ApiOperation(value = "前端--运营后台----公司管理--装饰/设计公司--查看合同--合同条款设置--吕启栋", notes = "合同条款设置(设置合同条款需要查询字典接口,paymentNumber为支付方案code)",consumes = "application/json")
    @PostMapping("/settingContractClause/{contractNumber}/{companyId}")
    @MyRespBody
    public MyRespBundle<String> settingContractClause(@PathVariable("contractNumber") String contractNumber,
    		@PathVariable("companyId") String companyId,
    		@ApiParam("合同条款key和value值")@RequestBody ContractClauseVO contractClausevo){
    	
    	boolean  falg  =  contractService.insertContractClause(contractNumber, companyId, contractClausevo);
    	 
        return sendJsonData(ResultMessage.SUCCESS,falg);
    }


    
    /**
     * 公司详情
     * @author lqd
     * @return Message
     */
    
    @ApiOperation(value = "前端--运营后台----公司管理--装饰/设计公司--公司详情--李阳", notes = "公司详情")
    @PostMapping("/companyDetails")
    @MyRespBody
    public MyRespBundle<CompanyDetailsVO> companyDetails(@ApiParam("合同编号")@RequestParam String contractNumber,
    		@ApiParam("公司编号")@RequestParam String companyId){
        CompanyDetailsVO jbj =  companySubmitService.companyDetails(contractNumber, companyId);
        return sendJsonData(ResultMessage.SUCCESS,jbj);
    }

    
    /**
     * 运营人员审批
     * @author lqd
     * @return Message
     */
    @ApiOperation(value = "前端--运营后台----公司管理---查看合同--资质审批--李阳", notes = "运营审核")
    @PostMapping("/auditCompany")
    @MyRespBody
    //@MySysLog(action = SysLogAction.DEL,module = SysLogModule.PC_CONTRACT,desc = "合同审批")
    public MyRespBundle<String> auditCompany(@ApiParam("审批参数")PcAuditInfo pcAuditInfo){
        
    	 String  result = companySubmitService.auditContract(pcAuditInfo);

        return sendJsonData(ResultMessage.SUCCESS,result);
    }

    /**
     * 签约完成
     * @author lqd
     * @return Message
     *
     */
    @ApiOperation(value = "前端--运营后台----公司管理--装饰/设计公司--查看合同--签约完成--李阳")
    @PostMapping("/joinSuccess")
    public MyRespBundle<String> joinSuccess(@ApiParam("公司id")@RequestParam String companyId){
        String resMap  = companySubmitService.joinSuccess(companyId);
        return sendJsonData(ResultMessage.SUCCESS,resMap);
    }


    /**
     * 入驻公司判断资质是否可以编辑
     * @param companyId
     * @return
     */
    @RequestMapping(value = "/isEdit", method = RequestMethod.GET)
    @MyRespBody
    @ApiOperation(value="前端--装饰/设计公司管理中心--公司信息--公司管理:变更--审核/未通过/通过--是否可以编辑--李阳")
    public MyRespBundle<CompanyTemporaryVo> isEdit(@ApiParam("公司id") @RequestParam String companyId){
        boolean flag = companySubmitService.isEdit(companyId);
        return sendJsonData(ResultMessage.SUCCESS, flag);
    }

    /**
     * 入驻公司资质变更查询审批状态
     * @param companyId
     * @return
     */
    @RequestMapping(value = "/findTempAuditStatus", method = RequestMethod.GET)
    @MyRespBody
    @ApiOperation(value="前端--装饰/设计公司管理中心--公司信息--公司管理:变更--审核/未通过/通过--查询审批状态--李阳")
    public MyRespBundle<AuditInfoVO> findTempAuditStatus(@ApiParam("公司id")@RequestParam(value = "companyId") String companyId){
        AuditInfoVO auditInfoVO = companySubmitService.findTempAuditStatus(companyId);
        return sendJsonData(success, "操作成功", auditInfoVO);
    }

}
