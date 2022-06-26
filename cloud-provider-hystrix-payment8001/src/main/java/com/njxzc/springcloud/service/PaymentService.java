package com.njxzc.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.com.njxzc.springcloud.service
 * date: 2022-06-10 21:55
 * copyright(c) 2020 南晓18卓工 邱依良
 *
 * @author 邱依良
 */
@Service
public class PaymentService {
    public String paymentInfo_OK(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "OK, id = " + id;
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeoutHandler"
            , commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public String paymentInfo_Timeout(Integer id) {
        int timeout = 5;
        try {
            TimeUnit.SECONDS.sleep(timeout);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + "TimeOut, id = " + id;
    }

    public String paymentInfo_TimeoutHandler(Integer id) {
        return "线程池" + Thread.currentThread().getName() + "TimeOutFallback , id = " + id;
    }


    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_Fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),      //是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),  //请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),//时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60") //失败率多少后跳闸
    })
    public String paymentCircuitBreaker(@PathVariable("id") Integer id) {
        if(id < 0){
            throw new RuntimeException("id 不能为负数");
        }
        String serialNumber = IdUtil.simpleUUID();

        return Thread.currentThread().getName() + "\t 调用成功, 流水号为 : " + serialNumber;
    }

    public String paymentCircuitBreaker_Fallback(@PathVariable("id")Integer id){
        return "paymentCircuitBreaker_Fallback \t id = " + id;
    }
}
