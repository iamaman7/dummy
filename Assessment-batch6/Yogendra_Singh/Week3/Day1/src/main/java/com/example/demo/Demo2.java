package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo2 {

	@Autowired
	public Details2 details2;
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext( JavaContainer.class );
		Student student = (Student) applicationContext.getBean( Student.class );
		System.out.println(student);
		
		
	}

}
