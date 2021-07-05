package com.ns.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the bean from the spring container
		CricketCoach theCoach = context.getBean("myCricketCoach" ,CricketCoach.class);
		
		// call the method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call out new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		//call new methods to get the literal values
		System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeam());
		
		// close the context
		context.close();
	}
	
}
