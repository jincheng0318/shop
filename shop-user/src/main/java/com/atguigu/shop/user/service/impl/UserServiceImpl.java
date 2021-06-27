package com.atguigu.shop.user.service.impl;

import com.atguigu.shop.user.dao.UserDao;
import com.atguigu.shop.user.entity.UserEntity;
import com.atguigu.shop.user.service.UserService;
import com.atguigu.shop.user.VO.UserVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public boolean isValid(UserVo userVo) {
        QueryWrapper<UserEntity> wrapper = new QueryWrapper<>();
        wrapper.eq("username",userVo.getUsername());
        UserEntity entity = userDao.selectOne(wrapper);
        if(entity==null||!userVo.getPassword().equals(entity.getPassword())) return false;
        return true;
    }
}
