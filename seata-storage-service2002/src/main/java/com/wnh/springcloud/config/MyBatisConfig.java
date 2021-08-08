package com.wnh.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.wnh.springcloud.dao"})
public class MyBatisConfig {
}
