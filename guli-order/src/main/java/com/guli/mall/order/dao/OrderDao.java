package com.guli.mall.order.dao;

import com.guli.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author gzc
 * @email gzc@163.com
 * @date 2023-07-30 11:40:13
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
