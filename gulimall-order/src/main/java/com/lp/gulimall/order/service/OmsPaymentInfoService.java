package com.lp.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lp.gulimall.utils.PageUtils;
import com.lp.gulimall.order.entity.OmsPaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-11-06 20:15:56
 */
public interface OmsPaymentInfoService extends IService<OmsPaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

