package com.liuwen.learning.ware.dao;

import com.liuwen.learning.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author lw
 * @email 780442619@qq.com
 * @date 2023-06-19 23:39:16
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
