package com.ns.springdemo2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

		// check if they are same
		boolean result = (theCoach == alphaCoach);

		// print the retults
		System.out.println("\nPointing to same object: " + result);

		System.out.println("\nMemeory location of the theCoach: " + theCoach);

		System.out.println("\nMemory location of the alphaCoach: " + alphaCoach);

	}

}
