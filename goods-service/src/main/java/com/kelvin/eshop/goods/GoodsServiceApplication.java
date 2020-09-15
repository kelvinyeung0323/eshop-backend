package com.kelvin.eshop.goods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/9/9 15:44
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EntityScan(basePackages = "com.kelvin.eshop.goods.entity")
public class GoodsServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(GoodsServiceApplication.class, args);
//        new SpringApplicationBuilder(GoodsServiceApplication.class).web(WebApplicationType.NONE).run(args);
    }
}
