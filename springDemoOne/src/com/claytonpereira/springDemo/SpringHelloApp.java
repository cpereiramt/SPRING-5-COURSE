package com.claytonpereira.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		// load the spring xml configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve beans from spring container
        
		// When we pass the interface "Coach.class" to the method, behind the scenes 
		// Spring will cast the object for you
		Coach theCoach = context.getBean("myCoach", Coach.class);
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		// close the context
		context.close();
	}

}
