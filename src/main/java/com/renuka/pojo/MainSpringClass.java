package com.renuka.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringClass {

	public static void main(String[] args) {
		
		
		 ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		 System.out.println(context);
		 Student std=(Student) context.getBean("std");
		 System.out.println(std);

	}

}
