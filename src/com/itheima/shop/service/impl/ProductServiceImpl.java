package com.itheima.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.shop.domain.ProductInfo;
import com.itheima.shop.mapper.ProductDescMapper;
import com.itheima.shop.mapper.ProductMapper;
import com.itheima.shop.pojo.Product;
import com.itheima.shop.pojo.ProductExample;
import com.itheima.shop.pojo.ProductExample.Criteria;
import com.itheima.shop.service.ProductService;

//商品管理实现类
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;

	@Autowired
	private ProductDescMapper productDescMapper;

	// 查询所有商品
	@Override
	public List<Product> findAllProd() {
		ProductExample example = new ProductExample();
		List<Product> list = productMapper.selectByExample(example);
		return list;
	}

	// 添加商品
	@Override
	public void addProdInfo(ProductInfo prodInfo) {
		// 1.往商品基础表中添加数据product
		productMapper.insertSelective(prodInfo.getProduct());
		Long productId = prodInfo.getProduct().getProductId();
		// 2.往商品描述表中添加数据product_desc
		prodInfo.getProductDesc().setProductId(productId);
		productDescMapper.insert(prodInfo.getProductDesc());
	}

	// 模糊查询
	@Override
	public List<Product> findByProdName(String productName) {
		ProductExample example = new ProductExample();
		Criteria criteria = example.createCriteria();
		criteria.andProductNameLike("%" + productName + "%");
		PageHelper.startPage(1, 12);
		Page<Product> page=(Page<Product>) productMapper.selectByExample(example);
		List<Product> list = page.getResult();
		return list;
	}

	// 根据商品id获取信息
	@Override
	public Product findProductById(Long id) {
		Product product = productMapper.selectByPrimaryKey(id);
		return product;
	}

}
