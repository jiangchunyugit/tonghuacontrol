package cn.tonghua.service.event.listener;

import cn.tonghua.core.logger.AbsLogPrinter;
import cn.tonghua.database.event.AssessmentEvent;
import cn.tonghua.database.event.CompetitiveEvent;
import cn.tonghua.database.event.TouristEvent;
import cn.tonghua.database.mapper.*;
import cn.tonghua.database.model.*;
import cn.tonghua.service.utils.ExcelToListMap;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author jiangchunyu(后台)
 * @date 20191230
 * @Description题库远程端同步数据监听器
 */
@Component
public class TitleListener extends AbsLogPrinter {

    @Autowired
    TTitleMapper tTitleMapper;

    @Autowired
    TitleAnswerMapper titleAnswerMapper;

    @Autowired
    TitleCompetitiveMapper titleCompetitiveMapper;
    @Autowired
    TitleAnswerCompetitiveMapper titleAnswerCompetitiveMapper;

    @Autowired
    TitleAssessmentMapper titleAssessmentMapper;
    @Autowired
    TitleAnswerAssessmentMapper titleAnswerAssessmentMapper;

    /**
     * 解析题库数据游客模式
     */
    @EventListener
    @Async
    public void tourist(TouristEvent touristEvent){

        FileInputStream in =null;
        try {
            // 读取本地文件游客模式题库
            in=new FileInputStream(touristEvent.getSource());
        } catch (FileNotFoundException e) {
            printErrorMes("读本地文件异常");
            e.printStackTrace();
        }
        // 拼接解析Excel字段
        List<ExcelToListMap.TableTitle> map = new ArrayList<>();
        ExcelToListMap.TableTitle TITLEID = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle TITLENAME = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle OPTIONA = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle OPTIONB = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle OPTIONC = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle OPTIOND = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle OPTIONE = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle OPTIONF = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle TITLETYPEID = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle DIFFICULT = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle DATILX = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle GAMEMODEID = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle ANSWERLX = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle ANSWER = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle ORGCODE = new ExcelToListMap.TableTitle();

        TITLEID.setToTitle("TITLEID");
        TITLENAME.setToTitle("TITLENAME");
        OPTIONA.setToTitle("OPTIONA");
        OPTIONB.setToTitle("OPTIONB");
        OPTIONC.setToTitle("OPTIONC");
        OPTIOND.setToTitle("OPTIOND");
        OPTIONE.setToTitle("OPTIONE");
        OPTIONF.setToTitle("OPTIONF");
        TITLETYPEID.setToTitle("TITLETYPEID");
        DIFFICULT.setToTitle("DIFFICULT");
        DATILX.setToTitle("DATILX");
        GAMEMODEID.setToTitle("GAMEMODEID");
        ANSWERLX.setToTitle("ANSWERLX");
        ANSWER.setToTitle("ANSWER");
        ORGCODE.setToTitle("ORGCODE");

        TITLEID.setExcelTitle("TITLEID");
        TITLENAME.setExcelTitle("TITLENAME");
        OPTIONA.setExcelTitle("OPTIONA");
        OPTIONB.setExcelTitle("OPTIONB");
        OPTIONC.setExcelTitle("OPTIONC");
        OPTIOND.setExcelTitle("OPTIOND");
        OPTIONE.setExcelTitle("OPTIONE");
        OPTIONF.setExcelTitle("OPTIONF");
        TITLETYPEID.setExcelTitle("TITLETYPEID");
        DIFFICULT.setExcelTitle("DIFFICULT");
        DATILX.setExcelTitle("DATILX");
        GAMEMODEID.setExcelTitle("GAMEMODEID");
        ANSWERLX.setExcelTitle("ANSWERLX");
        ANSWER.setExcelTitle("ANSWER");
        ORGCODE.setExcelTitle("ORGCODE");

        map.add(TITLEID);
        map.add(TITLENAME);
        map.add(OPTIONA);
        map.add(OPTIONB);
        map.add(OPTIONC);
        map.add(OPTIOND);
        map.add(OPTIONE);
        map.add(OPTIONF);
        map.add(TITLETYPEID);
        map.add(DIFFICULT);
        map.add(DATILX);
        map.add(GAMEMODEID);
        map.add(ANSWERLX);
        map.add(ANSWER);
        map.add(ORGCODE);

        List<Map<String, String>> maps = new ArrayList<>();
        try {
            List<TTitle> tTitles = new ArrayList<>();
            maps = ExcelToListMap.analysis(in,map);
            // 删除题库
            if (maps.size()>0) {
                tTitleMapper.deleteByExample(new TTitleExample());
                titleAnswerMapper.deleteByExample(new TitleAnswerExample());
            }
            maps.forEach(e->{
                TTitle tTitle = new TTitle();
                tTitle.setTitleId(e.get("TITLEID"));
                tTitle.setTitleName(e.get("TITLENAME"));
                tTitle.setOptionA(e.get("OPTIONA"));
                tTitle.setOptionB(e.get("OPTIONB"));
                tTitle.setOptionC(e.get("OPTIONC"));
                tTitle.setOptionD(e.get("OPTIOND"));
                tTitle.setAnswer(e.get("ANSWER"));
                tTitle.setTitletypeId(e.get("TITLETYPEID"));
                tTitles.add(tTitle);
            });

        Iterator<TTitle> iterator = tTitles.iterator();
        while (iterator.hasNext()) {
            TTitle tTitleF = iterator.next();

            if (StringUtils.isNotBlank(tTitleF.getOptionA())){

                TitleAnswer titleAnswer = new TitleAnswer();
                titleAnswer.setOptions(tTitleF.getOptionA());
                titleAnswer.setTitleId(tTitleF.getTitleId());
                titleAnswerMapper.insertSelective(titleAnswer);
                if ("A".equals(tTitleF.getAnswer())){
                    tTitleF.setAnswer(titleAnswer.getId().toString());
                }
            }
            if (StringUtils.isNotBlank(tTitleF.getOptionB())){

                TitleAnswer titleAnswer = new TitleAnswer();
                titleAnswer.setOptions(tTitleF.getOptionB());
                titleAnswer.setTitleId(tTitleF.getTitleId());
                titleAnswerMapper.insertSelective(titleAnswer);
                if ("B".equals(tTitleF.getAnswer())){
                    tTitleF.setAnswer(titleAnswer.getId().toString());
                }
            }
            if (StringUtils.isNotBlank(tTitleF.getOptionC())){

                TitleAnswer titleAnswer = new TitleAnswer();
                titleAnswer.setOptions(tTitleF.getOptionC());
                titleAnswer.setTitleId(tTitleF.getTitleId());
                titleAnswerMapper.insertSelective(titleAnswer);
                if ("C".equals(tTitleF.getAnswer())){
                    tTitleF.setAnswer(titleAnswer.getId().toString());
                }
            }
            if (StringUtils.isNotBlank(tTitleF.getOptionD())){

                TitleAnswer titleAnswer = new TitleAnswer();
                titleAnswer.setOptions(tTitleF.getOptionD());
                titleAnswer.setTitleId(tTitleF.getTitleId());
                titleAnswerMapper.insertSelective(titleAnswer);
                if ("D".equals(tTitleF.getAnswer())){
                    tTitleF.setAnswer(titleAnswer.getId().toString());
                }
            }
            tTitleMapper.insertSelective(tTitleF);

        }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();

        }
    }

