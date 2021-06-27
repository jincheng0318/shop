package com.atguigu.shop.order.controller;

import com.atguigu.common.utils.R;
import com.atguigu.shop.order.entity.SkuInfoEntity;
import com.atguigu.shop.order.feign.ProductFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;

@RestController
@RequestMapping("/order")
public class OrderProductController {
    @Autowired
    ProductFeign productFeign;

    @RequestMapping("/new/{skuId}")
    public R newOrder(@PathVariable("skuId") Long skuId){
        R info = productFeign.info(skuId);
        Object o = info.get("skuInfo");
        if(o == null){
            return R.error();
        }
        LinkedHashMap o1 = (LinkedHashMap) o;
//        SkuInfoEntity skuInfo = (SkuInfoEntity) o;
        //下单

        return R.ok().put("skuinfo", o1);
    }
}
