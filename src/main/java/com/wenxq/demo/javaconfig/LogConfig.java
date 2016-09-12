package com.wenxq.demo.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by WXQ on 2016/9/12.
 */
@Configuration
public class LogConfig {

    // 以下两个方法定义了两个Bean，并提供了Bean的实例化逻辑
    @Bean
    public LogDao logDao() {
        return new LogDao();
    }

}
