package com.itheima.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.itheima.shop.domain.BaseResult;
import com.itheima.shop.domain.DataTableResult;
import com.itheima.shop.domain.ProductInfo;
import com.itheima.shop.pojo.Product;
import com.itheima.shop.service.ProductService;

//商品分类管理Controller
@RestController
@RequestMapping("/prod")
public class ProductController {

	@Autowired
	private ProductService productService;

	// 查询所有商品
	@RequestMapping("/findAllProd")
	public DataTableResult findAllProd() {
		DataTableResult dt = new DataTableResult();
		List<Product> findAllProd = productService.findAllProd();
		dt.setData(findAllProd);
		return dt;

	}

	// 新增商品
	@RequestMapping("/addProd")
	public BaseResult addProductInfo(@RequestBody ProductInfo prodInfo) {
		try {
			productService.addProdInfo(prodInfo);
			return new BaseResult("添加商品成功", true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new BaseResult("添加商品失败", false);
		}

	}

	// 查询商品
	@RequestMapping("/search")
	public List<Product> search(@RequestBody String productName) {
		productName = (String) JSONObject.parseObject(productName).getString("productName");
		List<Product> list = productService.findByProdName(productName);
		return list;
	}
	
	// 根据商品id获取信息
		@RequestMapping("/productById")
		public Product productById(Long id) {
			Product product = productService.findProductById(id);
			return product;
		}

}
