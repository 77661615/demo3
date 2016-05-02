package com.example.autowired;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * 正方形
 * 
 * @author Administrator
 *
 */
@Component(value="square")
//@Primary
public class Square implements Shape {

	@Override
	public void draw() {
		// 
		System.out.println("draw Square...");

	}

}
