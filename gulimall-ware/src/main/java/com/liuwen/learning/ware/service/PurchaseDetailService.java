package com.liuwen.learning.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liuwen.common.utils.PageUtils;
import com.liuwen.learning.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author lw
 * @email 780442619@qq.com
 * @date 2023-06-19 23:39:16
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

