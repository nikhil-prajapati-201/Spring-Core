package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;

public class Main {

	

	public static void main(String args[]) {
		
		//After this spring container can start
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/configuration/ApplicationContext.xml");
		
		//creation of Object it is responsibility of spring 
		Student std1 = (Student) context.getBean("stdId1");
		std1.show();
		
		System.out.println("-----------------------");
		Student std2 = (Student) context.getBean("stdId2");
		std2.show();
	}
}
