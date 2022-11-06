package com.lp.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lp.gulimall.utils.PageUtils;
import com.lp.gulimall.order.entity.OmsOrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-11-06 20:15:56
 */
public interface OmsOrderItemService extends IService<OmsOrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

