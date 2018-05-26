package de.reply.rvl.SpringCourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//Read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Get bean from the container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call daily fortune
		System.out.println(theCoach.getDailyFortune());

		//close the context
		context.close();
	}

}
 
