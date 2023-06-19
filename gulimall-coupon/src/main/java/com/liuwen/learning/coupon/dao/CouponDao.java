package com.liuwen.learning.coupon.dao;

import com.liuwen.learning.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lw
 * @email 780442619@qq.com
 * @date 2023-06-19 23:24:28
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
