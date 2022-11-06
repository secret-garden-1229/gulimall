package com.lp.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lp.gulimall.utils.PageUtils;
import com.lp.gulimall.product.entity.PmsAttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-11-06 20:28:02
 */
public interface PmsAttrAttrgroupRelationService extends IService<PmsAttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

