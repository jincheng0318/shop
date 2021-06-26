package com.atguigu.shop.product.service;


import com.atguigu.shop.product.entity.SkuImagesEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * sku图片
 *
 * @author jincheng
 * @email jc_0318@126.com
 * @date 2021-06-25 17:00:08
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

