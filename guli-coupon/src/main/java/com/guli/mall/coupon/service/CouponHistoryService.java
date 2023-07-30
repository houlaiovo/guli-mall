package com.guli.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.mall.common.utils.PageUtils;
import com.guli.mall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author gzc
 * @email gzc@163.com
 * @date 2023-07-29 20:17:44
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

