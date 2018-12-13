package org.tlh.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.tlh.config.config.ConfigClientProperties;

/**
 * Created by 离歌笑tlh/hu ping on 2018/12/13
 * <p>
 * Github: https://github.com/tlhhup
 */
@EnableEurekaClient
@SpringBootApplication
@EnableConfigurationProperties(ConfigClientProperties.class)
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class,args);
    }

}
