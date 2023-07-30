package com.guli.mall.coupon.dao;

import com.guli.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author gzc
 * @email gzc@163.com
 * @date 2023-07-29 20:17:44
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
