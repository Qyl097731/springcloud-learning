package com.njxzc.springcloud.controller;

import com.njxzc.springcloud.entities.CommonResult;
import com.njxzc.springcloud.entities.Payment;
import com.njxzc.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.controller
 * date: 2022-06-02 01:52
 * copyright(c) 2020 南晓18卓工 邱依良
 * @author 邱依良
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @Autowired
    DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        return result>0?new CommonResult(200,"插入成功 , serverPort = "+serverPort,result)
                :new CommonResult(201,"插入失败",result);
    }

    @GetMapping(value = "/payment/getPayment/{id}")
    public CommonResult getPayment(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        return payment != null?new CommonResult(200,"查询成功, serverPort = "+serverPort,payment)
                :new CommonResult(201,"查询结果为空",id);
    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery(){
        discoveryClient.getServices().forEach(System.out::println);
        discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE").forEach(serviceInstance -> {
            System.out.println(serviceInstance.getServiceId() + "\t" + serviceInstance.getPort() + "\t"
                             + serviceInstance.getHost() + "\t" + serviceInstance.getUri());
        });
        return discoveryClient;
    }

    @GetMapping("/payment/lb")
    public String getPaymentLb(){
        return serverPort;
    }

    @GetMapping("/payment/timeout")
    public String getFeighTimeout(){
        try{
            TimeUnit.SECONDS.sleep(3);
        }catch (Exception e){
            e.printStackTrace();
        }
        return serverPort;
    }
}
