package cn.tonghua.service.siteinfo;

import cn.tonghua.database.mapper.SiteInfoMapper;
import cn.tonghua.database.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class SiteInfoServiceImpl implements SiteInfoService {

    @Autowired
    SiteInfoMapper siteInfoMapper;


    @Override
    public SiteInfo siteInfo(int id) {
        return siteInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean likeSite(int id) {

        SiteInfo siteInfo = siteInfoMapper.selectByPrimaryKey(id);
        if (null != siteInfo) {
            int count = siteInfo.getCount() +1;
            SiteInfo siteInfoN = new SiteInfo();
            siteInfoN.setCount(count);
            siteInfoN.setUpdaTime(new Date());
            if (count >50){
                siteInfoN.setStar(5);
            }
            SiteInfoExample siteInfoExample = new SiteInfoExample();
            SiteInfoExample.Criteria criteria = siteInfoExample.createCriteria();
            criteria.andIdEqualTo(id);
            return siteInfoMapper.updateByExampleSelective(siteInfoN,siteInfoExample)>0?true:false;
        }
        return false;
    }

//    public void dataAna() {
//
//        SiteInfoExample siteInfoExample = new SiteInfoExample();
//
//        List<SiteVO> siteVOS = siteInfoMapper.selectByExampleVO(siteInfoExample);
//        siteVOS.forEach(e->{
//
//            SiteQuestionExample siteQuestionExample = new SiteQuestionExample();
//            SiteQuestionExample.Criteria criteria = siteQuestionExample.createCriteria();
//            criteria.andMarkNotEqualTo("3");
//            criteria.andSiteIdEqualTo(e.getId());
//
//            List<SiteQuestionVO> siteQuestionVOS = siteQuestionMapper.selectByExampleVO(siteQuestionExample);
//            e.setSiteQuestionVOSs(siteQuestionVOS);
//            siteQuestionVOS.forEach(e1->{
//                List<QuestionAnswerVO> questionAnswerVOs = new ArrayList<>();
//
//                if ("1".equals(e1.getMark())||"5".equals(e1.getMark())) {
//
//                    QuestionAnswerVO questionAnswerVO = new QuestionAnswerVO();
//                    questionAnswerVO.setDescription("是");
//                    questionAnswerVO.setAnswerMark(1);
//                    questionAnswerVO.setQuestionId(e1.getId());
//                    questionAnswerVOs.add(questionAnswerVO);
//                    chouceCount(questionAnswerVO);
//                    QuestionAnswerVO questionAnswerVO1 = new QuestionAnswerVO();
//                    questionAnswerVO1.setDescription("否");
//                    questionAnswerVO1.setAnswerMark(0);
//                    questionAnswerVO1.setQuestionId(e1.getId());
//                    chouceCount(questionAnswerVO1);
//                    questionAnswerVOs.add(questionAnswerVO1);
//                } else if ("2".equals(e1.getMark())||"3".equals(e1.getMark())) {
//
//                    QuestionAnswerVO questionAnswerVO = new QuestionAnswerVO();
//                    questionAnswerVO.setDescription("可以理解");
//                    questionAnswerVO.setAnswerMark(1);
//                    questionAnswerVO.setQuestionId(e1.getId());
//                    questionAnswerVOs.add(questionAnswerVO);
//                    chouceCount(questionAnswerVO);
//                    QuestionAnswerVO questionAnswerVO1 = new QuestionAnswerVO();
//                    questionAnswerVO1.setDescription("不能理解");
//                    questionAnswerVO1.setAnswerMark(0);
//                    questionAnswerVO1.setQuestionId(e1.getId());
//                    chouceCount(questionAnswerVO1);
//                    questionAnswerVOs.add(questionAnswerVO1);
//                } else if ("0".equals(e1.getMark())||"4".equals(e1.getMark())) {
//                    QuestionAnswerExample questionAnswerExample = new QuestionAnswerExample();
//                    QuestionAnswerExample.Criteria criteria1 = questionAnswerExample.createCriteria();
//                    criteria1.andQuestionIdEqualTo(e1.getId());
//                    questionAnswerVOs = questionAnswerMapper.selectByExampleVO(questionAnswerExample);
//                    questionAnswerVOs.forEach(e2->{
//                        chouceCount(e2);
//                    });
//                }
//                e1.setQuestionAnswerVOS(questionAnswerVOs);
//
//            });
//        });
//        writeE(siteVOS);
//    }
//
//    private void chouceCount(QuestionAnswerVO questionAnswerVO) {
//
//        UserAnswerExample userAnswerExample = new UserAnswerExample();
//        UserAnswerExample.Criteria criteria = userAnswerExample.createCriteria();
//        criteria.andQuestionIdEqualTo(questionAnswerVO.getQuestionId());
//        criteria.andAnswerIdEqualTo(questionAnswerVO.getAnswerMark());
//
//        int count = Math.toIntExact(userAnswerMapper.countByExample(userAnswerExample));
//        questionAnswerVO.setCount(count);
//    }
//
//    private void writeE(List<SiteVO> siteVOS) {
//
//        ExcelData data = new ExcelData();
//        String title = "数据分析报告";
//        data.setName(title);
//        //添加表头
//        List<String> titles = new ArrayList<>();
//        titles.add("序号");
//        titles.add("景点名称");
////        titles.add("调查问卷问题编号");
//        titles.add("调查问卷问题名称");
////        titles.add("答案编号");
//        titles.add("答题结果");
//        titles.add("答题人数");
//        titles.add("备注");
//        data.setTitles(titles);
////        添加列
//        List<List<Object>> rows = new ArrayList<>();
//        List<Object> row = null;
//        for (int i = 0; i < siteVOS.size(); i++) {
//            row = new ArrayList<>();
//            row.add(i + 1);
//            row.add(siteVOS.get(i).getName());
////            row.add("");
//            row.add("");
////            row.add("");
//            row.add("");
//            row.add("");
//            row.add("");
//            rows.add(row);
//            siteVOS.get(i).getSiteQuestionVOSs().forEach(e -> {
//
//                List<Object> row1 = new ArrayList<>();
//                row1.add("");
//                row1.add("");
////                row1.add(e.getId());
//                row1.add(e.getDescription());
////                row1.add("");
//                row1.add("");
//                row1.add("");
//                row1.add("");
//                rows.add(row1);
//                e.getQuestionAnswerVOS().forEach(e1 -> {
//                    List<Object> row2 = new ArrayList<>();
//                    row2.add("");
//                    row2.add("");
////                    row2.add("");
//                    row2.add("");
////                    row2.add(e1.getId());
//                    row2.add(e1.getDescription());
//                    row2.add(e1.getCount());
//                    row2.add("");
//                    rows.add(row2);
//                });
//            });
//        }
//        data.setRows(rows);
//        SimpleDateFormat fdate = new SimpleDateFormat("yyyy-MM-dd-HHmmss");
//        String datePath = fdate.format(new Date());
//        String fileName = title + "_" + datePath + ".xls";
//        String urlPath = "C:\\dataAnalyze"+datePath.substring(0,6);
//        File pathDir = new File(urlPath);
//        if (!pathDir.exists()) {
//            pathDir.mkdirs();
//        }
//        try {
//            ExcelUtils.generateExcel(data, urlPath +
//                    "\\" + fileName);
//        } catch (Exception e) {
////            printErrorMes("结算比列导出异常",e.getMessage());
//        }
//    }
//
//
//
//    public void dataAnaF() {
//
//        SiteInfoExample siteInfoExample = new SiteInfoExample();
//
//        List<SiteVO> siteVOS = siteInfoMapper.selectByExampleVO(siteInfoExample);
//        siteVOS.forEach(e->{
//
//            SiteQuestionExample siteQuestionExample = new SiteQuestionExample();
//            SiteQuestionExample.Criteria criteria = siteQuestionExample.createCriteria();
//            criteria.andMarkNotIn(Arrays.asList(new String[]{"4", "5"}));
//            criteria.andSiteIdEqualTo(e.getId());
//
//            List<SiteQuestionVO> siteQuestionVOS = siteQuestionMapper.selectByExampleVO(siteQuestionExample);
//            e.setSiteQuestionVOSs(siteQuestionVOS);
//            siteQuestionVOS.forEach(e1->{
//                List<UserAnswer> userAnswers = new ArrayList<>();
//                userAnswers=  userAnswerMapper.selectByQuestionId(e1.getId());
//                e1.setUserAnswers(userAnswers);
//            });
//        });
//        writeEF(siteVOS);
//    }
//
//
//    private void writeEF(List<SiteVO> siteVOS) {
//
//        siteVOS.forEach(e->{
//            String excelNm = e.getName();
//            List<ExcelData> excelDatas = new ArrayList<>();
//            e.getSiteQuestionVOSs().forEach(question->{
//                ExcelData data = new ExcelData();
//
//                String sheetNm = question.getId().toString();
////                if (sheetNm.length()>32) {
////                    sheetNm =sheetNm.substring(0,31);
////                }
//                data.setName(sheetNm);
//                //添加表头
//                List<String> titles = new ArrayList<>();
//                titles.add("序号");
//                titles.add("开放性文字");
//                data.setTitles(titles);
////        添加列
//                List<List<Object>> rows = new ArrayList<>();
//                List<Object> row = null;
//                row = new ArrayList<>();
//                row.add("");
//                row.add(question.getDescription());
//                rows.add(row);
//                for (int i = 0; i < question.getUserAnswers().size(); i++) {
//                    row = new ArrayList<>();
//                    row.add(i + 1);
//                    row.add(question.getUserAnswers().get(i).getAnswerText());
//                    row.add("");
//                    rows.add(row);
//                }
//                data.setRows(rows);
//                excelDatas.add(data);
//            });
//            generateE(excelDatas,excelNm);
//        });
//
//    }
//
//    private void generateE(List<ExcelData> excelDatas,String excelNm) {
//        SimpleDateFormat fdate = new SimpleDateFormat("yyyy-MM-dd-HHmmss");
//        String datePath = fdate.format(new Date());
//        String fileName = excelNm + "_" + datePath + ".xls";
//        String urlPath = "C:\\dataAnalyze\\"+datePath.substring(0,7);
//        File pathDir = new File(urlPath);
//        if (!pathDir.exists()) {
//            pathDir.mkdirs();
//        }
//        try {
//            ExcelUtils.generateExcel(excelDatas, urlPath +
//                    "\\" + fileName);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
