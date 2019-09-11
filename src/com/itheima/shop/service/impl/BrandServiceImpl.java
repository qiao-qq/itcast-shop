package com.itheima.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.shop.mapper.BrandMapper;
import com.itheima.shop.pojo.Brand;
import com.itheima.shop.pojo.BrandExample;
import com.itheima.shop.service.BrandService;
//品牌管理实现类

@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private BrandMapper brandMapper;

	@Override
	public List<Brand> findAllBrand() {
		BrandExample example = new BrandExample();
		List<Brand> list = brandMapper.selectByExample(example);
		return list;
	}

}
