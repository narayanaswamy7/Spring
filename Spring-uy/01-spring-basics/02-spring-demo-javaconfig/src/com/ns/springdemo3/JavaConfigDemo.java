package com.ns.springdemo3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo {

	public static void main(String[] args) {

		// read spring configuration java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from the container
		Coach theCoach = context.getBean("tennisCoach", Coach.class); // tennisCoach (classname with camel case) is the
																		// default bean id, it works without
																		// explicitly mentioning when there is only one
																		// component;

		// call the method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();
	}

}
