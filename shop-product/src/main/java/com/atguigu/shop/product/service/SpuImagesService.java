package com.atguigu.shop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.shop.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author jincheng
 * @email jc_0318@126.com
 * @date 2021-06-25 17:00:09
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