    /**
     * 解析题库数据游竞技模式
     */
    @EventListener
    @Async
    public void competitive(CompetitiveEvent competitiveEvent){

        FileInputStream in =null;
        try {
            // 读取本地文件游客模式题库
            in=new FileInputStream(competitiveEvent.getSource());
        } catch (FileNotFoundException e) {
            printErrorMes("读本地文件异常");
            e.printStackTrace();
        }
        // 拼接解析Excel字段
        List<ExcelToListMap.TableTitle> map = new ArrayList<>();
        ExcelToListMap.TableTitle TITLEID = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle TITLENAME = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle OPTIONA = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle OPTIONB = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle OPTIONC = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle OPTIOND = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle OPTIONE = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle OPTIONF = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle TITLETYPEID = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle DIFFICULT = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle DATILX = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle GAMEMODEID = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle ANSWERLX = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle ANSWER = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle ORGCODE = new ExcelToListMap.TableTitle();

        TITLEID.setToTitle("TITLEID");
        TITLENAME.setToTitle("TITLENAME");
        OPTIONA.setToTitle("OPTIONA");
        OPTIONB.setToTitle("OPTIONB");
        OPTIONC.setToTitle("OPTIONC");
        OPTIOND.setToTitle("OPTIOND");
        OPTIONE.setToTitle("OPTIONE");
        OPTIONF.setToTitle("OPTIONF");
        TITLETYPEID.setToTitle("TITLETYPEID");
        DIFFICULT.setToTitle("DIFFICULT");
        DATILX.setToTitle("DATILX");
        GAMEMODEID.setToTitle("GAMEMODEID");
        ANSWERLX.setToTitle("ANSWERLX");
        ANSWER.setToTitle("ANSWER");
        ORGCODE.setToTitle("ORGCODE");

        TITLEID.setExcelTitle("TITLEID");
        TITLENAME.setExcelTitle("TITLENAME");
        OPTIONA.setExcelTitle("OPTIONA");
        OPTIONB.setExcelTitle("OPTIONB");
        OPTIONC.setExcelTitle("OPTIONC");
        OPTIOND.setExcelTitle("OPTIOND");
        OPTIONE.setExcelTitle("OPTIONE");
        OPTIONF.setExcelTitle("OPTIONF");
        TITLETYPEID.setExcelTitle("TITLETYPEID");
        DIFFICULT.setExcelTitle("DIFFICULT");
        DATILX.setExcelTitle("DATILX");
        GAMEMODEID.setExcelTitle("GAMEMODEID");
        ANSWERLX.setExcelTitle("ANSWERLX");
        ANSWER.setExcelTitle("ANSWER");
        ORGCODE.setExcelTitle("ORGCODE");

        map.add(TITLEID);
        map.add(TITLENAME);
        map.add(OPTIONA);
        map.add(OPTIONB);
        map.add(OPTIONC);
        map.add(OPTIOND);
        map.add(OPTIONE);
        map.add(OPTIONF);
        map.add(TITLETYPEID);
        map.add(DIFFICULT);
        map.add(DATILX);
        map.add(GAMEMODEID);
        map.add(ANSWERLX);
        map.add(ANSWER);
        map.add(ORGCODE);

        List<Map<String, String>> maps = new ArrayList<>();
        try {
            List<TitleCompetitive> tTitles = new ArrayList<>();
            maps = ExcelToListMap.analysis(in,map);
            // 删除题库
            if (maps.size()>0) {
                titleCompetitiveMapper.deleteByExample(new TitleCompetitiveExample());
                titleAnswerCompetitiveMapper.deleteByExample(new TitleAnswerCompetitiveExample());
            }
            maps.forEach(e->{
                TitleCompetitive tTitle = new TitleCompetitive();
                tTitle.setTitleId(e.get("TITLEID"));
                tTitle.setTitleName(e.get("TITLENAME"));
                tTitle.setOptionA(e.get("OPTIONA"));
                tTitle.setOptionB(e.get("OPTIONB"));
                tTitle.setOptionC(e.get("OPTIONC"));
                tTitle.setOptionD(e.get("OPTIOND"));
                tTitle.setAnswer(e.get("ANSWER"));
                tTitle.setTitletypeId(e.get("TITLETYPEID"));
                tTitles.add(tTitle);
            });

            Iterator<TitleCompetitive> iterator = tTitles.iterator();
            while (iterator.hasNext()) {
                TitleCompetitive tTitleF = iterator.next();

                if (StringUtils.isNotBlank(tTitleF.getOptionA())){

                    TitleAnswerCompetitive titleAnswer = new TitleAnswerCompetitive();
                    titleAnswer.setOptions(tTitleF.getOptionA());
                    titleAnswer.setTitleId(tTitleF.getTitleId());
                    titleAnswerCompetitiveMapper.insertSelective(titleAnswer);
                    if ("A".equals(tTitleF.getAnswer())){
                        tTitleF.setAnswer(titleAnswer.getId().toString());
                    }
                }
                if (StringUtils.isNotBlank(tTitleF.getOptionB())){

                    TitleAnswerCompetitive titleAnswer = new TitleAnswerCompetitive();
                    titleAnswer.setOptions(tTitleF.getOptionB());
                    titleAnswer.setTitleId(tTitleF.getTitleId());
                    titleAnswerCompetitiveMapper.insertSelective(titleAnswer);
                    if ("B".equals(tTitleF.getAnswer())){
                        tTitleF.setAnswer(titleAnswer.getId().toString());
                    }
                }
                if (StringUtils.isNotBlank(tTitleF.getOptionC())){

                    TitleAnswerCompetitive titleAnswer = new TitleAnswerCompetitive();
                    titleAnswer.setOptions(tTitleF.getOptionC());
                    titleAnswer.setTitleId(tTitleF.getTitleId());
                    titleAnswerCompetitiveMapper.insertSelective(titleAnswer);
                    if ("C".equals(tTitleF.getAnswer())){
                        tTitleF.setAnswer(titleAnswer.getId().toString());
                    }
                }
                if (StringUtils.isNotBlank(tTitleF.getOptionD())){

                    TitleAnswerCompetitive titleAnswer = new TitleAnswerCompetitive();
                    titleAnswer.setOptions(tTitleF.getOptionD());
                    titleAnswer.setTitleId(tTitleF.getTitleId());
                    titleAnswerCompetitiveMapper.insertSelective(titleAnswer);
                    if ("D".equals(tTitleF.getAnswer())){
                        tTitleF.setAnswer(titleAnswer.getId().toString());
                    }
                }
                titleCompetitiveMapper.insertSelective(tTitleF);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();

        }

    }

    /**
     * 解析题库数据游考核模式
     */
    @EventListener
    @Async
    public void assessment(AssessmentEvent assessmentEvent){

        FileInputStream in =null;
        try {
            // 读取本地文件游客模式题库
            in=new FileInputStream(assessmentEvent.getSource());
        } catch (FileNotFoundException e) {
            printErrorMes("读本地文件异常");
            e.printStackTrace();
        }
        // 拼接解析Excel字段
        List<ExcelToListMap.TableTitle> map = new ArrayList<>();
        ExcelToListMap.TableTitle TITLEID = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle TITLENAME = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle OPTIONA = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle OPTIONB = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle OPTIONC = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle OPTIOND = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle OPTIONE = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle OPTIONF = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle TITLETYPEID = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle DIFFICULT = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle DATILX = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle GAMEMODEID = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle ANSWERLX = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle ANSWER = new ExcelToListMap.TableTitle();
        ExcelToListMap.TableTitle ORGCODE = new ExcelToListMap.TableTitle();

        TITLEID.setToTitle("TITLEID");
        TITLENAME.setToTitle("TITLENAME");
        OPTIONA.setToTitle("OPTIONA");
        OPTIONB.setToTitle("OPTIONB");
        OPTIONC.setToTitle("OPTIONC");
        OPTIOND.setToTitle("OPTIOND");
        OPTIONE.setToTitle("OPTIONE");
        OPTIONF.setToTitle("OPTIONF");
        TITLETYPEID.setToTitle("TITLETYPEID");
        DIFFICULT.setToTitle("DIFFICULT");
        DATILX.setToTitle("DATILX");
        GAMEMODEID.setToTitle("GAMEMODEID");
        ANSWERLX.setToTitle("ANSWERLX");
        ANSWER.setToTitle("ANSWER");
        ORGCODE.setToTitle("ORGCODE");

        TITLEID.setExcelTitle("TITLEID");
        TITLENAME.setExcelTitle("TITLENAME");
        OPTIONA.setExcelTitle("OPTIONA");
        OPTIONB.setExcelTitle("OPTIONB");
        OPTIONC.setExcelTitle("OPTIONC");
        OPTIOND.setExcelTitle("OPTIOND");
        OPTIONE.setExcelTitle("OPTIONE");
        OPTIONF.setExcelTitle("OPTIONF");
        TITLETYPEID.setExcelTitle("TITLETYPEID");
        DIFFICULT.setExcelTitle("DIFFICULT");
        DATILX.setExcelTitle("DATILX");
        GAMEMODEID.setExcelTitle("GAMEMODEID");
        ANSWERLX.setExcelTitle("ANSWERLX");
        ANSWER.setExcelTitle("ANSWER");
        ORGCODE.setExcelTitle("ORGCODE");

        map.add(TITLEID);
        map.add(TITLENAME);
        map.add(OPTIONA);
        map.add(OPTIONB);
        map.add(OPTIONC);
        map.add(OPTIOND);
        map.add(OPTIONE);
        map.add(OPTIONF);
        map.add(TITLETYPEID);
        map.add(DIFFICULT);
        map.add(DATILX);
        map.add(GAMEMODEID);
        map.add(ANSWERLX);
        map.add(ANSWER);
        map.add(ORGCODE);

        List<Map<String, String>> maps = new ArrayList<>();
        try {
            List<TitleAssessment> tTitles = new ArrayList<>();
            maps = ExcelToListMap.analysis(in,map);
            // 删除题库
            if (maps.size()>0) {
                titleAssessmentMapper.deleteByExample(new TitleAssessmentExample());
                titleAnswerAssessmentMapper.deleteByExample(new TitleAnswerAssessmentExample());
            }
            maps.forEach(e->{
                TitleAssessment tTitle = new TitleAssessment();
                tTitle.setTitleId(e.get("TITLEID"));
                tTitle.setTitleName(e.get("TITLENAME"));
                tTitle.setOptionA(e.get("OPTIONA"));
                tTitle.setOptionB(e.get("OPTIONB"));
                tTitle.setOptionC(e.get("OPTIONC"));
                tTitle.setOptionD(e.get("OPTIOND"));
                tTitle.setAnswer(e.get("ANSWER"));
                tTitle.setTitletypeId(e.get("TITLETYPEID"));
                tTitles.add(tTitle);
            });

            Iterator<TitleAssessment> iterator = tTitles.iterator();
            while (iterator.hasNext()) {
                TitleAssessment tTitleF = iterator.next();

                if (StringUtils.isNotBlank(tTitleF.getOptionA())){

                    TitleAnswerAssessment titleAnswer = new TitleAnswerAssessment();
                    titleAnswer.setOptions(tTitleF.getOptionA());
                    titleAnswer.setTitleId(tTitleF.getTitleId());
                    titleAnswerAssessmentMapper.insertSelective(titleAnswer);
                    if ("A".equals(tTitleF.getAnswer())){
                        tTitleF.setAnswer(titleAnswer.getId().toString());
                    }
                }
                if (StringUtils.isNotBlank(tTitleF.getOptionB())){

                    TitleAnswerAssessment titleAnswer = new TitleAnswerAssessment();
                    titleAnswer.setOptions(tTitleF.getOptionB());
                    titleAnswer.setTitleId(tTitleF.getTitleId());
                    titleAnswerAssessmentMapper.insertSelective(titleAnswer);
                    if ("B".equals(tTitleF.getAnswer())){
                        tTitleF.setAnswer(titleAnswer.getId().toString());
                    }
                }
                if (StringUtils.isNotBlank(tTitleF.getOptionC())){

                    TitleAnswerAssessment titleAnswer = new TitleAnswerAssessment();
                    titleAnswer.setOptions(tTitleF.getOptionC());
                    titleAnswer.setTitleId(tTitleF.getTitleId());
                    titleAnswerAssessmentMapper.insertSelective(titleAnswer);
                    if ("C".equals(tTitleF.getAnswer())){
                        tTitleF.setAnswer(titleAnswer.getId().toString());
                    }
                }
                if (StringUtils.isNotBlank(tTitleF.getOptionD())){

                    TitleAnswerAssessment titleAnswer = new TitleAnswerAssessment();
                    titleAnswer.setOptions(tTitleF.getOptionD());
                    titleAnswer.setTitleId(tTitleF.getTitleId());
                    titleAnswerAssessmentMapper.insertSelective(titleAnswer);
                    if ("D".equals(tTitleF.getAnswer())){
                        tTitleF.setAnswer(titleAnswer.getId().toString());
                    }
                }
                titleAssessmentMapper.insertSelective(tTitleF);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();

        }
    }

}
