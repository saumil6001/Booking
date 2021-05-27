package com.service;

import java.util.List;

import com.entity.Customer;

public interface CustomerService  {

	
	
	public List<Customer> getCustomers();

	void addCustomer(Customer customer);
	
	Customer getCustomer(int id);
	

	
}
