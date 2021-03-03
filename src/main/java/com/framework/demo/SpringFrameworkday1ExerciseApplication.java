package com.framework.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFrameworkday1ExerciseApplication {

	public static void main(String[] args) {

		//BinarySearchImpl bs = new BinarySearchImpl();

		//BinarySearchImpl bs = new BinarySearchImpl(new BubbleSortAlgorithm());
		//BinarySearchImpl bs = new BinarySearchImpl(new InsertionSortAlgorithm());

		ApplicationContext applicationContext =
				SpringApplication.run(SpringFrameworkday1ExerciseApplication.class, args);
		BinarySearchImpl bs = applicationContext.getBean(BinarySearchImpl.class);

		System.out.println("Property of Bean : ");
		System.out.println("Application Name : "+applicationContext.getApplicationName());

		System.out.println("Display Name : "+applicationContext.getDisplayName());

		System.out.println("Defination Names : "+applicationContext.getBeanDefinitionNames());

		int result = bs.binarySearch(new int[] {10, 6, 2, 9}, 6);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index: " + result);

	}

}
