package com.wnh.springcloud.dao;

import com.wnh.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: wnhyang
 * @create: 2021-06-03 21:15
 **/

@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
