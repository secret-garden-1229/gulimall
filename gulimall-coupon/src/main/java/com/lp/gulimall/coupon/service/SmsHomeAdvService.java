package com.lp.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.lp.gulimall.coupon.entity.SmsHomeAdvEntity;
import com.lp.gulimall.utils.PageUtils;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-11-06 20:19:31
 */
public interface SmsHomeAdvService extends IService<SmsHomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

