package com.njxzc.springcloud.service;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.service
 * date: 2022-07-14 00:02
 * author 邱依良
 */
public interface StorageService {
    void decrease(Long productId, Integer count);
}
