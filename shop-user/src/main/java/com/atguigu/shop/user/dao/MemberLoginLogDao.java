package com.atguigu.shop.user.dao;

import com.atguigu.shop.user.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author jincheng
 * @email jc_0318@126.com
 * @date 2021-06-26 15:22:34
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
