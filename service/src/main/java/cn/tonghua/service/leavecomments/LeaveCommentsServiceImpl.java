package cn.tonghua.service.leavecomments;

import cn.tonghua.database.mapper.LeaveCommentsMapper;
import cn.tonghua.database.model.LeaveComments;
import cn.tonghua.database.model.LeaveCommentsExample;
import cn.tonghua.database.vo.FileResourceSEO;
import cn.tonghua.service.sensitive.SensitiveService;
import cn.tonghua.service.sensitive.SensitiveServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class LeaveCommentsServiceImpl implements LeaveCommentsService{

    @Autowired
    LeaveCommentsMapper leaveCommentsMapper;

    @Autowired
    SensitiveService sensitiveService;

    @Override
    public PageInfo<LeaveComments> leaveCommentsList(FileResourceSEO fileResourceSEO) {

        LeaveCommentsExample leaveCommentsExample = new LeaveCommentsExample();
        PageHelper.startPage(fileResourceSEO.getPage(),fileResourceSEO.getRows());

        List<LeaveComments> leaveComments = leaveCommentsMapper.selectByExample(leaveCommentsExample);
        return new PageInfo<>(leaveComments);
    }

    @Override
    public PageInfo<LeaveComments> leaveCommentsByPara(int page,int rows) {

        LeaveCommentsExample leaveCommentsExample = new LeaveCommentsExample();
        PageHelper.startPage(page,rows);

        List<LeaveComments> leaveComments = leaveCommentsMapper.selectByExample(leaveCommentsExample);
        return new PageInfo<>(leaveComments);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean saveComments(String comments,int id) {

//        try {
//            sensitiveService.afterPropertiesSet();
//        } catch (Exception e) {
//            e.printStackTrace();

//        }
        String temp = sensitiveService.filter(comments);
        LeaveComments leaveComments = new LeaveComments();
        leaveComments.setComments(temp);
        leaveComments.setSiteId(id);
        leaveComments.setCreateTime(new Date());

        return leaveCommentsMapper.insertSelective(leaveComments)>0?true:false;
    }
}
