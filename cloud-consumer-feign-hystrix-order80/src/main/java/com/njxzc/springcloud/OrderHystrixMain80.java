package com.njxzc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud
 * date: 2022-06-10 00:23
 * copyright(c) 2020 南晓18卓工 邱依良
 *
 * @author 邱依良
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableFeignClients
@EnableHystrix
public class OrderHystrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain80.class, args);
    }
}
