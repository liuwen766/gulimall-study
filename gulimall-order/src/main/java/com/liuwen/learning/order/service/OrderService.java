package com.liuwen.learning.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liuwen.common.utils.PageUtils;
import com.liuwen.learning.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author lw
 * @email 780442619@qq.com
 * @date 2023-06-19 23:38:18
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

