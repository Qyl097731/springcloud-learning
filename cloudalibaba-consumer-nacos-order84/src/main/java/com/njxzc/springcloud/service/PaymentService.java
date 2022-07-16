package com.njxzc.springcloud.service;

import com.njxzc.springcloud.entities.CommonResult;
import com.njxzc.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.service
 * date: 2022-07-12 21:18
 * author 邱依良
 */
@FeignClient(value = "nacos-payment-provider", fallback = PaymentFallbackService.class)//调用中关闭9003服务提供者
public interface PaymentService {

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);

}
