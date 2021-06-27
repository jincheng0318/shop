package com.atguigu.shop.user.TO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class UserTo {
    String username;
    String password;
}
