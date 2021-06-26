package com.atguigu.shop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.shop.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author jincheng
 * @email jc_0318@126.com
 * @date 2021-06-25 17:00:08
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

