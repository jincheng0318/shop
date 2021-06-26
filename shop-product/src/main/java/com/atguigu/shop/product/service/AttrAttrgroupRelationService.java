package com.atguigu.shop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.shop.product.entity.AttrAttrgroupRelationEntity;
import com.atguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author jincheng
 * @email jc_0318@126.com
 * @date 2021-06-25 17:00:08
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

