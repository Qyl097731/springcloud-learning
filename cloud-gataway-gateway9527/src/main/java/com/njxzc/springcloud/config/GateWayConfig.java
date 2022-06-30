package com.njxzc.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.config
 * date: 2022-06-26 22:43
 * copyright(c) 2020 南晓18卓工 邱依良
 *
 * @author 邱依良
 */

@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
        return builder.routes().route("path_route_njxzc",r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
    }

    @Bean
    public RouteLocator customRouteLocator2(RouteLocatorBuilder builder){
        return builder.routes().route("path_route_njxzc2",r -> r.path("/guoji").uri("http://news.baidu.com/guoji")).build();
    }
}
