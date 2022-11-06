package com.lp.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lp.gulimall.utils.PageUtils;
import com.lp.gulimall.member.entity.UmsMemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-11-06 20:24:07
 */
public interface UmsMemberCollectSpuService extends IService<UmsMemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

