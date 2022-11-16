package com.lp.gulimall.product.controller;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lp.gulimall.product.entity.PmsBrandEntity;
import com.lp.gulimall.product.service.PmsBrandService;
import com.lp.gulimall.utils.PageUtils;
import com.lp.gulimall.utils.R;
import org.springframework.web.multipart.MultipartFile;


/**
 * 品牌
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-11-06 20:28:02
 */
@RestController
@RequestMapping("product/pmsbrand")
public class PmsBrandController {
    @Autowired
    private PmsBrandService pmsBrandService;

    @PostMapping(value = "/saveImage")
    private R saveImage( @RequestParam(value = "file",required = false) MultipartFile file) {
        String path = this.getClass().getClassLoader().getResource("").getPath().toString();
        String formatDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String filepath =path+formatDate;
        File storageFile=new File(filepath);
        if (!storageFile.exists()){
            storageFile.mkdirs();
        }
        try {
            file.transferTo(storageFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<String,Object> map=new HashMap<>();
        map.put("dir",filepath);
        return R.ok().put("data",map);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:pmsbrand:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsBrandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{brandId}")
    //@RequiresPermissions("product:pmsbrand:info")
    public R info(@PathVariable("brandId") Long brandId){
		PmsBrandEntity pmsBrand = pmsBrandService.getById(brandId);

        return R.ok().put("pmsBrand", pmsBrand);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:pmsbrand:save")
    public R save(@RequestBody PmsBrandEntity pmsBrand){
		pmsBrandService.save(pmsBrand);
        System.out.println("1");
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:pmsbrand:update")
    public R update(@RequestBody PmsBrandEntity pmsBrand){
        System.out.println(pmsBrand);
		pmsBrandService.updateBrandByIds(pmsBrand);
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:pmsbrand:delete")
    public R delete(@RequestBody Long[] brandIds){
//		pmsBrandService.removeByIds(Arrays.asList(brandIds));
        pmsBrandService.removeBrandByIds(Arrays.asList(brandIds));
        return R.ok();
    }

}
