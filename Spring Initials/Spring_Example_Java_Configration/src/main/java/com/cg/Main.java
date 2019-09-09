package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.service.CustomerService;

public class Main {

	public static void main(String[] args) {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CustomerService customerService = appContext.getBean("customerService", CustomerService.class);
		
		System.out.println(customerService.findAll());
		
		CustomerService customerService1 = appContext.getBean("customerService", CustomerService.class);
		
		System.out.println(customerService.getCustomerRepository());
		
		CustomerService customerService2 = appContext.getBean("customerService", CustomerService.class);
		
		System.out.println(customerService.getCustomerRepository());
	}
}
