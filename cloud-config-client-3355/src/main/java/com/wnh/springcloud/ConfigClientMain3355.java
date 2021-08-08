package com.wnh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: wnhyang
 * @create: 2021-07-25 21:27
 **/
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientMain3355
{
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3355.class, args);
    }
}