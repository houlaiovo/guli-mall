package com.guli.mall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.guli.mall.order.dao")
public class GuliOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuliOrderApplication.class, args);
    }

}
