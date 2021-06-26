package com.atguigu.shop.product.Feign;

import com.atguigu.common.utils.R;
import org.springframework.beans.factory.annotation.Autowired;

public class test {

    @Autowired
    UserFeign userFeign;
    public void test(){
        R r = userFeign.testFeign();
        Object status = r.get("status");
    }
}
