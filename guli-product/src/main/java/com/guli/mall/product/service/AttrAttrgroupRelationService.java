package com.guli.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.guli.mall.common.utils.PageUtils;
import com.guli.mall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author gzc
 * @email gzc@163.com
 * @date 2023-07-09 18:05:24
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

