package com.cjc.homeloanmanagement.app.serviceI;

import java.util.List;

import com.cjc.homeloanmanagement.app.model.Customer;

public interface CustomerServiceI {

	void savaCustomer(Customer c);

	List<Customer> getCustomer();

	void deleteCustomer(Integer customerId);

}
