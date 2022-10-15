package com.cjc.homeloanmanagement.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.homeloanmanagement.app.model.CustomerAddress;
import com.cjc.homeloanmanagement.app.serviceI.CustomerAddressServiceI;



@CrossOrigin("*")
@RestController


public class CustomerAddressController 
{
	@Autowired
	CustomerAddressServiceI cas;
		

@PostMapping("/saveCustomerAddress")
public String saveCustomerAddress(@RequestBody CustomerAddress ca) 
{
	cas.save(ca);
	
	return "Customer Address saved Sucessfully";
	
}

@GetMapping("/getCustomerAddress")
public List<CustomerAddress> getCustomerAddress()
{
	List<CustomerAddress>list=cas.getCustomerAddress();
	
	return list;
}

@PutMapping("/updateCustomerAddress/{customerId}")
public String updateCustomerAddress(@RequestBody CustomerAddress ca )
{
	cas.save(ca);
	return "Customer Address Updated Sucessfully.....!";
}

@DeleteMapping("/deleteCustomerAddress/{customerId}")
public String deleteCustomerAddress(@PathVariable Integer customerId )
{
	cas.deleteCustomerAddress(customerId);
	
	return "Customer Address Delete Sucessfully.....!";
}
}