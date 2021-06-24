package com.lgq.controller;

import com.lgq.pojo.CommonResult;
import com.lgq.pojo.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Auther: liuguoqiang
 * @Date: 2021-6-24 10:30
 */


@RestController
@Slf4j
@RequestMapping("/order")
public class OrderController {

    //调用支付订单服务端的ip+端口号
    public static final String PAYMENT_URL = "http://CLOUD-PROVIDE-PAYMENT";

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 创建支付订单的接口
     *
     * @param payment
     * @return
     */
    @RequestMapping("/insert")
    public CommonResult<Integer> create(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/insert", payment, CommonResult.class);
    }

    /**
     * 获取id获取支付订单
     *
     * @param id
     * @return
     */
    @RequestMapping("/getPaymentById")
    public CommonResult<Payment> getPayment(Integer id) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/getPaymentById", id, CommonResult.class);
    }
}
