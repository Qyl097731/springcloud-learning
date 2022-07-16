package com.njxzc.springcloud.service;

import com.njxzc.springcloud.entities.CommonResult;
import com.njxzc.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.service
 * date: 2022-07-12 22:25
 * author 邱依良
 */
@Service
public class PaymentFallbackService implements PaymentService{

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回 PaymentFallbackService");
    }
}
