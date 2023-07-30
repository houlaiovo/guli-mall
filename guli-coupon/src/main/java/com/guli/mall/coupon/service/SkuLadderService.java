package com.guli.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.mall.common.utils.PageUtils;
import com.guli.mall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author gzc
 * @email gzc@163.com
 * @date 2023-07-29 20:17:44
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

