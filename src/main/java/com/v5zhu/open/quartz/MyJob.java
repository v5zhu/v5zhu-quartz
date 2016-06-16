package com.v5zhu.open.quartz;

import java.util.Date;

/**
 * Created by zhuxl@paxsz.com on 2016/6/16.
 */
public class MyJob {
    public void execute(){
        System.out.println("当前时间:"+new Date().toString());
    }
}
