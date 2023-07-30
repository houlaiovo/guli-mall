package com.guli.mall.member.feign;

import com.guli.mall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("guli-coupon")
public interface CouponService {
    @RequestMapping("/coupon/coupon/member")
    R memberCoupon();
}
