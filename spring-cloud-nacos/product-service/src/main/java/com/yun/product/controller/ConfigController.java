package com.yun.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/config")
public class ConfigController {

    @Value("${nacos.config}")
    private String config;

    @RequestMapping("/getConfig")
    public String getConfig() {


        return "配置为：" + config;
    }

}
