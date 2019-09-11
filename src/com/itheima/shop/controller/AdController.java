package com.itheima.shop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itheima.shop.domain.DataTableResult;
import com.itheima.shop.domain.ZtreeResult;
import com.itheima.shop.pojo.AdCategory;
import com.itheima.shop.pojo.AdContent;
import com.itheima.shop.service.AdService;

//广告管理controller

@RestController
@RequestMapping("ad")
public class AdController {

	@Autowired
	private AdService adService;

	@Value("${HOME_SLIDER_CATID}") // 固定写法 必须与配置文件保持一致
	private Long HOME_SLIDER_CATID;

	@Value("${TODAY_PROM_CATID}")
	private Long TODAY_PROM_CATID;

	// 查询所有广告分类，返回zTree所需数据类型
	@RequestMapping("/findAllAdCat")
	public List<ZtreeResult> findAllCategory() {

		List<ZtreeResult> zrList = new ArrayList<>();
		List<AdCategory> adCategoryList = adService.findAllAdCategory();
		zrList = convertToZtreeResult(zrList, adCategoryList);
		return zrList;
	}

	// 查询所有广告分类，返回datatable所需数据类型
	@RequestMapping("/findAllAdCatDT")
	public DataTableResult findAllAdCatDT() {
		DataTableResult dt = new DataTableResult();
		List<AdCategory> adCategoryList = adService.findAllAdCategory();
		dt.setData(adCategoryList);
		return dt;
	}

	// 查询所有广告内容
	@RequestMapping("/findAllAdContent")
	public DataTableResult findAllContent() {
		DataTableResult dt = new DataTableResult();
		List<AdContent> adContentList = adService.findAllAdContent();
		dt.setData(adContentList);
		return dt;
	}

	// 查询所有广告内容
	@RequestMapping("/findAdsById")
	public DataTableResult findAllAdContentById(Long id) {
		DataTableResult dt = new DataTableResult();
		List<AdContent> adContentList = adService.findAllAdContent(id);
		dt.setData(adContentList);
		return dt;
	}

	// 首页轮播
	@RequestMapping("/homeSlider")
	public List<AdContent> homeSlider() {
		List<AdContent> list = adService.findAllAdContent(HOME_SLIDER_CATID);
		return list;

	}

	// 今日推荐
	@RequestMapping("/todayProm")
	public List<AdContent> todayProm() {
		List<AdContent> list = adService.findAllAdContent(TODAY_PROM_CATID);
		return list;

	}

	// 格式转换方法
	private List<ZtreeResult> convertToZtreeResult(List<ZtreeResult> zrList, List<AdCategory> adCategoryList) {

		for (AdCategory adCat : adCategoryList) {
			ZtreeResult zr = new ZtreeResult();
			zr.setId(adCat.getId());
			zr.setpId(adCat.getParentId());
			zr.setName(adCat.getName());
			if (Long.valueOf("0").equals(adCat.getParentId()) && adCat.getIsParent()) {
				zr.setOpen(true);
			}
			zrList.add(zr);

		}
		return zrList;

	}

}
