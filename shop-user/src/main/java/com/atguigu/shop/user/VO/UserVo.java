package com.atguigu.shop.user.VO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class UserVo {
    String username;
    String password;
}
