package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.Customer;

@Repository
public class CustomerDaoImp implements CustomerDao{

	
	@Autowired
	private SessionFactory sessionFactory;

	
	@Override
	public List<Customer> getCustomers() {

		Session session=sessionFactory.getCurrentSession();
		
		Query<Customer> query= session.createQuery("from Customer",  Customer.class);
	
		List<Customer> customer= query.getResultList();
				
		return customer;
	}
	
	@Override
	public void addCustomer(Customer customer) {

		Session session=sessionFactory.getCurrentSession();
			
		session.saveOrUpdate(customer);
		
	}

	@Override
	public Customer getCustomer(int id) {
		
		Session session=sessionFactory.getCurrentSession();
		
		   Customer custromer = session.get(Customer.class,id);
		
		return custromer;
	}
	

	
	
	
	
	
	
	
	
}
