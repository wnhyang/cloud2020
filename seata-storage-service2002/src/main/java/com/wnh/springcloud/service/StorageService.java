package com.wnh.springcloud.service;

/**
 * @author: wnhyang
 * @create: 2021-08-07 15:10
 **/
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}

