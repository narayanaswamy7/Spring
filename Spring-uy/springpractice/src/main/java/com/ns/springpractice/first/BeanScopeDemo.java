package com.ns.springpractice.first;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		
		// load the spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
		
		// retrieve the bean from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		System.out.println(theCoach);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		System.out.println(alphaCoach);
	}
	
}
