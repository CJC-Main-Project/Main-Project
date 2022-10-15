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

import com.cjc.homeloanmanagement.app.model.PropertyAddress;

import com.cjc.homeloanmanagement.app.serviceI.PropertyAddressServiceI;

@CrossOrigin("*")
@RestController


public class PropertyAddressController 
{

	@Autowired
	PropertyAddressServiceI pas;
		

@PostMapping("/savePropertyAddress")
public String savePropertyAddress(@RequestBody PropertyAddress pa) 
{
	pas.save(pa);
	
	return "Property Address saved Sucessfully";
	
}

@GetMapping("/getPropertyAddress")
public List<PropertyAddress> getPropertyAddress()
{
	List<PropertyAddress>list=pas.getPropertyAddress();
	
	return list;
}

@PutMapping("/updatePropertyAddress/{propertyId}")
public String updatePropertyAddress(@RequestBody PropertyAddress pa )
{
	pas.save(pa);
	return "Property Address Updated Sucessfully.....!";
}

@DeleteMapping("/deletePropertyAddress/{propertyId}")
public String deleteCustomerAddress(@PathVariable Integer propertyId )
{
	pas.deletePropertyAddress(propertyId);
	
	return "Property Address Delete Sucessfully.....!";
}
}
