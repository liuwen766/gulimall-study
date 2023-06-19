package com.liuwen.learning.order.dao;

import com.liuwen.learning.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author lw
 * @email 780442619@qq.com
 * @date 2023-06-19 23:38:18
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
