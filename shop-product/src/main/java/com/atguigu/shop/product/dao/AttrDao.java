package com.atguigu.shop.product.dao;

import com.atguigu.shop.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author jincheng
 * @email jc_0318@126.com
 * @date 2021-06-25 17:00:08
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
