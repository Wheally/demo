package com.wenxq.demo.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by WXQ on 2016/9/12.
 */
@Configuration
public class UserConfig {

    @Bean
    public UserDao userDao() {
        return new UserDao();
    }

}
