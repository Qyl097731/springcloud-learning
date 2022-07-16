package com.njxzc.springcloud.dao;

import com.njxzc.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.dao
 * date: 2022-07-13 22:10
 * author 邱依良
 */
@Mapper
public interface OrderDao {
    //1、新建订单
    void create(Order order);

    //2、修改订单状态，从零改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
