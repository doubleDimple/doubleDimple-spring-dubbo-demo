package com.doubledimple.orderserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//配置nacos后自动刷新用
@RefreshScope
public class NacosTest {

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @RequestMapping("/getMessage")
    public String getMessage(){
        return "url:" + url + "</br>username:" + username + "</br>password:" + password;
    }
}
