package cn.tonghua.controller;

import cn.tonghua.core.annotation.MyRespBody;
import cn.tonghua.core.annotation.MySysLog;
import cn.tonghua.core.base.AbsBaseController;
import cn.tonghua.core.bundle.MyRespBundle;
import cn.tonghua.core.constants.ResultMessage;
import cn.tonghua.core.constants.SysLogAction;
import cn.tonghua.core.constants.SysLogModule;
import cn.tonghua.database.model.Equipment;
import cn.tonghua.database.utils.FileResourceEnabled;
import cn.tonghua.database.vo.FileResourceSEO;
import cn.tonghua.service.equipinfo.EquipInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping(value = "/equipinfo")
@Api(value = "前端使用----设备信息---蒋春雨",description = "前端使用---设备信息---蒋春雨")
public class EquipInfoController extends AbsBaseController {

    @Autowired
    EquipInfoService equipInfoService;

    /**
     * 查询信息
     */
    @RequestMapping(value = "/equipment", method = RequestMethod.GET)
    @MyRespBody
    @ApiOperation(value="查看全部")
    @MySysLog(action = SysLogAction.SAVE,module = SysLogModule.PC_PROJECT,desc = "查看全部")
    public MyRespBundle<List<Equipment>> equipmentList(@ApiParam("查询参数（开始页，条数）") FileResourceSEO fileResourceSEO){

        return sendJsonData(ResultMessage.SUCCESS,equipInfoService.equipments(fileResourceSEO));
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @MyRespBody
    @ApiOperation(value="查看全部")
    @MySysLog(action = SysLogAction.SAVE,module = SysLogModule.PC_PROJECT,desc = "查看全部")
    public MyRespBundle<String> equipmentList(){

        return sendJsonData(ResultMessage.SUCCESS,"{" +
                "    code: 1000," +
                "    msg:4, " +
                "    version:6 ," +
                "    timestamp: 1567079656823" +
                "}");
    }

    /**
     * 查询详情
     */
    @RequestMapping(value = "/equipmentbyid", method = RequestMethod.GET)
    @MyRespBody
    @ApiOperation(value="查看详情")
    @MySysLog(action = SysLogAction.SAVE,module = SysLogModule.PC_PROJECT,desc = "查看全部")
    public MyRespBundle<Equipment> details(@ApiParam("主键") @RequestParam(value = "id") int id){

        return sendJsonData(ResultMessage.SUCCESS,equipInfoService.equipmentById(id));
    }

    /**
     * 新增
     */
    @RequestMapping(value = "/equipment", method = RequestMethod.POST)
    @MyRespBody
    @ApiOperation(value="新增")
    @MySysLog(action = SysLogAction.SAVE,module = SysLogModule.PC_PROJECT,desc = "新增")
    public MyRespBundle<String> addEquipment(@ApiParam("设备信息")Equipment equipment){
        if (equipInfoService.addEquipment(equipment)) {
            return sendSuccessMessage("操作成功");
        }
        return sendFailMessage("操作失败");
    }

    /**
     * 编辑
     */
    @RequestMapping(value = "/equipment", method = RequestMethod.PUT)
    @MyRespBody
    @ApiOperation(value="编辑")
    @MySysLog(action = SysLogAction.SAVE,module = SysLogModule.PC_PROJECT,desc = "编辑")
    public MyRespBundle<String> updateEquipment(@ApiParam("设备信息")Equipment equipment){
        if (equipInfoService.updateEquipment(equipment)) {
            return sendSuccessMessage("操作成功");
        }
        return sendFailMessage("操作失败");
    }

    /**
     * 删除
     */
    @RequestMapping(value = "/equipmentbyid", method = RequestMethod.DELETE)
    @MyRespBody
    @ApiOperation(value="删除")
    @MySysLog(action = SysLogAction.SAVE,module = SysLogModule.PC_PROJECT,desc = "删除")
    public MyRespBundle<String> equipmentById(@ApiParam("主键") @RequestParam(value = "id") int id){
//        BeanValidator.validate(, Severitys.Update.class);
        Equipment equipment = new Equipment();
        equipment.setId(id);
        equipment.setIsDel(FileResourceEnabled.ONE_true.code);
        if (equipInfoService.updateEquipment(equipment)) {
            return sendSuccessMessage("操作成功");
        }
        return sendFailMessage("操作失败");
    }

    /**
     * 删除
     */
    @RequestMapping(value = "/testhandwrite", method = RequestMethod.GET)
    @MyRespBody
    @ApiOperation(value="手写识别")
    @MySysLog(action = SysLogAction.SAVE,module = SysLogModule.PC_PROJECT,desc = "手写识别")
    public MyRespBundle<String> equipmentById(@ApiParam("坐标") @RequestParam(value = "position") String position){
//        MultiValueMap<String, Object> para = initParam();
//        para.add("track_str",174,257,1,0,6,1,7,3,9,1,12,3,13,2,16,3,15,3,12,2,9,2,8,1,6,1,4,0,2,0,1,0,1,0,1,0,1,0,0,-1,0,-1,-2,0,eb,121,349,8,0,17,1,24,0,30,0,35,0,34,2,33,3,26,3,13,2,9,1,6,0,2,1,2,0,0,1,-1,0,-1,0,0,0,-1,0,-1,0,-1,0,-1,0,-6,-1,-7,-3,-6,-2,-7,-2,-8,-3,-9,-3,-8,-1,eb,237,293,0,2,1,17,1,13,2,12,0,9,0,8,0,8,0,8,0,7,1,6,0,5,0,5,0,2,0,3,0,3,0,0,0,2,0,1,0,1,-1,0,-1,0,-2,-4,-2,-4,-2,-4,-1,-4);
//        para.add("cmd",0);
       String aa =  invokeRemoteMethod("https://handwriting.shuru.qq.com/cloud/cgi-bin/cloud_hw_pub.wsgi?track_str="+position+"&cmd=0");
        return sendJsonData(ResultMessage.SUCCESS,aa);
    }

    private MultiValueMap<String, Object> initParam() {
        MultiValueMap<String, Object> param = new LinkedMultiValueMap<>();
        return param;
    }

    private String invokeRemoteMethod(String url) {
        RestTemplate template = new RestTemplate();
       return template.getForObject(url, String.class);
    }
}
