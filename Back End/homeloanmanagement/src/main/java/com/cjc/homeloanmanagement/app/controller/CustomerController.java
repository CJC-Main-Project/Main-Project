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

import com.cjc.homeloanmanagement.app.model.Customer;
import com.cjc.homeloanmanagement.app.serviceI.CustomerServiceI;

@CrossOrigin("*")
@RestController
public class CustomerController {

	@Autowired
	CustomerServiceI cs;
	
	@PostMapping("/saveCustomer")
	public String savaCustomer(@RequestBody Customer c)
	{
		cs.savaCustomer(c);
		return "Customer Save Successfully...";
	}
	
	@GetMapping("/getCustomer")
	public List<Customer> getCustomer()
	{
		 List<Customer> list= cs.getCustomer();
		return list;
	}
	
	@PutMapping("/updateCustomer/{customerId}")
	public String updateCustomer(@RequestBody Customer c)
	{
		cs.savaCustomer(c);
		return "updated Successfully...";
	}
	
	@DeleteMapping("/deleteCustomer/{customerId}")
	public String deleteCustomer(@PathVariable Integer customerId )
	{
		cs.deleteCustomer(customerId);
		return "Deleted  Successfully...";
	}
}
