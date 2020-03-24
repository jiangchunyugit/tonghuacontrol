package cn.tonghua.service.qingdaobusiness;

import cn.tonghua.database.mapper.*;
import cn.tonghua.database.model.*;
import cn.tonghua.database.vo.ProductVO;
import cn.tonghua.database.vo.SeaWorldProduct;
import cn.tonghua.service.startmachine.StartMachineService;
import cn.tonghua.service.utils.UdpCommandUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    MerchantMapper merchantMapper;

    @Autowired
    StartMachineService startMachineService;

    @Autowired
    RestTemplate restTemplate;

    @Override
    public List<MerchantWithBLOBs> merchantLists(String type) {
        MerchantExample merchantExample = new MerchantExample();
        MerchantExample.Criteria criteria = merchantExample.createCriteria();
        criteria.andUseidEqualTo(type);
        return merchantMapper.selectByExampleWithBLOBs(merchantExample);
    }

    @Autowired
    ProjectManagerMapper projectManagerMapper;

    @Override
    public boolean projectOperaton(String command) {

        ProjectManagerExample projectManagerExample = new ProjectManagerExample();
        ProjectManagerExample.Criteria criteria = projectManagerExample.createCriteria();
        criteria.andProjectNameEqualTo(command);
        projectManagerExample.setOrderByClause(" sort asc ");

        List<ProjectManager> projectManagers = projectManagerMapper.selectByExample(projectManagerExample);
        projectManagers.forEach(e->{

            if (e.getCommandType() == 1) {
                UdpCommandUtils.sendCommand(e);
            }else if (e.getOperationType() ==3) {
                httpCommand(e);
            }
        });
        return true;
    }

    /**
     * http服务
     * @param e
     */
    private void httpCommand(ProjectManager e) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("http://");
        stringBuilder.append(e.getIp());
        stringBuilder.append(":");
        stringBuilder.append(e.getPort());
        stringBuilder.append(e.getUrl());
        restTemplate.getForObject(stringBuilder.toString(),String.class);
    }


    @Override
    public boolean changeOperaton(String command) {

        if (command.equals("seaworld")) {

            try {
//                StringBuilder stringBuilderSea = new StringBuilder();
//                stringBuilderSea.append()
//                MultiValueMap<String, Object> paraSea = initParam();
//                paraSea.add("softNm","UnderwaterWorldPad.exe");
                String urlpad1 = "http://10.191.69.102:7081/change?softNm=UnderwaterWorldPad.exe";
                restTemplate.getForObject(urlpad1, String.class);
            }catch (RuntimeException e) {
            }

            try {
//                MultiValueMap<String, Object> paraSeaWall = initParam();
//                paraSeaWall.add("softNm","main.exe");
                String urlpad2 = "http://10.191.69.105:7081/change?softNm=main.exe";
                restTemplate.getForObject(urlpad2, String.class);
            }catch (RuntimeException e) {
            }
        }
        else if (command.equals("notice")) {
            try {
//                MultiValueMap<String, Object> paraNotice = initParam();
//                paraNotice.add("softNm","SZABC-DaShiJi_Desk.exe");
                String urlpad1 = "http://10.191.69.102:7081/change?softNm=SZABC-DaShiJi_Desk.exe";
                restTemplate.getForObject(urlpad1, String.class);
            }catch (RuntimeException e) {
            }

            try {
//                MultiValueMap<String, Object> paraNoticeWall = initParam();
//                paraNoticeWall.add("softNm","SZABC-DaShiJi_Wall.exe");
                String urlpad2 = "http://10.191.69.105:7081/change?softNm=SZABC-DaShiJi_Wall.exe";
                restTemplate.getForObject(urlpad2, String.class);
            }catch (RuntimeException e) {
            }
        }
        else if (command.equals("waterfall")) {
            try {
//                MultiValueMap<String, Object> paraWaterfall = initParam();
//                paraWaterfall.add("softNm","QDCCB.Marketing.exe");
                String urlpad1 = "http://10.191.69.102:7081/change?softNm=QDCCB.Marketing.exe";
                restTemplate.getForObject(urlpad1, String.class);
            }catch (RuntimeException e) {
            }

            try {
//                MultiValueMap<String, Object> paraWaterfallWall = initParam();
//                paraWaterfallWall.add("softNm","QDCCB.Marketing.exe");
                String urlpad2 = "http://10.191.69.105:7081/change?softNm=QDCCB.Marketing.exe";
                restTemplate.getForObject(urlpad2, String.class);
            }catch (RuntimeException e) {
            }
        }
        else if (command.equals("productwall")) {
            try {
//                MultiValueMap<String, Object> paraWaterfall = initParam();
//                paraWaterfall.add("softNm","QDCCB.Marketing.exe");
                String urlpad1 = "http://10.191.69.102:7081/change?softNm=main.exe";
                restTemplate.getForObject(urlpad1, String.class);
            }catch (RuntimeException e) {
            }

            try {
//                MultiValueMap<String, Object> paraWaterfallWall = initParam();
//                paraWaterfallWall.add("softNm","QDCCB.Marketing.exe");
                String urlpad2 = "http://10.191.69.105:7081/change?softNm=welcomeLeader.exe";
                restTemplate.getForObject(urlpad2, String.class);
            }catch (RuntimeException e) {
            }
        }
        return true;
    }

    /**
     *初始化参数
     * @return
     */
    private MultiValueMap<String, Object> initParam() {
        MultiValueMap<String, Object> param = new LinkedMultiValueMap<>();
        return param;
    }

    @Autowired
    NoticeInfoMapper noticeInfoMapper;

    @Override
    public List<NoticeInfoWithBLOBs> noticeList() {
        return noticeInfoMapper.selectByExampleWithBLOBs(new NoticeInfoExample());
    }

    @Autowired
    JrproductInfoMapper jrproductInfoMapper;

    @Autowired
    InsuranceInfoMapper insuranceInfoMapper;

    @Autowired
    ConductInfoMapper conductInfoMapper;

    @Autowired
    FundInfoMapper fundInfoMapper;

    @Override
    public ProductVO productVO() {

        List<JrproductInfo> jrproductInfos = jrproductInfoMapper.selectByExampleWithBLOBs(new JrproductInfoExample());
        ProductVO productVO = new ProductVO();
        // 平台
        productVO.setJrproductInfoList(jrproductInfos);
        // 理财
        productVO.setConductInfoList(conductInfoMapper.WaterfallSelectByExample(new ConductInfoExample()));
        // 基金
        productVO.setFundInfoList(fundInfoMapper.WaterfallSelectByExample(new FundInfoExample()));
        // 保险
        productVO.setInsuranceInfoList(insuranceInfoMapper.WaterfallSelectByExample(new InsuranceInfoExample()));
        return productVO;
    }

    @Override
    public List<SeaWorldProduct> seaWorldProductList() {

        JrproductInfoExample jrproductInfoExample = new JrproductInfoExample();
        JrproductInfoExample.Criteria criteria = jrproductInfoExample.createCriteria();
        criteria.andProductionNotEqualTo("");
        criteria.andQrpathNotEqualTo("");
        criteria.andQrpathIsNotNull();
        criteria.andProductionIsNotNull();
        // 查询时不需要详情blob
        List<JrproductInfo> jrproductInfos = jrproductInfoMapper.selectByExample(jrproductInfoExample);
        List<SeaWorldProduct> seaWorldProducts = new ArrayList<>();
        jrproductInfos.forEach(e->{
            SeaWorldProduct seaWorldProduct = new SeaWorldProduct();
            seaWorldProduct.setIconPath(e.getProduction());
            seaWorldProduct.setQrPath(e.getQrpath());
            seaWorldProducts.add(seaWorldProduct);
        });
        return seaWorldProducts;
    }

    @Autowired
    MetalDoublescreenMapper metalDoublescreenMapper;

    @Override
    public List<MetalDoublescreen> metalDoublescreenList(String type) {
        MetalDoublescreenExample metalDoublescreenExample = new MetalDoublescreenExample();
        MetalDoublescreenExample.Criteria criteria = metalDoublescreenExample.createCriteria();
        criteria.andUpTypeEqualTo(type);
        return metalDoublescreenMapper.selectByExampleWithBLOBs(metalDoublescreenExample);
    }

    @Override
    public boolean allStart() {

        Set<String> projectNm = this.projectNm(0);
        projectNm.forEach(e->{
            this.projectOperaton(e);
        });
        return true;
    }

    @Override
    public boolean allShutDown() {
        Set<String> projectNm = this.projectNm(1);
        projectNm.forEach(e->{
            this.projectOperaton(e);
        });
        return true;
    }

    /**
     * 获取一键开关机的操作名称
     * @param type
     * @return
     */
    private Set<String> projectNm(int type) {
        List<ProjectManager> projectManagers = projectManagerMapper.selectByOperation(type);
        return projectManagers.stream().map(ProjectManager::getProjectName).collect(Collectors.toSet());
    }
}
