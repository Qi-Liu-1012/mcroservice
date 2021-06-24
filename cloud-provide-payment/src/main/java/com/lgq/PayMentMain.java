package com.lgq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description: springboot启动类
 * @Auther: liuguoqiang
 * @Date: 2021-6-23 15:29
 */

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PayMentMain {
    public static void main(String[] args) {
        SpringApplication.run(PayMentMain.class,args);
    }
}