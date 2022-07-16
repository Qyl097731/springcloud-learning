package com.njxzc.springcloud.service;

import com.njxzc.springcloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.service
 * date: 2022-07-13 22:22
 * author 邱依良
 */
@FeignClient(value="seata-storage-service")
public interface StorageService {
    //请求方式要与2002中的StorageController一致
    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}

