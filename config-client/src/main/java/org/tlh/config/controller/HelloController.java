package org.tlh.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tlh.config.config.ConfigClientProperties;

/**
 * Created by 离歌笑tlh/hu ping on 2018/12/13
 * <p>
 * Github: https://github.com/tlhhup
 */
@RefreshScope
@RestController
public class HelloController {

    @Value("${config.client.msg}")
    private String msg;

    @Autowired
    private ConfigClientProperties configClientProperties;

    @GetMapping("/msg")
    public String msg(){
        return this.msg;
    }

    @GetMapping("/number")
    public int number(){
        return this.configClientProperties.getNumber();
    }

}
