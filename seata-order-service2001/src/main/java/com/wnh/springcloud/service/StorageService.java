package com.wnh.springcloud.service;

import com.wnh.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: wnhyang
 * @create: 2021-08-07 15:17
 **/
@FeignClient(value = "seata-storage-service")
public interface StorageService {
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count);
}
