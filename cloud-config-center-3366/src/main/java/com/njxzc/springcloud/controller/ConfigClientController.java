package com.njxzc.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.controller
 * date: 2022-07-04 21:59
 * copyright(c) 2020 南晓18卓工 邱依良
 *
 * @author 邱依良
 */
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${server.port}")
    private String serverPort;

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String configInfo(){
        return "serverPort: " + serverPort + " configInfo: " + configInfo;
    }

}
