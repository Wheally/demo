package com.wenxq.demo.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class LogonService {

    @Autowired
    private LogDao logDao;
    @Autowired
    private UserDao userDao;

    public void print() {
        System.out.println("helloworld");
        logDao.print();
        userDao.print();
    }
    
}