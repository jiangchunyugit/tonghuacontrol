package cn.tonghua.service.quartz;

import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class QuartzServiceImpl implements QuartzService {

    @Autowired
    Scheduler scheduler;


    /**
     * 创建job，可传参
     *
     * @param clazz     任务类
     * @param name      任务名称
     * @param groupName 任务所在组名称
     * @param cronExp   cron表达式
     * @param param     map形式参数
     */
    @Override
    public void addJob(Class clazz, String name, String groupName, String cronExp, Map<String, Object> param) {
        try {
            //构建job信息
            JobDetail jobDetail = JobBuilder.newJob(((Job) clazz.newInstance()).getClass()).withIdentity(name, groupName).build();
            //表达式调度构建器(即任务执行的时间)
            CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(cronExp);
            //按新的cronExpression表达式构建一个新的trigger
            CronTrigger trigger = TriggerBuilder.newTrigger().withIdentity(name, groupName).withSchedule(scheduleBuilder).build();

            scheduler.scheduleJob(jobDetail, trigger);
            if (!scheduler.isShutdown()) {
                scheduler.start();      // 启动
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 暂停job
     *
     * @param name      任务名称
     * @param groupName 任务所在组名称
     */
    @Override
    public void pauseJob(String name, String groupName) {
        try {
            scheduler.pauseJob(JobKey.jobKey(name, groupName));
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

    /**
     * 恢复job
     *
     * @param name      任务名称
     * @param groupName 任务所在组名称
     */
    @Override
    public void resumeJob(String name, String groupName) {
        try {
            scheduler.resumeJob(JobKey.jobKey(name, groupName));
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }


    /**
     * job 更新,更新频率和参数
     *
     * @param name      任务名称
     * @param groupName 任务所在组名称
     * @param cronExp   cron表达式
     * @param param     参数
     */
    @Override
    public void updateJob(String name, String groupName, String cronExp, Map<String, Object> param) {
        try {
            TriggerKey triggerKey = TriggerKey.triggerKey(name, groupName);
            CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggerKey);
            String oldTime = trigger.getCronExpression();
            if (cronExp != null && !oldTime.equalsIgnoreCase(cronExp)) {
                // 表达式调度构建器
                CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(cronExp);
                // 按新的cronExpression表达式重新构建trigger
                trigger = trigger.getTriggerBuilder().withIdentity(triggerKey).withSchedule(scheduleBuilder).build();

                // 按新的trigger重新设置job执行
                scheduler.rescheduleJob(triggerKey, trigger);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * job 删除
     *
     * @param name      任务名称
     * @param groupName 任务所在组名称
     */
    @Override
    public void deleteJob(String name, String groupName) {
        try {
            scheduler.pauseTrigger(TriggerKey.triggerKey(name, groupName));
            scheduler.unscheduleJob(TriggerKey.triggerKey(name, groupName));
            scheduler.deleteJob(JobKey.jobKey(name, groupName));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 启动所有定时任务
     */
    @Override
    public void startAllJobs() {
        try {
            scheduler.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 关闭所有定时任务
     */
    @Override
    public void shutdownAllJobs() {
        try {
            if (!scheduler.isShutdown()) {
                scheduler.shutdown();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 获取Job状态
     * @param jobName
     * @param jobGroup
     * @return
     * @throws SchedulerException
     */
    @Override
    public String getJobState(String jobName, String jobGroup)  {
        TriggerKey triggerKey = new TriggerKey(jobName, jobGroup);
        try {
            return scheduler.getTriggerState(triggerKey).name();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
        return null;
    }
}
