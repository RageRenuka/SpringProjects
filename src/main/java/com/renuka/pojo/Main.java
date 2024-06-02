package com.renuka.pojo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractRefreshableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
////	      
////       Address address = (Address) context.getBean("address");
////        System.out.println(address);
//		Employee employee = new Employee();
		Address address = (Address) context.getBean("address");
	System.out.println(address);
		

		BeanFactory beanFactory = ((AbstractRefreshableApplicationContext) context).getBeanFactory();
		String[] str = beanFactory.getAliases("emp1");
		for (String alias : str)
			System.out.println(alias);
		
		
		
	}

}
