package com.lp.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lp.gulimall.utils.PageUtils;
import com.lp.gulimall.order.entity.OmsOrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-11-06 20:15:56
 */
public interface OmsOrderReturnApplyService extends IService<OmsOrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

