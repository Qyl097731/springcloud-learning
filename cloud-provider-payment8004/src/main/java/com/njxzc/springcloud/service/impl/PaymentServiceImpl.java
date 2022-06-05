package com.njxzc.springcloud.service.impl;

import com.njxzc.springcloud.dao.PaymentDao;
import com.njxzc.springcloud.entities.Payment;
import com.njxzc.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.service.impl
 * date: 2022-06-02 01:50
 * copyright(c) 2020 南晓18卓工 邱依良
 *
 * @author 邱依良
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
