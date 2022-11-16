package com.lp.gulimall.product.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


/**
 * 品牌
 * 
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-11-06 20:28:02
 */
@Data
@TableName("pms_brand")
public class PmsBrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@TableId
	private Long brandId;
	/**
	 * 品牌名
	 * 不能为空
	 */
	@NotEmpty
	private String name;
	/**
	 * 品牌logo地址
	 */
	@URL(message = "必须是一个合法地址")
	private String logo;
	/**
	 * 介绍
	 */
	@NotNull
	private String descript;
	/**
	 * 显示状态[0-不显示；1-显示]
	 */
	@TableLogic
	private Integer showStatus;
	/**
	 * 检索首字母
	 */
	@Pattern(regexp = "/^[a-zA-Z]$/",message = "检索首字母必须式一个字母")
	private String firstLetter;
	/**
	 * 排序
	 */
	@Min(value = 0,message = "排序必须大于0")
	private Integer sort;

}
