package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CustomerDao;
import com.entity.Customer;



@Service
public class CustomerServiceImp implements CustomerService {


	@Autowired
	private CustomerDao customerDao;
	
	
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
	
		List<Customer> customers=customerDao.getCustomers() ;
 		
		return customers;
	}
	
	
	@Override
	@Transactional
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}


	
	@Override
	@Transactional
	public Customer getCustomer(int id) {
		
		return customerDao.getCustomer(id);
	}
	

}
