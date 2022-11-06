package com.lp.gulimall.order.dao;

import com.lp.gulimall.order.entity.OmsOrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-11-06 20:15:56
 */
@Mapper
public interface OmsOrderOperateHistoryDao extends BaseMapper<OmsOrderOperateHistoryEntity> {
	
}
