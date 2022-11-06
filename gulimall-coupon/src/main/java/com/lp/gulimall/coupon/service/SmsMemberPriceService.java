package com.lp.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.lp.gulimall.coupon.entity.SmsMemberPriceEntity;
import com.lp.gulimall.utils.PageUtils;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-11-06 20:19:31
 */
public interface SmsMemberPriceService extends IService<SmsMemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

