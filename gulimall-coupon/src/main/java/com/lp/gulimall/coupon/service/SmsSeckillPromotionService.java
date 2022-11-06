package com.lp.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lp.gulimall.utils.PageUtils;
import com.lp.gulimall.coupon.entity.SmsSeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-11-06 20:19:31
 */
public interface SmsSeckillPromotionService extends IService<SmsSeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

