package com.njxzc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud
 * date: 2022-07-03 22:14
 * copyright(c) 2020 南晓18卓工 邱依良
 *
 * @author 邱依良
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3355 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3355.class, args);
    }
}
