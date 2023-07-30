package com.guli.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.mall.common.utils.PageUtils;
import com.guli.mall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author gzc
 * @email gzc@163.com
 * @date 2023-07-29 20:17:44
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

