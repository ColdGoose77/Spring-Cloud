package com.yun.product.service;

import com.yun.product.mapper.ProductMapper;
import com.yun.product.model.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yun
 * @date 2024/9/25 21:01
 * @desciption: 商品业务逻辑
 */
@Service
public class ProductService {

    @Autowired
    private ProductMapper productMapper;

    public ProductInfo selectProductById(Integer productId) {
        return productMapper.selectProductById(productId);
    }


}
