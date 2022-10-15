package com.cjc.homeloanmanagement.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.homeloanmanagement.app.model.CustomerAddress;
import com.cjc.homeloanmanagement.app.repositoryI.CustomerAddressRepositoryI;
import com.cjc.homeloanmanagement.app.serviceI.CustomerAddressServiceI;

@Service
public class CustomerAddressServiceImpl implements CustomerAddressServiceI
{
 @Autowired
 CustomerAddressRepositoryI car;

@Override
public void save(CustomerAddress ca) {
	// TODO Auto-generated method stub
	
}

@Override
public List<CustomerAddress> getCustomerAddress() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void deleteCustomerAddress(Integer customerId) {
	// TODO Auto-generated method stub
	
}
	
}
