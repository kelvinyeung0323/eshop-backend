package com.kelvin.eshop.web;

import com.kelvin.eshop.goods.service.GoodsService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
@RestController
public class WebApplication {

    @DubboReference
    private GoodsService goodsService;

    @GetMapping("hello")
    public String hello2(){

        goodsService.getGoodsAttribute("abc");
        return "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class,args);
    }
}
