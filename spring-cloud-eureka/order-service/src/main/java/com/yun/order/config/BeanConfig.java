package com.yun.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author yun
 * @date 2024/9/26 10:01
 * @desciption: RestTemplate对象获取
 */
@Configuration
@LoadBalancerClient(name = "product-service", configuration = LoadBalancerConfig.class)
public class BeanConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
