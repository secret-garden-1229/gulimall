package com.lp.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lp.gulimall.coupon.entity.SmsCouponSpuCategoryRelationEntity;
import com.lp.gulimall.utils.PageUtils;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-11-06 20:19:31
 */
public interface SmsCouponSpuCategoryRelationService extends IService<SmsCouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

