package com.yun.product.controller;

import com.yun.product.model.ProductInfo;
import com.yun.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yun
 * @date 2024/9/25 21:02
 * @desciption: 商品api接口
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/{productId}")
    public ProductInfo getProductById(@PathVariable("productId") Integer productId) {
        return productService.selectProductById(productId);
    }

}
