package com.am.showcase.bean.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.am.showcase.bean.annotation")
public class ApplicationContextConfig {

	@Bean
	public String message(){
		return "hello message!";
	}
	
}
