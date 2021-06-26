package com.atguigu.shop.order.dao;

import com.atguigu.shop.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author jincheng
 * @email jc_0318@126.com
 * @date 2021-06-26 12:23:34
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
