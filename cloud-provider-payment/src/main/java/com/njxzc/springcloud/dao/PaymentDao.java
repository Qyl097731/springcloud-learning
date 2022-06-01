package com.njxzc.springcloud.dao;

import com.njxzc.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.dao
 * date: 2022-05-29 23:57
 * copyright(c) 2020 南晓18卓工 邱依良
 *
 * @author 邱依良
 */

public interface PaymentDao {
    int create(Payment payment);
    Payment getPaymentById(@Param("id")Long id);
}
