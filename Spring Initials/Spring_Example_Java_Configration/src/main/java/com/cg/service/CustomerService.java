package com.cg.service;

import java.util.List;

import com.cg.beans.Customer;
import com.cg.dao.CustomerRepository;

public class CustomerService {

	CustomerRepository customerRepository;
	
	public CustomerService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerService(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public CustomerRepository getCustomerRepository() {
		return customerRepository;
	}

	public List<Customer> findAll(){
		
		return customerRepository.findAll();
	}
}
