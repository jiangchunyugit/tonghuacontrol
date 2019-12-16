package cn.tonghua.service.leavecomments;

import cn.tonghua.database.model.LeaveComments;
import cn.tonghua.database.vo.FileResourceSEO;
import com.github.pagehelper.PageInfo;

public interface LeaveCommentsService {

    /**
     * 查看留言
     * @return
     */
    PageInfo<LeaveComments> leaveCommentsList(FileResourceSEO fileResourceSEO);

    /**
     * 查看留言
     * @return
     */
    PageInfo<LeaveComments> leaveCommentsByPara(int page, int rows);

    /**
     * 保存留言
     * @param comments
     * @return
     */
    boolean saveComments(String comments,int id);
}
