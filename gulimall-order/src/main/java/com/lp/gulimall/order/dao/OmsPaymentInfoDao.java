package com.lp.gulimall.order.dao;

import com.lp.gulimall.order.entity.OmsPaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-11-06 20:15:56
 */
@Mapper
public interface OmsPaymentInfoDao extends BaseMapper<OmsPaymentInfoEntity> {
	
}
