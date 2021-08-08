package com.wnh.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author: wnhyang
 * @create: 2021-07-22 16:22
 **/
public interface LoadBalancer {

    ServiceInstance instance(List<ServiceInstance> serviceInstances);

}
