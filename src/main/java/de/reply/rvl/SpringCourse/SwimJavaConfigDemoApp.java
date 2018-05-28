package de.reply.rvl.SpringCourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		//Read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//Get bean from the container
		SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println("email: "+theCoach.getEmail());
		System.out.println("team: "+theCoach.getTeam());

		//close the context
		context.close();
	}

}
 
