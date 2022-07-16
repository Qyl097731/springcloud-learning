package com.njxzc.springcloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.njxzc.springcloud.entities.CommonResult;


/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.handler
 * date: 2022-07-12 20:23
 * author 邱依良
 */
public class CustomerBlockHandler
{
    public static CommonResult handlerException(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }
    public static CommonResult handlerException2(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}

