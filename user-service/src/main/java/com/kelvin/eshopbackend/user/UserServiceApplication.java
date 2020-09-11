package com.kelvin.eshopbackend.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/9/10 11:10
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EntityScan("com.kelvin")
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
        //new SpringApplicationBuilder(UserServiceApplication.class).web(WebApplicationType.NONE).run(args);
    }
}
