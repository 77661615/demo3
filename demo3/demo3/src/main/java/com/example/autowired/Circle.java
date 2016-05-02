package com.example.autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * 圆形
 * @author HuangGL
 *
 */
@Component(value="circle")
@Primary
public class Circle implements Shape {

	@Override
	public void draw() {
		// 
		System.out.println("draw cycle...");

	}
	
	
	@PostConstruct
	public void init(){
		
		System.out.println("@PostConstruct init ... ");
	}
	
	@PreDestroy
	public void destroy(){
		
		System.out.println("@PreDestroy detroy ... ");
	}

}
