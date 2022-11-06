package com.lp.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lp.gulimall.utils.PageUtils;
import com.lp.gulimall.member.entity.UmsIntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-11-06 20:24:07
 */
public interface UmsIntegrationChangeHistoryService extends IService<UmsIntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

