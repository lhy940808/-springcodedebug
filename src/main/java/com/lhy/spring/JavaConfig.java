package com.lhy.spring;

import com.lhy.spring.listener.ApplicationStartListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author liuhaiyan
 * @date 2019-09-30 10:42
 */
@ComponentScan
@Configuration
public class JavaConfig {
    @Bean
    public ApplicationStartListener getApplicationListener() {
        return new ApplicationStartListener();
    }

}
