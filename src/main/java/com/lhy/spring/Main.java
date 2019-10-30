package com.lhy.spring;

import com.lhy.spring.listener.ApplicationStartListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.management.ManagementFactory;
import java.net.InetAddress;

/**
 * @author liuhaiyan
 * @date 2019-09-28 12:34
 */
public class Main {
//    @Autowired
//    Hello hello;

    public static void main(String[] args) throws Exception{
        int startCurrentMillis = (int) ((Math.random() * 9 + 1) * 1000);
        System.out.println("mills is " + startCurrentMillis + "nano" + System.nanoTime());
        System.out.println(ManagementFactory.getRuntimeMXBean().getName()+"host" + InetAddress.getLocalHost().getHostAddress());
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        ApplicationStartListener listener = context.getBean(ApplicationStartListener.class);
        System.out.println("listner is "+ listener);

    }
}
