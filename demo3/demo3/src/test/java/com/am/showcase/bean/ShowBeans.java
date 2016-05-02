/**
 * 
 */
package com.am.showcase.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 *
 */
public class ShowBeans {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("showcase-beans.xml");
		
		Product product = ac.getBean("xiaomi5",Product.class);
		
		System.out.println(product);

	}

}
