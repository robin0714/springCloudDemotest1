package com.qf.service;

import java.util.List;

import com.qf.pojo.TbUser;

public interface IUserService {

	List<TbUser> getAllUsers();

	TbUser getUserById(long id);

	boolean addUser(TbUser user);
}
