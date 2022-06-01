package com.njxzc.springcloud.service;

import com.njxzc.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.service
 * date: 2022-06-02 01:49
 * copyright(c) 2020 南晓18卓工 邱依良
 *
 * @author 邱依良
 */
public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById(Long id);
}
