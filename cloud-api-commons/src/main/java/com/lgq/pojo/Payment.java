package com.lgq.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Description: 测试表实体
 * @Auther: liuguoqiang
 * @Date: 2021-6-23 14:40
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("payment")
public class Payment implements Serializable {

    /**
     * ID
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 类型  （微服务 一个服务对应一个数据库，同一个信息可能存在不同的数据库）
     */
    @TableField("SERIAL")
    private  String serial;

    /*自定义属性*/

    /**
     * 当前服务的Ip和端口
     */
    @TableField(exist = false)
    private String ipAndPort;
}

