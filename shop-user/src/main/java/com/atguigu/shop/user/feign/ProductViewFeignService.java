package com.atguigu.shop.user.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 这是一个声明式的远程调用
 */
@FeignClient("shop-product")
public interface ProductViewFeignService {
    @RequestMapping("/product/category/list/tree")
    //@RequiresPermissions("product:category:list")
    public R listWithTree();
    //public R list();
}
