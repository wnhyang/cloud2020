package com.wnh.springcloud.controller;

import com.wnh.springcloud.entities.CommonResult;
import com.wnh.springcloud.entities.Payment;
import com.wnh.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: wnhyang
 * @create: 2021-07-22 17:13
 **/
@RestController
@Slf4j
public class OrderFeignController
{
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/consumer/payment/feign/timeout")
    public String paymentTimeOut(){

        // OpenFeign客户端一般默认等待1秒钟
        return paymentFeignService.paymentTimeOut();
    }

}
