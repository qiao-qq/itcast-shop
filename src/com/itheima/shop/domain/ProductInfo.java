package com.itheima.shop.domain;

import com.itheima.shop.pojo.Product;
import com.itheima.shop.pojo.ProductDesc;

//商品组合实体类
public class ProductInfo {

	private Product product;
	private ProductDesc productDesc;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public ProductDesc getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(ProductDesc productDesc) {
		this.productDesc = productDesc;
	}

}
