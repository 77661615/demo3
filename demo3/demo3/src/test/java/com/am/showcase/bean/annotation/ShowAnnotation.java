package com.am.showcase.bean.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShowAnnotation {

	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
		
		String msg = ctx.getBean("message",String.class);
		
		System.out.println("msg == " + msg);
		
		Product p = ctx.getBean(Product.class);
		
		System.out.println(p == null);
		System.out.println(p.getName());
	}
}
