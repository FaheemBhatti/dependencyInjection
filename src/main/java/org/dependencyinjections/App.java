package org.dependencyinjections;

import org.dependencyinjections.interfaces.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car mySecondCar = context.getBean("swift",Car.class);
		System.out.println(mySecondCar.spcs());
		
		Car mycar = context.getBean("corolla",Car.class);
		System.out.println(mycar.spcs());
		
		context.close();
	}
}