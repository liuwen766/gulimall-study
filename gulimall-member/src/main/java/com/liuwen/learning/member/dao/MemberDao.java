package com.liuwen.learning.member.dao;

import com.liuwen.learning.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lw
 * @email 780442619@qq.com
 * @date 2023-06-19 23:35:19
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
