package com.lgq.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Description: 公有回复实体
 * @Auther: liuguoqiang
 * @Date: 2021-6-23 14:40
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CommonResult<T> {

    /**
     * 返回状态码
     */
    private Integer code;

    /**
     * 返回是否调用成功
     */
    private String  message;

    /**
     * 返回的数据
     */
    private  T data;

    public CommonResult(Integer code, String message) {
        this(code,message,null);
    }
}
