package com.guli.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.guli.mall.common.utils.PageUtils;
import com.guli.mall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author gzc
 * @email gzc@163.com
 * @date 2023-07-09 18:05:24
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

