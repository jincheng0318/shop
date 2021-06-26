package com.atguigu.shop.user.controller;


import com.atguigu.common.utils.R;
import com.atguigu.shop.user.TO.UserTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {
    @PostMapping("/verify")
    @ResponseBody
    public String verify(@RequestBody UserTo userTo){
        return null;
    }


    @GetMapping("/testFeign")
    @ResponseBody
    public R testFeign(){
        return R.ok().put("status", "200");
    }
}
