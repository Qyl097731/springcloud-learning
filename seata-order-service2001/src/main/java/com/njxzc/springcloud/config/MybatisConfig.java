package com.njxzc.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.config
 * date: 2022-07-13 22:32
 * author 邱依良
 */
@Configuration
@MapperScan({"com.njxzc.springcloud.dao"})
public class MybatisConfig {
}
