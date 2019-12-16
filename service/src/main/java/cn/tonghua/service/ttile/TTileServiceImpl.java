package cn.tonghua.service.ttile;

import cn.tonghua.database.mapper.TTitleMapper;
import cn.tonghua.database.model.TTitle;
import cn.tonghua.database.model.TTitleExample;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TTileServiceImpl implements TTileService {


    @Autowired
    TTitleMapper tTitleMapper;

    @Override
    public List<TTitle> tTiles() {

        PageHelper.startPage(1,20);
        return tTitleMapper.selectByExample(new TTitleExample());
    }
}
