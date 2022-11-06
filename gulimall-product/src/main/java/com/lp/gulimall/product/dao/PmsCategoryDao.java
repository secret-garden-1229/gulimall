package com.lp.gulimall.product.dao;

import com.lp.gulimall.product.entity.PmsCategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-11-06 20:28:02
 */
@Mapper
public interface PmsCategoryDao extends BaseMapper<PmsCategoryEntity> {
	
}
