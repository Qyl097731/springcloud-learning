package com.njxzc.springcloud.service;

import com.njxzc.springcloud.entities.CommonResult;
import com.njxzc.springcloud.service.impl.PaymentFallbackService;
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
@FeignClient(value = "CLOUD-PAYMENT-HYSTRIX-SERVICE",fallback = PaymentFallbackService.class)
public interface PaymentFeignHystrixService {
    @GetMapping("/payment/hystrix/ok/{id}")
    String paymentInfo_OK(@PathVariable("id")Integer id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    String paymentInfo_Timeout(@PathVariable("id")Integer id);
}
