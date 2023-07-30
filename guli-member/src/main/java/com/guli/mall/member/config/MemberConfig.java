package com.guli.mall.member.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @文件名: MemberConfig
 * @文件简介:
 * @author: guozhicheng
 * @date: 2023/7/30 7:57 下午
 * Copyright (c) 2023 ERAYT. All Rights Reserved
 */
@Configuration
@ConfigurationProperties(prefix = "member")
@Data
public class MemberConfig {
    private String coupon;
}
