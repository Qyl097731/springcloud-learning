package com.njxzc.springcloud.service.impl;

import com.njxzc.springcloud.service.PaymentFeignHystrixService;
import org.springframework.stereotype.Service;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.service.impl
 * date: 2022-06-26 20:36
 * copyright(c) 2020 南晓18卓工 邱依良
 *
 * @author 邱依良
 */
@Service
public class PaymentFallbackService implements PaymentFeignHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "Fallback-paymentInfo_OK";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "Fallback-paymentInfo_Timeout";
    }
}
