package com.wnh.springcloud.service;

import com.wnh.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author: wnhyang
 * @create: 2021-06-03 21:36
 **/
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
