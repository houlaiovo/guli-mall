package com.guli.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.guli.mall.common.utils.PageUtils;
import com.guli.mall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author gzc
 * @email gzc@163.com
 * @date 2023-07-09 18:05:24
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

