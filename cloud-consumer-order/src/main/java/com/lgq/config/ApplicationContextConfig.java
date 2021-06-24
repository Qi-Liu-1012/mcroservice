package com.lgq.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Auther: liuguoqiang
 * @Date: 2021-6-24 10:29
 */

@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced//负载均衡策略 轮询
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
