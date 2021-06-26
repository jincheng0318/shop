package com.atguigu.shop.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**整合MyBatis-class
 * （1）导入依赖
 *         <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.4.2</version>
 *         </dependency>
 *
 *  （2）配置
 *  1.配置数据源
 *      1）导入数据库驱动
 *  2.配置MyBatis-plus
 *
 */


@MapperScan("com/atguigu/shop/order/dao")
@SpringBootApplication
@EnableFeignClients()
public class ShopOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopOrderApplication.class, args);
    }

}
