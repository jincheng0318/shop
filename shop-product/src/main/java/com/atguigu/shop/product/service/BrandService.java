package com.atguigu.shop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.shop.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author jincheng
 * @email jc_0318@126.com
 * @date 2021-06-25 17:00:08
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

