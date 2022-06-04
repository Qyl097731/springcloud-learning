package com.njxzc.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.config
 * date: 2022-06-04 22:09
 * copyright(c) 2020 南晓18卓工 邱依良
 * @author 邱依良
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
