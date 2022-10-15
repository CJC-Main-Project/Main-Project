package com.cjc.homeloanmanagement.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.homeloanmanagement.app.model.Customer;
import com.cjc.homeloanmanagement.app.repositoryI.CustomerRepositoryI;
import com.cjc.homeloanmanagement.app.serviceI.CustomerServiceI;

@Service
public class CustomerServiceImpl implements CustomerServiceI {

	@Autowired
	CustomerRepositoryI cr;

	@Override
	public void savaCustomer(Customer c) {
		cr.save(c);
		
	}

	@Override
	public List<Customer> getCustomer() {
		
		return cr.findAll();
	}

	@Override
	public void deleteCustomer(Integer customerId) {
		cr.deleteById(customerId);
		
		
	}
}
