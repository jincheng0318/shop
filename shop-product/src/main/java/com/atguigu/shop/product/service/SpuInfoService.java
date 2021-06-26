package com.atguigu.shop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.shop.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author jincheng
 * @email jc_0318@126.com
 * @date 2021-06-25 17:00:09
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

