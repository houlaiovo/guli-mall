package com.guli.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.guli.mall.common.utils.PageUtils;
import com.guli.mall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author gzc
 * @email gzc@163.com
 * @date 2023-07-09 18:05:24
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

