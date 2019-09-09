package com.cg.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.service.CustomerService;

public class Main {

	public static void main(String[] args) {

		//By using Spring BeanFactory Container
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring Bean Configration.xml");
		
		//By using 	Spring ApplicationContext Container
		//BeanFactory context = new XmlBeanFactory(new ClassPathResource("Spring Bean Configration.xml"));

		// Bean define by constructor using index
		Customer c = (Customer) context.getBean("cust");
		System.out.println(c.getFirstName() + " " + c.getLastName());
				
		// Bean define by constructor using index
		Customer c1 = (Customer) context.getBean("cust1");
		System.out.println(c1.getFirstName() + " " + c1.getLastName());

		// Bean define by constructor using type
		Customer c2 = (Customer) context.getBean("cust2");
		System.out.println(c2.getFirstName() + " " + c2.getLastName());

		// Bean define by setter
		Customer c3 = (Customer) context.getBean("cust3");
		System.out.println(c3.getFirstName() + " " + c3.getLastName());

		Employee employee = (Employee) context.getBean("employee");
		employee.display();
		System.out.println(employee.getPerson().getName());
		
		CustomerService customerService = context.getBean("customerService", CustomerService.class);
		System.out.println(customerService.findAll());
	}
}
