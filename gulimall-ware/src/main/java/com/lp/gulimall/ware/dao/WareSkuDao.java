package com.lp.gulimall.ware.dao;

import com.lp.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-11-06 20:30:21
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
