package com.v5zhu.open.quartz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * Created by zhuxl@paxsz.com on 2016/6/16.
 */
public class MyJob {
    private static final Logger logger= LoggerFactory.getLogger(MyJob.class);
    public void execute(){
        logger.info("当前时间：[{}]",new Date().toString());
    }
}
