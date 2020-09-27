package com.kelvin.eshop.web;

import com.kelvin.eshop.goods.service.GoodsService;
import com.kelvin.eshop.order.dto.OrderQuery;
import com.kelvin.eshop.order.entity.Order;
import com.kelvin.eshop.order.service.OrderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


//@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
@RestController
public class WebApplication {

    @DubboReference
    private GoodsService goodsService;

    @DubboReference
    private OrderService orderService;

    @GetMapping("hello")
    public String hello2(){
        List<Order> orderList =orderService.queryOrder(new OrderQuery());
        goodsService.getGoodsAttribute("abc");
        return "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class,args);
    }
}
