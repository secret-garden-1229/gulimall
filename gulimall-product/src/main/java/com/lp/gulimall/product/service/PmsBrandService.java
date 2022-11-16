package com.lp.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lp.gulimall.utils.PageUtils;
import com.lp.gulimall.product.entity.PmsBrandEntity;

import java.util.List;
import java.util.Map;

/**
 * 品牌
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-11-06 20:28:02
 */
public interface PmsBrandService extends IService<PmsBrandEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void removeBrandByIds(List<Long> asList);



    void updateBrandByIds(PmsBrandEntity pmsBrand);
}

