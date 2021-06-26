package com.atguigu.shop.order.service;

import com.atguigu.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
//import com.atguigu.common.PageUtils;
import com.atguigu.shop.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author jincheng
 * @email jc_0318@126.com
 * @date 2021-06-26 12:23:34
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

