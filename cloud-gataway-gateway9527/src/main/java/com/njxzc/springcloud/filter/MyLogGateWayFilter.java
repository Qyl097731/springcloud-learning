package com.njxzc.springcloud.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.filter
 * date: 2022-06-28 21:19
 * copyright(c) 2020 南晓18卓工 邱依良
 *
 * @author 邱依良
 */
@Component
public class MyLogGateWayFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println("time = " + new Date());
        String username = exchange.getRequest().getQueryParams().getFirst("username");
        if(username == null){
            System.out.println("illegal user " + new Date());
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
