package com.njxzc.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.com.njxzc.springcloud.controller
 * date: 2022-06-02 01:52
 * copyright(c) 2020 南晓18卓工 邱依良
 * @author 邱依良
 */
@RestController
@Slf4j
public class OrderZKController {

    public static final String INVOKE_URL = "http://cloud-provider-payment";

    @Autowired
    RestTemplate restTemplate;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "consumer/payment/zk")
    public String paymentzk(){
        return restTemplate.getForObject(INVOKE_URL+ "/payment/zk",String.class);
    }
}
