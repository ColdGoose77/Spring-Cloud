package com.yun.order.service;

import com.yun.order.mapper.OrderMapper;
import com.yun.order.model.OrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yun
 * @date 2024/9/25 20:37
 * @desciption: 订单业务逻辑
 */

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public OrderInfo selectOrderById(Integer orderId) {

        return orderMapper.selectOrderById(orderId);
    }

}
