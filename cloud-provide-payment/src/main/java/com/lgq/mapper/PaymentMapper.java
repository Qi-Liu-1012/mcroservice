package com.lgq.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lgq.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Auther: liuguoqiang
 * @Date: 2021-6-23 15:33
 */
@Component
@Repository
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {
}