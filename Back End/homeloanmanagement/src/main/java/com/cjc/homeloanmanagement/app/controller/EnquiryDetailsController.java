
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

import com.cjc.homeloanmanagement.app.model.EnquiryDetails;
import com.cjc.homeloanmanagement.app.serviceI.EnquiryDetailsServiceI;

@RestController
@CrossOrigin("*")

public class EnquiryDetailsController {

@Autowired
EnquiryDetailsServiceI eds;

@PostMapping("/saveEnquiryDetails")
public String saveEnquiryDetails(@RequestBody EnquiryDetails ed )
{
	eds.save(ed);
	
	return "Details saved Successfully";
}
@GetMapping("/getEnquiryDetails")
public List<EnquiryDetails> getEnquiryDetails()
{
	List<EnquiryDetails>list=eds.getEnquiryDetails();
	
	return list;
}

@PutMapping("/updateEnquiryDetails/{enquiryId}")
public String updateEnquiryDetails(@RequestBody EnquiryDetails ed)
{
	         eds.save(ed);
	         
	   return "Details updated suceesfully";
}

@DeleteMapping("/deleteEnquiryDetails/{enquiryId}")
public String deleteEnquiryDetails(@PathVariable Integer enquiryId )
{
	eds.deleteEnquiryDetails(enquiryId);
	
	return "details deleted successfully";
}



}


