package com.wnh.springcloud.service;

import com.wnh.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author: wnhyang
 * @create: 2021-08-07 15:21
 **/
@FeignClient(value = "seata-account-service")
public interface AccountService {
    @RequestMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
