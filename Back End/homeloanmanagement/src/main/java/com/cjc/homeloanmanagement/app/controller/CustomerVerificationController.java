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

import com.cjc.homeloanmanagement.app.model.CustomerVerification;

import com.cjc.homeloanmanagement.app.serviceI.CustomerVerificationServiceI;

@RestController
@CrossOrigin("*")
public class CustomerVerificationController 
{
     @Autowired
     CustomerVerificationServiceI cvs;
     
     @PostMapping("/saveCustomerVerification")
     public String saveCustomerVerification(@RequestBody CustomerVerification cv )
     {
     	cvs.save(cv);
     	
     	return "Details saved Successfully";
     }
     @GetMapping("/getCustomerVerification")
     public List<CustomerVerification> getCustomerVerification()
     {
     	List<CustomerVerification>list=cvs.getCustomerVerification();
     	
     	return list;
     }

     @PutMapping("/updateCustomerVerification/{verificationID}")
     public String updateCustomerVerification(@RequestBody CustomerVerification cv)
     {
     	         cvs.save(cv);
     	         
     	   return "Details updated suceesfully";
     }

     @DeleteMapping("/deleteCustomerVerification/{verificationID}")
     public String deleteCustomerVerification(@PathVariable Integer verificationID )
     {
     	cvs.deleteCustomerVerification(verificationID);
     	
     	return "details deleted successfully";
     }





}
