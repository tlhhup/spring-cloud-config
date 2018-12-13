package org.tlh.config.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * Created by 离歌笑tlh/hu ping on 2018/12/13
 * <p>
 * Github: https://github.com/tlhhup
 */
@Data
@RefreshScope
@ConfigurationProperties(prefix = ConfigClientProperties.PREFIX)
public class ConfigClientProperties {

    public static final String PREFIX="config.client";

    private int number;

}
