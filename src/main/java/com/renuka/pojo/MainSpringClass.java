package com.renuka.pojo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainSpringClass {

	public static void main(String[] args) {
		
		
//		 ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//		 System.out.println(context);
//		 
//		 Student std=(Student) context.getBean("std");
//		 System.out.println(std);
//		 
//		Address addresss=(Address) context.getBean("address1");
//		System.out.println(addresss);
		
		Resource resource=new ClassPathResource("spring.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		Student stdentbean=(Student) beanFactory.getBean("std");
		System.out.println(stdentbean);
		Address addressbean=(Address) beanFactory.getBean("address1");
		System.out.println(addressbean);
		

		
	}

}
