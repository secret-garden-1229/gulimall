package com.lp.gulimall.coupon.dao;

import com.lp.gulimall.coupon.entity.SmsCouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-11-06 20:19:31
 */
@Mapper
public interface SmsCouponSpuRelationDao extends BaseMapper<SmsCouponSpuRelationEntity> {
	
}
