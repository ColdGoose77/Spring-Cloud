package com.yun.order.service;

import com.yun.order.mapper.OrderMapper;
import com.yun.order.model.OrderInfo;
import com.yun.order.model.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author yun
 * @date 2024/9/25 20:37
 * @desciption: 订单业务逻辑
 */

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    RestTemplate restTemplate;

    public OrderInfo selectOrderById(Integer orderId) {
        OrderInfo orderInfo = orderMapper.selectOrderById(orderId);
        String url = "http://localhost:58081/product/1001";
        ProductInfo productInfo = restTemplate.getForObject(url, ProductInfo.class);
        orderInfo.setProductInfo(productInfo);

        return orderInfo;
    }

}
