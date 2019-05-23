package com.qf.controller;

import java.util.List;

import com.qf.pojo.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.qf.pojo.TbUser;

@RestController
public class UserController {
	
	private static final String REST_URL_PREFIX = "http://localhost:8001";


	/**
	 * 使用RestTemplate使得我们访问restful接口变得非常简单
	 * 	getForObject(String url, Class<T> responseType, Object... uriVariables)包含三个参数
	 * 		url代表请求地址
	 * 		responseType代表响应参数类型
	 * 		uriVariables url中的参数
	 */
	
	@Autowired
	private RestTemplate restTemp;

	@SuppressWarnings("unchecked")
	@GetMapping("/consumer/Users")
	public List<TbUser> getAllUsers(){
		return restTemp.getForObject(REST_URL_PREFIX + "/Users", List.class);
	}

	@GetMapping("/consumer/Users/{id}")
	public TbUser getUserById(@PathVariable("id") long id){
		return restTemp.getForObject(REST_URL_PREFIX +"Users/"+id,TbUser.class);
	}
}
