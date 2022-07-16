package com.njxzc.springcloud.controller;

import com.njxzc.springcloud.domain.CommonResult;
import com.njxzc.springcloud.domain.Order;
import com.njxzc.springcloud.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.controller
 * date: 2022-07-13 22:28
 * author 邱依良
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

//    @GetMapping("/order/create")
//    public CommonResult create(Order order)
//    {
//        orderService.create(order);
//        return new CommonResult(200,"订单创建成功");
//    }

    @GetMapping("/order/create")
    public CommonResult<Order> create(Order order)
    {
        orderService.create(order);
        return new CommonResult<Order>(200,"订单创建成功",order);
    }


}
