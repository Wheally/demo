package com.wenxq.demo.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//当通过手动注册配置类的时候，这个可以不写，如果想通过应用程序上下文获得这个bean，这个必须写
@Configuration
@Import({LogConfig.class,UserConfig.class})
public class AppConfig {

    // 定义了LogonService的Bean,名字是logonService1
    @Bean(name="logonService1")
    public LogonService logonService() {
        LogonService logonService = new LogonService();
        return logonService;
    }

}