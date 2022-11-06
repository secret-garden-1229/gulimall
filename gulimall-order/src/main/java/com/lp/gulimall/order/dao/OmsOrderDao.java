package com.lp.gulimall.order.dao;

import com.lp.gulimall.order.entity.OmsOrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-11-06 20:15:56
 */
@Mapper
public interface OmsOrderDao extends BaseMapper<OmsOrderEntity> {
	
}
