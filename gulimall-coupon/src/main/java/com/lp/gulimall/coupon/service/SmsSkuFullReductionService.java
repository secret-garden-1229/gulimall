package com.lp.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lp.gulimall.utils.PageUtils;
import com.lp.gulimall.coupon.entity.SmsSkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-11-06 20:19:31
 */
public interface SmsSkuFullReductionService extends IService<SmsSkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

