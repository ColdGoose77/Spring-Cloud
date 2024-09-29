package com.yun.order.model;

import lombok.Data;

import java.util.Date;

/**
 * @author yun
 * @date 2024/9/25 20:33
 * @desciption: 订单类
 */

@Data
public class OrderInfo {

    private Integer id;
    private Long userId;
    private Long productId;
    private Integer num;
    private Long price;
    private Byte deleteFlag;
    private Date createTime;
    private Date updateTime;
    private ProductInfo productInfo;

}
