package com.liuwen.learning.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liuwen.common.utils.PageUtils;
import com.liuwen.learning.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author lw
 * @email 780442619@qq.com
 * @date 2023-06-19 21:17:14
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

