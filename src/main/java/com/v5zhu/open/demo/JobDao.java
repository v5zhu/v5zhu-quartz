package com.v5zhu.open.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhuxl@paxsz.com on 2016/6/7.
 */
public class JobDao {
    /** 计划任务map */
    private static Map<String, ScheduleJob> jobMap = new HashMap<String, ScheduleJob>();
    public static List<ScheduleJob> scheduleJobs=new ArrayList<ScheduleJob>();
    static {
        for (int i = 0; i < 5; i++) {
            ScheduleJob job = new ScheduleJob();
            job.setJobId("10001" + i);
            job.setJobName("data_import" + i);
            job.setJobGroup("dataWork");
            job.setJobStatus("1");
            job.setCronExpression("0/5 * * * * ?");
            job.setDesc("数据导入任务");
            addJob(job);
            scheduleJobs.add(job);
        }
    }
    /**
     * 添加任务
     * @param scheduleJob
     */
    public static void addJob(ScheduleJob scheduleJob) {
        jobMap.put(scheduleJob.getJobGroup() + "_" + scheduleJob.getJobName(), scheduleJob);
    }

    public static List<ScheduleJob> getScheduleJobs(){
        return scheduleJobs;
    }
}
