package com.atguigu.shop.user.dao;

import com.atguigu.shop.user.VO.UserVo;

public interface UserDao {
    UserVo findByUsername(String userName);
}
