package com.atguigu.shop.user.service.impl;

import com.atguigu.shop.user.dao.UserDao;
import com.atguigu.shop.user.service.UserService;
import com.atguigu.shop.user.VO.UserVo;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public boolean isValid(UserVo userVo) {
        UserVo byUsername = userDao.findByUsername(userVo.getUsername());
        if(byUsername.getPassword().equals(userVo.getPassword())){ //登录成功
            return true;
        }else {
            return false;
        }

    }
}
