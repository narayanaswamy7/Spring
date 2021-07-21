package com.ns.springdemo3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemo {

	public static void main(String[] args) {

		// read spring configuration java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from the container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call the method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// call our swim coach methods ... has the props value injected
		System.out.println("email: "+theCoach.getEmail());
		System.out.println("name: "+theCoach.getName());

		// close the context
		context.close();
	}

}
