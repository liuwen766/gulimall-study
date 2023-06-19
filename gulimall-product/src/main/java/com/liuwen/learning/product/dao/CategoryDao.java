package com.liuwen.learning.product.dao;

import com.liuwen.learning.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lw
 * @email 780442619@qq.com
 * @date 2023-06-19 21:17:14
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
