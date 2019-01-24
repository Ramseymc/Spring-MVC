package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create the object
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// use the object
		System.out.println(theCoach.getdailyWorkout());	

	}

}
