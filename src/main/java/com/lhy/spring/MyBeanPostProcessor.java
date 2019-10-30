package com.lhy.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author liuhaiyan
 * @date 2019-10-10 17:25
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
   public  Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

}
