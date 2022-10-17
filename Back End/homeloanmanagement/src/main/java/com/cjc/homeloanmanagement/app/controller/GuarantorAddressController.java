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



import com.cjc.homeloanmanagement.app.model.GuaruntorAddress;
import com.cjc.homeloanmanagement.app.serviceI.GuarantorAddressServiceI;

@CrossOrigin("*")
@RestController


public class GuarantorAddressController
{
	@Autowired
	GuarantorAddressServiceI gas;
	
	@PostMapping("/saveGuarantorAddress")
	public String saveGuarantorAddress(@RequestBody GuaruntorAddress ga) 
	{
		gas.save(ga);
		
		return "Guarantor Address saved Sucessfully";
		
	}

	@GetMapping("/getGuarantorAddress")
	public List<GuaruntorAddress> getGuarantorAddress()
	{
		List<GuaruntorAddress>list=gas.getGuarantorAddress();
		
		return list;
	}

	@PutMapping("/updateGuarantorAddress/{guaruntorAddressId}")
	public String updateGuarantorAddress(@RequestBody GuaruntorAddress ga )
	{
		gas.save(ga);
		return "Guarantor Address Updated Sucessfully.....!";
	}

	@DeleteMapping("/deleteGuarantorAddress/{guaruntorAddressId}")
	public String deleteGuarantorAddress(@PathVariable Integer guaruntorAddressId )
	{
		gas.deleteGuarantorAddress(guaruntorAddressId);
		
		return "Guarantor Address Delete Sucessfully.....!";
	}
	
	
	
	
	
	
	
}
