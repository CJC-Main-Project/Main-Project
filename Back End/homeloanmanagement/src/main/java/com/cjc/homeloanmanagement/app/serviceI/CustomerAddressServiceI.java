package com.cjc.homeloanmanagement.app.serviceI;

import java.util.List;

import com.cjc.homeloanmanagement.app.model.CustomerAddress;

public interface CustomerAddressServiceI {

	void save(CustomerAddress ca);

	List<CustomerAddress> getCustomerAddress();

	void deleteCustomerAddress(Integer customerId);

}
