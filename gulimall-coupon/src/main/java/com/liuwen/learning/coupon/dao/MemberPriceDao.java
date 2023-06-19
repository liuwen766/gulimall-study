package com.liuwen.learning.coupon.dao;

import com.liuwen.learning.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author lw
 * @email 780442619@qq.com
 * @date 2023-06-19 23:24:28
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
