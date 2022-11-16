package com.lp.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lp.gulimall.utils.PageUtils;
import com.lp.gulimall.utils.Query;

import com.lp.gulimall.product.dao.PmsBrandDao;
import com.lp.gulimall.product.entity.PmsBrandEntity;
import com.lp.gulimall.product.service.PmsBrandService;

import javax.annotation.Resource;


@Service("pmsBrandService")
public class PmsBrandServiceImpl extends ServiceImpl<PmsBrandDao, PmsBrandEntity> implements PmsBrandService {

    @Resource
    PmsBrandDao pmsBrandDao ;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsBrandEntity> page = this.page(
                new Query<PmsBrandEntity>().getPage(params),
                new QueryWrapper<PmsBrandEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public void removeBrandByIds(List<Long> asList) {
        baseMapper.deleteBatchIds(asList);
    }



    @Override
    public void updateBrandByIds(PmsBrandEntity pmsBrand) {
        pmsBrandDao.updateBrandByIds(pmsBrand);
    }

}