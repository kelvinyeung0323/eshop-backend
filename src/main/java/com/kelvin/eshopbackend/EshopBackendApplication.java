package com.kelvin.eshopbackend;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication

public class EshopBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(EshopBackendApplication.class, args);
    }

}
