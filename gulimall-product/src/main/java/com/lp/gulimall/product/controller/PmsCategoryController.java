package com.lp.gulimall.product.controller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lp.gulimall.product.entity.PmsCategoryEntity;
import com.lp.gulimall.product.service.PmsCategoryService;
import com.lp.gulimall.utils.PageUtils;
import com.lp.gulimall.utils.R;



/**
 * 商品三级分类
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-11-06 20:28:02
 */
@RestController
@RequestMapping("product/pmscategory")
public class PmsCategoryController {
    @Autowired
    private PmsCategoryService pmsCategoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:pmscategory:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsCategoryService.queryPage(params);

        return R.ok().put("page", page);
    }

    @RequestMapping("/list/cascade")
    //@RequiresPermissions("product:pmscategory:list")
    public R Cascade(@RequestParam Map<String, Object> params){
        List<PmsCategoryEntity> page = pmsCategoryService.cascadeTree(params);

        return R.ok().put("data", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    //@RequiresPermissions("product:pmscategory:info")
    public R info(@PathVariable("catId") Long catId){
		PmsCategoryEntity pmsCategory = pmsCategoryService.getById(catId);

        return R.ok().put("pmsCategory", pmsCategory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:pmscategory:save")
    public R save(@RequestBody PmsCategoryEntity pmsCategory){
        System.out.println("========"+pmsCategory);
		pmsCategoryService.save(pmsCategory);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:pmscategory:update")
    public R update(@RequestBody PmsCategoryEntity pmsCategory){
		pmsCategoryService.updateById(pmsCategory);

        return R.ok();
    }

    @RequestMapping("/update/category")
    //@RequiresPermissions("product:pmscategory:update")
    public R updateCategory(@RequestBody PmsCategoryEntity[] pmsCategory){
        pmsCategoryService.updateBatchById(Arrays.asList(pmsCategory));
        System.out.println("pmsCategory===="+pmsCategory+"size====="+pmsCategory.length);
        Arrays.asList(pmsCategory).forEach(System.out::println);
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:pmscategory:delete")
    public R delete(@RequestBody Long[] catIds){
		//pmsCategoryService.removeByIds(Arrays.asList(catIds));
        List<Long> longs = Arrays.asList(catIds);
        pmsCategoryService.removeCategoryById(longs);
        return R.ok();
    }

}
