package com.kelvin.eshopbackend.goodsservice;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/9/9 15:44
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GoodsServiceApplication {
    public static void main(String[] args) {
        //SpringApplication.run(GoodsServiceApplication.class, args);
        new SpringApplicationBuilder(GoodsServiceApplication.class).web(WebApplicationType.NONE).run(args);
    }
}
