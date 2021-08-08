package com.wnh.springcloud.dao;

import com.wnh.springcloud.entities.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

/**
 * @author: wnhyang
 * @create: 2021-08-07 14:40
 **/
@Mapper
public interface OrderDao {
    void create(Order order);

    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
