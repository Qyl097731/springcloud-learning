package com.njxzc.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.njxzc.springcloud.service.PaymentFeignHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.com.njxzc.springcloud.controller
 * date: 2022-06-10 00:34
 * copyright(c) 2020 南晓18卓工 邱依良
 *
 * @author 邱依良
 */
@RestController
@DefaultProperties(defaultFallback = "payment_Global_Fallback")
public class PaymentFeignHystrixController {
    @Autowired
    private PaymentFeignHystrixService paymentFeignHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id")Integer id){
        return paymentFeignHystrixService.paymentInfo_OK(id);
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    /*@HystrixCommand(fallbackMethod = "paymentInfo_TimeoutFallbackMethod"
            , commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
    })*/
    @HystrixCommand
    public String paymentInfo_Timeout(@PathVariable("id")Integer id){
        int age = 10/0;
        return paymentFeignHystrixService.paymentInfo_Timeout(id);
    }

    public String paymentInfo_TimeoutFallbackMethod(@PathVariable("id") Integer id) {
        return "不等你们了";
    }

    public String payment_Global_Fallback(){
        return "全局";
    }

}
