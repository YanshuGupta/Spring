package com.cg.dao;

import java.util.ArrayList;
import java.util.List;

import com.cg.beans.Customer;

public class CustomerRepository {

	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer("YANSHU", "GUPTA"));
		return customers;
	}
}
