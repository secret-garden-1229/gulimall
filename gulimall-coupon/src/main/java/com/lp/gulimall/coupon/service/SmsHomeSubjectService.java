package com.lp.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.lp.gulimall.coupon.entity.SmsHomeSubjectEntity;
import com.lp.gulimall.utils.PageUtils;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-11-06 20:19:31
 */
public interface SmsHomeSubjectService extends IService<SmsHomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

