package com.lp.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lp.gulimall.utils.PageUtils;
import com.lp.gulimall.member.entity.UmsMemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-11-06 20:24:07
 */
public interface UmsMemberService extends IService<UmsMemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

