package com.njxzc.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.lb
 * date: 2022-06-09 23:32
 * copyright(c) 2020 南晓18卓工 邱依良
 *
 * @author 邱依良
 */
@Component
public class MyLB implements LoadBalancer{

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getNext(){
        int current;
        int next;
        do {
            current = atomicInteger.get();
            next = current >= Integer.MAX_VALUE ? 0 : current+1;
        }while(!atomicInteger.compareAndSet(current,next));
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = getNext() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
