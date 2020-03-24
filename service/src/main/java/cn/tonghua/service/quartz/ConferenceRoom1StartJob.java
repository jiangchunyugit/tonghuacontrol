package cn.tonghua.service.quartz;

import cn.tonghua.service.qingdaobusiness.BusinessService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;

public class ConferenceRoom1StartJob implements Job {

    @Autowired
    BusinessService businessService;

    @Override
    public void execute(JobExecutionContext context) {
        //获取任务名
        String taskName = context.getJobDetail().getKey().getName();
        System.out.println("taskName->" + taskName);
        //todo:处理执行任务时的业务代码
        // 执行智慧瀑布开机
        businessService.projectOperaton("conferenceRoom1Start");
    }
}
