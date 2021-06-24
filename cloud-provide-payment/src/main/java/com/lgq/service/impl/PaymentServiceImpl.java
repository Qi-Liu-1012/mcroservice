package com.lgq.service.impl;

import com.lgq.mapper.PaymentMapper;
import com.lgq.pojo.Payment;
import com.lgq.service.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: 服务接口实现
 * @Auther: liuguoqiang
 * @Date: 2021-6-23 15:44
 */
@Service
public class PaymentServiceImpl implements IPaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public Integer insertReturnId(Payment payment) {
        paymentMapper.insert(payment);
        return payment.getId().intValue();
    }

    @Override
    public Payment selectById(Integer id) {
        return paymentMapper.selectById(id);
    }
}
