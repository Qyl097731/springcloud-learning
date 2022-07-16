package com.njxzc.springcloud.service;

import com.njxzc.springcloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.service
 * date: 2022-07-13 22:21
 * author 邱依良
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {
    //请求方式要与2003中的AccountController一致
    @PostMapping(value = "/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId,@RequestParam("money") BigDecimal money);
}
