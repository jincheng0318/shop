package com.atguigu.shop.user.controller;


import com.atguigu.common.utils.R;
import com.atguigu.shop.user.TO.UserTo;
import com.atguigu.shop.user.VO.UserVo;
import com.atguigu.shop.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/verify")
    @ResponseBody
    public R verify(@RequestBody UserVo userVo){
//        UserTo userTo = new UserTo(username, password);
        System.out.println(userVo);
        boolean valid = userService.isValid(userVo);
        if(valid) return R.ok().put("msg","通过");
        return R.error().put("msg","验证失败");
    }


    @GetMapping("/testFeign")
    @ResponseBody
    public R testFeign(){
        return R.ok().put("status", "200");
    }
}
