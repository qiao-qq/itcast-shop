package com.itheima.shop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itheima.shop.domain.ZtreeResult;
import com.itheima.shop.pojo.ProductCategory;
import com.itheima.shop.service.ProductCategoryService;

//商品分类管理Controller
@RestController
@RequestMapping("/prodCat")
public class ProductCategoryController {

	@Autowired
	private ProductCategoryService productCategoryService;

	@RequestMapping("/findAllProdCat")
	public List<ZtreeResult> findAllProdCat() {
		List<ZtreeResult> ztreeList = new ArrayList<>();
		List<ProductCategory> prodCatList = productCategoryService.findAllProdCat();
		ztreeList = convertToZtreeRseult(ztreeList, prodCatList);
		return ztreeList;

	}

	// 商品分类集合转化ZtreeList
	private List<ZtreeResult> convertToZtreeRseult(List<ZtreeResult> ztreeList, List<ProductCategory> prodCatList) {

		for (ProductCategory prc : prodCatList) {
			ZtreeResult zr = new ZtreeResult();
			zr.setId(prc.getId());
			zr.setpId(prc.getParentId());
			zr.setName(prc.getName());

			if (Long.valueOf("0").equals(prc.getParentId())) {
				zr.setOpen(true);
			}
			ztreeList.add(zr);
		}
		return ztreeList;
	}
}
