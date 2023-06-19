package com.liuwen.learning.order.dao;

import com.liuwen.learning.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lw
 * @email 780442619@qq.com
 * @date 2023-06-19 23:38:18
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
