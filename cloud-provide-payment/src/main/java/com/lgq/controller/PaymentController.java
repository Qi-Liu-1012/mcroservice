package com.lgq.controller;

import com.lgq.pojo.CommonResult;
import com.lgq.pojo.Payment;
import com.lgq.service.IPaymentService;
import com.lgq.util.PortUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: 请求接口实现
 * @Auther: liuguoqiang
 * @Date: 2021-6-23 15:32
 */

@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Autowired
    private IPaymentService paymentService;

    @RequestMapping("/insert")
    public CommonResult<Integer> insert(@RequestBody Payment dept){
        try {
            Integer id = paymentService.insertReturnId(dept);
            return new CommonResult<Integer>(200,"插入数据库成功", id);
        }catch (Exception e){
            e.printStackTrace();
            return new CommonResult<Integer>(444,"插入数据库失败");
        }
    }

    @RequestMapping("/getPaymentById")
    public CommonResult<Payment> getPaymentById(@RequestBody Integer id){
        try {
            Payment payment = paymentService.selectById(id);
            payment.setIpAndPort(PortUtils.getIpAndPort());
            return new CommonResult<Payment>(200,"查询成功", payment);
        }catch (Exception e){
            e.printStackTrace();
            return new CommonResult<Payment>(444,"查询失败");
        }
    }
}
