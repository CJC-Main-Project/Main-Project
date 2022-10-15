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

import com.cjc.homeloanmanagement.app.model.GuarantorDetails;
import com.cjc.homeloanmanagement.app.serviceI.GuarantorDetailsServiceI;

@CrossOrigin("*")
@RestController
public class GuarantorDetailsController {
	
	@Autowired
	GuarantorDetailsServiceI gds;
	
	@PostMapping("/saveGuarantorDetails")
	public String saveGuarantorDetails(@RequestBody GuarantorDetails gd)
	{
		gds.saveGuarantorDetails(gd);
		return "Guarantor Details save Succesfully...!";
	}
	
	@GetMapping("/getGuarantorDetails")
	public List<GuarantorDetails> getGuarantorDetails()
	{
		List<GuarantorDetails> list=gds.getGuarantorDetails();
		return list;
	}
	
	@PutMapping("/updateGuarantorDetails/{guarantorId}")
	public String updateGuarantorDetails(@RequestBody GuarantorDetails gd)
	{
		gds.saveGuarantorDetails(gd);
		
		return "Guarantor Details Updated Succesfully...!";
		
	}
	@DeleteMapping("/deleteGuarantorDetails/{guarantorId}")
	public String deleteGuarantorDetails(@PathVariable Integer guarantorId)
	{
		gds.deleteGuarantorDetails(guarantorId);
		return "Delete Succesfully...!";
		
	}
}

	
