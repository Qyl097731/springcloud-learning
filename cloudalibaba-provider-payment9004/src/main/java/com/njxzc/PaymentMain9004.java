package com.njxzc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc
 * date: 2022-07-12 21:03
 * author 邱依良
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9004.class, args);
    }

}
