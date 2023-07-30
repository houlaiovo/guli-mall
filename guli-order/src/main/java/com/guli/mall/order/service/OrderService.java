package com.guli.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.mall.common.utils.PageUtils;
import com.guli.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author gzc
 * @email gzc@163.com
 * @date 2023-07-30 11:40:13
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

