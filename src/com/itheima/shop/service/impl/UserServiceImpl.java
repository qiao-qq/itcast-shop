package com.itheima.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.shop.mapper.UserMapper;
import com.itheima.shop.pojo.User;
import com.itheima.shop.pojo.UserExample;
import com.itheima.shop.pojo.UserExample.Criteria;
import com.itheima.shop.service.UserService;

//用户管理模块
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	// 注册
	@Override
	public void register(User user) {
		userMapper.insertSelective(user);

	}

	// 登录
	@Override
	public User login(User user) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andPasswordEqualTo(user.getPassword());
		criteria.andUsernameEqualTo(user.getUsername());
		List<User> list = userMapper.selectByExample(example);
		return list.get(0);

	}

}
