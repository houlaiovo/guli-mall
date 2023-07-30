package com.guli.mall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.guli.mall.ware.dao")
public class GuliWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuliWareApplication.class, args);
    }

}
