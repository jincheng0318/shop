package com.atguigu.shop.product.Feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("show-user")
public interface UserFeign {
    @GetMapping("/user/testFeign")
    public R testFeign();

}
