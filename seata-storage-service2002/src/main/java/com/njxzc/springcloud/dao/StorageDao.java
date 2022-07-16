package com.njxzc.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.dao
 * date: 2022-07-13 23:58
 * author 邱依良
 */
@Mapper
public interface StorageDao {
    //扣减库存
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
