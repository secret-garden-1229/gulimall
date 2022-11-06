package com.lp.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lp.gulimall.utils.PageUtils;
import com.lp.gulimall.product.entity.PmsAttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-11-06 20:28:02
 */
public interface PmsAttrService extends IService<PmsAttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

