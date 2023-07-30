package com.guli.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.guli.mall.product.dao")
public class GuliProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuliProductApplication.class, args);
    }

}
