package de.reply.rvl.SpringCourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		//Read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//Get bean from the container
		Coach theCoach = context.getBean("swimCoach",Coach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call daily fortune
		System.out.println(theCoach.getDailyFortune());

		//close the context
		context.close();
	}

}
 
