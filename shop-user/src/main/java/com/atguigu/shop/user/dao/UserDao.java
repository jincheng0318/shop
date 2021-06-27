package com.atguigu.shop.user.dao;

import com.atguigu.shop.user.VO.UserVo;
import com.atguigu.shop.user.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends BaseMapper<UserEntity> {
//    UserVo findByUsername(String userName);
}
