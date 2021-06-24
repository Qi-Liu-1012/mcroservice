package com.lgq.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Auther: liuguoqiang
 * @Date: 2021-6-24 14:44
 */

@RestController
@RequestMapping("/discovery")
@Slf4j
public class DiscoveryController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/getService")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String s : services){
            log.info("********注册到eureka中的服务中有:"+s);
        }
        List <ServiceInstance> instances = discoveryClient.getInstances("cloud-provide-payment");
        for (ServiceInstance s: instances) {
            log.info("当前服务的实例有"+s.getServiceId()+"\t"+s.getHost()+"\t"+s.getPort()+"\t"+s.getUri());
        }
        return this.discoveryClient;
    }

}

