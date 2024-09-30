package com.yun.order.service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import com.yun.order.mapper.OrderMapper;
import com.yun.order.model.OrderInfo;
import com.yun.order.model.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author yun
 * @date 2024/9/25 20:37
 * @desciption: 订单业务逻辑
 */

@Service
@Slf4j
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    public OrderInfo selectOrderById(Integer orderId) {
        OrderInfo orderInfo = orderMapper.selectOrderById(orderId);
//        String url = "http://localhost:58081/product/1001";
        List<ServiceInstance> instances = discoveryClient.getInstances("product-service");
        String uri = instances.get(0).getUri().toString();
        String url = uri + "/product/" + orderInfo.getProductId();
        ProductInfo productInfo = restTemplate.getForObject(url, ProductInfo.class);
        orderInfo.setProductInfo(productInfo);

        return orderInfo;
    }

}
