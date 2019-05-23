package com.qf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qf.mapper.TbUserMapper;
import com.qf.pojo.TbUser;
import com.qf.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private TbUserMapper userMapper;

	@Override
	public List<TbUser> getAllUsers() {
		return userMapper.selectByExample(null);
	}

	@Override
	public TbUser getUserById(long id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public boolean addUser(TbUser user) {
		return userMapper.insertSelective(user)>0;
	}

}
