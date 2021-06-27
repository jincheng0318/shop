package com.atguigu.shop.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@TableName("ums_member")
public class UserEntity {
    String username;
    String password;
}
