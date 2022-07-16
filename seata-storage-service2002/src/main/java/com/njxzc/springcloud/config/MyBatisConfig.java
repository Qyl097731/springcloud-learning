package com.njxzc.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.config
 * date: 2022-07-14 00:04
 * author 邱依良
 */
@Configuration
@MapperScan({"com.njxzc.springcloud.dao"})
public class MyBatisConfig {
}
