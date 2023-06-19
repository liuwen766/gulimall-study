package com.liuwen.learning.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liuwen.common.utils.PageUtils;
import com.liuwen.learning.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author lw
 * @email 780442619@qq.com
 * @date 2023-06-19 21:17:13
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

