package com.qf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qf.pojo.TbUser;
import com.qf.service.IUserService;

@RestController
public class UserController {
	
	@Autowired
	private IUserService userService;

	@GetMapping("/Users")
	public List<TbUser> getAllUsers(){
		return userService.getAllUsers();
	}

	@GetMapping("/Users/{id}")
	public TbUser getUserById(@PathVariable("id") long id){
		return userService.getUserById(id);
	}

	@PostMapping("/addUsers")
	public boolean addUser(TbUser us){
		return userService.addUser(us);
	}
}
