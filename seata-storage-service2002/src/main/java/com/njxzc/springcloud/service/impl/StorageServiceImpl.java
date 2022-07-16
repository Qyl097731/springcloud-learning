package com.njxzc.springcloud.service.impl;

import com.njxzc.springcloud.dao.StorageDao;
import com.njxzc.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.service.impl
 * date: 2022-07-14 00:03
 * author 邱依良
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {
    @Resource
    private StorageDao storageDao;
    @Override
    public void decrease(Long productId, Integer count) {
        log.info("------->storage-service中扣减库存开始");
        storageDao.decrease(productId,count);
        log.info("------->storage-service中扣减库存结束");
    }
}
