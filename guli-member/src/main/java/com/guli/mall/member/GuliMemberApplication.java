package com.guli.mall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.guli.mall.member.feign")
@MapperScan("com.guli.mall.member.dao")
public class GuliMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuliMemberApplication.class, args);
    }

}
