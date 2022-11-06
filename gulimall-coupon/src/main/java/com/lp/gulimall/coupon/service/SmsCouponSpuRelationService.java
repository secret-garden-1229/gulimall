package com.lp.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.lp.gulimall.coupon.entity.SmsCouponSpuRelationEntity;
import com.lp.gulimall.utils.PageUtils;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-11-06 20:19:31
 */
public interface SmsCouponSpuRelationService extends IService<SmsCouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

