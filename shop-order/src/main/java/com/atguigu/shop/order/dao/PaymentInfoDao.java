package com.atguigu.shop.order.dao;

import com.atguigu.shop.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author jincheng
 * @email jc_0318@126.com
 * @date 2021-06-26 12:23:34
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
