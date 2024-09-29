package com.yun.product.model;

import lombok.Data;

import java.util.Date;

/**
 * @author yun
 * @date 2024/9/25 20:55
 * @desciption: 商品实体类
 */

@Data
public class ProductInfo {

    private Integer id;
    private String productNamel;
    private Long productPrice;
    private Byte state;
    private Date createTime;
    private Date updateTime;

}
