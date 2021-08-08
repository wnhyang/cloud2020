package com.wnh.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.wnh.springcloud.entities.CommonResult;

/**
 * @author: wnhyang
 * @create: 2021-07-29 22:25
 **/
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444, "按客戶自定义,global handlerException----1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "按客戶自定义,global handlerException----2");
    }
}
