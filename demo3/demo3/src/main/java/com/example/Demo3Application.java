package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.autowired.ShapeTools;
import com.example.dao.TestDao;

@SpringBootApplication
public class Demo3Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}
	
	@Autowired
	private TestDao dao;
	
	@Autowired
	private ApplicationContext ac;
	
	@Bean
	public String message(){
		return "hello";
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		dao.findGoods();
		
		String msg = ac.getBean("message",String.class);
		
		System.out.println(msg);
		
		ShapeTools st = ac.getBean(ShapeTools.class);
		st.drawShape();
		
	}
}
