package com.guli.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.mall.common.utils.PageUtils;
import com.guli.mall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author gzc
 * @email gzc@163.com
 * @date 2023-07-29 20:17:44
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

