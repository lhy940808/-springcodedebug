package com.lhy.spring.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author liuhaiyan
 * @date 2019-10-23 16:32
 */
public class ApplicationStartListener implements ApplicationListener<ContextRefreshedEvent> {

    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("我的父亲容器为：" + event.getApplicationContext().getParent());
        System.out.println("init success!!!");
    }
}
