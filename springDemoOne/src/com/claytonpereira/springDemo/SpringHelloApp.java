package com.claytonpereira.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		// load the spring xml configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve beans from spring container

		Coach theCoach = context.getBean("myCoach", Coach.class);
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		// close the context
		
		// let's call our new method for fortunes
		System.out.print(theCoach.getDailyFortune());
		context.close();
	}

}
