package com.cg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cg.dao.CustomerRepository;
import com.cg.service.CustomerService;

@Configuration
public class AppConfig {

	@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new CustomerRepository();
	}
	
	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		CustomerService customerService = new CustomerService(getCustomerRepository());//or can use setter here for repository
		return customerService;
	}
}
