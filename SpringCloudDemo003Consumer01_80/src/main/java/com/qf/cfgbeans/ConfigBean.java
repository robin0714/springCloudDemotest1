package com.qf.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
		//boot	--> spring applicationContext.xml
		//		-->	@Configuration ConfigBean
		//		--> applicationContext.xml

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}
