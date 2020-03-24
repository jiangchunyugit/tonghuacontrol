package cn.tonghua.service.ttile;

import cn.tonghua.database.mapper.TTitleMapper;
import cn.tonghua.database.mapper.TitleAnswerMapper;
import cn.tonghua.database.model.TTitle;
import cn.tonghua.database.model.TTitleExample;
import cn.tonghua.database.model.TitleAnswer;
import cn.tonghua.database.vo.TitleVO;
import com.github.pagehelper.PageHelper;
import com.itextpdf.tool.xml.html.head.Title;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class TTileServiceImpl implements TTileService {


    @Autowired
    TTitleMapper tTitleMapper;

    @Autowired
    TitleAnswerMapper titleAnswerMapper;

    @Override
    public List<TitleVO> tTiles() {

//        PageHelper.startPage(1,20);
        List<TitleVO> tTitles = new ArrayList<>();
        tTitles = tTitleMapper.selectByExampleVO(new TTitleExample());

//        data();
//        Iterator<TTitle> iterator = tTitles.iterator();
//        while (iterator.hasNext()) {
//            TTitle tTitleF = iterator.next();
////
////            TTitle tTitleF = iterator.next();
////
////            if (StringUtils.isNotBlank(tTitleF.getOptionA())){
////
////                TitleAnswer titleAnswer = new TitleAnswer();
////                titleAnswer.setOptions(tTitleF.getOptionB());
////                titleAnswer.setTitleId(tTitleF.getTitleId());
////                titleAnswerMapper.insertSelective(titleAnswer);
////                if ("A".equals(tTitleF.getAnswer())){
////                    TTitle tTitle = new TTitle();
////                    tTitle.setAnswer(titleAnswer.getId().toString());
////                    TTitleExample tTitleExample = new TTitleExample();
////                    TTitleExample.Criteria criteria = tTitleExample.createCriteria();
////                    criteria.andTitleIdEqualTo(tTitleF.getTitleId());
////                    tTitleMapper.updateByExampleSelective(tTitle,tTitleExample);
////                }
////            }
////            if (StringUtils.isNotBlank(tTitleF.getOptionB())){
////
////                TitleAnswer titleAnswer = new TitleAnswer();
////                titleAnswer.setOptions(tTitleF.getOptionA());
////                titleAnswer.setTitleId(tTitleF.getTitleId());
////                titleAnswerMapper.insertSelective(titleAnswer);
////                if ("B".equals(tTitleF.getAnswer())){
////                    TTitle tTitle = new TTitle();
////                    tTitle.setAnswer(titleAnswer.getId().toString());
////                    TTitleExample tTitleExample = new TTitleExample();
////                    TTitleExample.Criteria criteria = tTitleExample.createCriteria();
////                    criteria.andTitleIdEqualTo(tTitleF.getTitleId());
////                    tTitleMapper.updateByExampleSelective(tTitle,tTitleExample);
////                }
////            }
////        }

        return tTitles;
    }

    private void data() {

        List<TTitle> tTitles = new ArrayList<>();
        tTitles = tTitleMapper.selectByExample(new TTitleExample());
        Iterator<TTitle> iterator = tTitles.iterator();
        while (iterator.hasNext()) {

            TTitle tTitleF = iterator.next();

            if (StringUtils.isNotBlank(tTitleF.getOptionA())){

                TitleAnswer titleAnswer = new TitleAnswer();
                titleAnswer.setOptions(tTitleF.getOptionA());
                titleAnswer.setTitleId(tTitleF.getTitleId());
                titleAnswerMapper.insertSelective(titleAnswer);
                if ("A".equals(tTitleF.getAnswer())){
                    TTitle tTitle = new TTitle();
                    tTitle.setAnswer(titleAnswer.getId().toString());
                    TTitleExample tTitleExample = new TTitleExample();
                    TTitleExample.Criteria criteria = tTitleExample.createCriteria();
                    criteria.andTitleIdEqualTo(tTitleF.getTitleId());
                    tTitleMapper.updateByExampleSelective(tTitle,tTitleExample);
                }
            }
            if (StringUtils.isNotBlank(tTitleF.getOptionB())){

                TitleAnswer titleAnswer = new TitleAnswer();
                titleAnswer.setOptions(tTitleF.getOptionB());
                titleAnswer.setTitleId(tTitleF.getTitleId());
                titleAnswerMapper.insertSelective(titleAnswer);
                if ("B".equals(tTitleF.getAnswer())){
                    TTitle tTitle = new TTitle();
                    tTitle.setAnswer(titleAnswer.getId().toString());
                    TTitleExample tTitleExample = new TTitleExample();
                    TTitleExample.Criteria criteria = tTitleExample.createCriteria();
                    criteria.andTitleIdEqualTo(tTitleF.getTitleId());
                    tTitleMapper.updateByExampleSelective(tTitle,tTitleExample);
                }
            }
        }
    }

}
