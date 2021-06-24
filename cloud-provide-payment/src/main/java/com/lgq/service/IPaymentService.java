package com.lgq.service;

import com.lgq.pojo.Payment;
/**
 * @Description: 服务接口
 * @Auther: liuguoqiang
 * @Date: 2021-6-23 15:44
 */
public interface IPaymentService {

    /**
     * 插入数据 返回ID
     *
     * @param payment
     * @return
     */
    Integer insertReturnId(Payment payment);

    /**
     * 通过ID查询
     *
     * @param id
     * @return
     */
    Payment selectById(Integer id);
}
