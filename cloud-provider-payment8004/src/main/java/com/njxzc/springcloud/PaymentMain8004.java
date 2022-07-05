package com.njxzc.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud
 * date: 2022-05-29 23:27
 * copyright(c) 2020 南晓18卓工 邱依良
 *
 * @author 邱依良
 */
@SpringBootApplication
@MapperScan("com.njxzc.springcloud.dao")
@EnableDiscoveryClient
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
    }
}
