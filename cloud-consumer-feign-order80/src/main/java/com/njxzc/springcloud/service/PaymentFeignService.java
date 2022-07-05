package com.njxzc.springcloud.service;

import com.njxzc.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.com.njxzc.springcloud.service
 * date: 2022-06-10 00:27
 * copyright(c) 2020 南晓18卓工 邱依良
 *
 * @author 邱依良
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping(value = "/payment/getPayment/{id}")
    CommonResult getPayment(@PathVariable("id") Long id);

    @GetMapping("/payment/timeout")
    public String getFeighTimeout();
}
