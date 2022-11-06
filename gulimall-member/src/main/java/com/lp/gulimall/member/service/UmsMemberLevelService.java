package com.lp.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lp.gulimall.utils.PageUtils;
import com.lp.gulimall.member.entity.UmsMemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-11-06 20:24:07
 */
public interface UmsMemberLevelService extends IService<UmsMemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

