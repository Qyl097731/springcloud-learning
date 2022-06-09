package com.njxzc.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.myrule
 * date: 2022-06-09 00:48
 * copyright(c) 2020 南晓18卓工 邱依良
 *
 * @author 邱依良
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
