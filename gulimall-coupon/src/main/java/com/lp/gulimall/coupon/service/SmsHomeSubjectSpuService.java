package com.lp.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.lp.gulimall.coupon.entity.SmsHomeSubjectSpuEntity;
import com.lp.gulimall.utils.PageUtils;

import java.util.Map;

/**
 * 专题商品
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-11-06 20:19:31
 */
public interface SmsHomeSubjectSpuService extends IService<SmsHomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

