package com.lp.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lp.gulimall.utils.PageUtils;
import com.lp.gulimall.member.entity.UmsGrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-11-06 20:24:06
 */
public interface UmsGrowthChangeHistoryService extends IService<UmsGrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

