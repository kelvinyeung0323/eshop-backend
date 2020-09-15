package com.kelvin.eshop.user;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/9/10 11:10
 * @description:
 */
//@SpringBootApplication

@EnableDiscoveryClient
@EnableAutoConfiguration
@EntityScan("com.kelvin")
public class UserServiceApplication {
    public static void main(String[] args) {
//        SpringApplication.run(UserServiceApplication.class, args);
        new SpringApplicationBuilder(UserServiceApplication.class).web(WebApplicationType.NONE).run(args);
    }
}
