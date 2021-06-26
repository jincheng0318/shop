package com.atguigu.shop.user.dao;

import com.atguigu.shop.user.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author jincheng
 * @email jc_0318@126.com
 * @date 2021-06-26 15:22:34
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
