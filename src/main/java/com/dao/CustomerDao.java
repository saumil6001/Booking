package com.dao;

import java.util.List;

import com.entity.Customer;

public interface CustomerDao {

	
	public List<Customer> getCustomers();

	
	void addCustomer(Customer Customer);


	public Customer getCustomer(int id);
	
	
	
}
