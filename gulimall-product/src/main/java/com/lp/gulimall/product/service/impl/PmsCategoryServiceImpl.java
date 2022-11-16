package com.lp.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lp.gulimall.utils.PageUtils;
import com.lp.gulimall.utils.Query;

import com.lp.gulimall.product.dao.PmsCategoryDao;
import com.lp.gulimall.product.entity.PmsCategoryEntity;
import com.lp.gulimall.product.service.PmsCategoryService;


@Service("pmsCategoryService")
public class PmsCategoryServiceImpl extends ServiceImpl<PmsCategoryDao, PmsCategoryEntity> implements PmsCategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsCategoryEntity> page = this.page(
                new Query<PmsCategoryEntity>().getPage(params),
                new QueryWrapper<PmsCategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<PmsCategoryEntity> cascadeTree(Map<String, Object> params) {
        //查询所有商品
        List<PmsCategoryEntity> pmsCategoryEntities = baseMapper.selectList(null);
        //查询每个商品的子商品
        List<PmsCategoryEntity> list = pmsCategoryEntities.stream()
                .filter(category -> category.getParentCid() == 0)
                .map(category -> {
                    category.setList(recursion(pmsCategoryEntities,category));
                    return category;
                })
                .sorted((num1, num2) -> {
                    return (num1.getSort() == null ? 0 : num1.getSort()) - (num2.getSort() == null ? 0 : num2.getSort());
                }).collect(Collectors.toList());
        return list;
    }

    /*
    * 逻辑删除
    * */
    @Override
    public void removeCategoryById(List<Long> longs) {
        baseMapper.deleteBatchIds(longs);
    }


    //递归获取下一级商品
    private List<PmsCategoryEntity> recursion(List<PmsCategoryEntity> all,PmsCategoryEntity pmsCategory){
        List<PmsCategoryEntity> collect = all.stream()
                .filter(category -> category.getParentCid() == pmsCategory.getCatId())
                .map(category -> {
                    category.setList(recursion(all, category));
                    return category;
                }).sorted((num1, num2) -> {
                    return (num1.getSort() == null ? 0 : num1.getSort()) - (num2.getSort() == null ? 0 : num2.getSort());
                }).collect(Collectors.toList());
        return collect;
    }


}