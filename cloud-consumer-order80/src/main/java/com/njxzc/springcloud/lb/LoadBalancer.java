package com.njxzc.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.lb
 * date: 2022-06-09 23:30
 * copyright(c) 2020 南晓18卓工 邱依良
 *
 * @author 邱依良
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
