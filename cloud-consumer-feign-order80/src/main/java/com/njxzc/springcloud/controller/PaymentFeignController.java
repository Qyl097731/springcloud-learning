package com.njxzc.springcloud.controller;

import com.njxzc.springcloud.entities.CommonResult;
import com.njxzc.springcloud.service.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.com.njxzc.springcloud.controller
 * date: 2022-06-10 00:34
 * copyright(c) 2020 南晓18卓工 邱依良
 *
 * @author 邱依良
 */
@RestController
public class PaymentFeignController {
    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/getPayment/{id}")
    public CommonResult getPayment(@PathVariable("id") Long id){
        return paymentFeignService.getPayment(id);
    }

    @GetMapping("/consumer/payment/timeout")
    public String getFeighTimeout(){
        return paymentFeignService.getFeighTimeout();
    }

}
