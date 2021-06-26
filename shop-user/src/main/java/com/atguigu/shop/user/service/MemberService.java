package com.atguigu.shop.user.service;

import com.atguigu.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.shop.user.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author jincheng
 * @email jc_0318@126.com
 * @date 2021-06-26 15:22:34
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

