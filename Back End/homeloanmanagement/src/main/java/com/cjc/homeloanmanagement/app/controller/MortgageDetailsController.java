package com.cjc.homeloanmanagement.app.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.homeloanmanagement.app.model.MortgageDetails;
import com.cjc.homeloanmanagement.app.serviceI.MortgageDetailsServiceI;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin("*")
@RestController
public class MortgageDetailsController {

	@Autowired
	MortgageDetailsServiceI mds;
	
	@PostMapping(value = "/saveMortgage",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String saveMortgageDetails(@RequestPart (value = "mortgagePropertyProof") MultipartFile mortgagePropertyProof,@RequestPart (value = "mortgagePropertyInsurance") MultipartFile mortgagePropertyInsurance,
			           @RequestPart (value = "information") String information) throws IOException
	{
		ObjectMapper om=new ObjectMapper();
		MortgageDetails md=om.readValue(information, MortgageDetails.class);
		
		MortgageDetails mortgage=new MortgageDetails();
		mortgage.setMortgageLoanOnProperty(md.getMortgageLoanOnProperty());
		mortgage.setMortgagePropertyType(md.getMortgagePropertyType());
		mortgage.setMortgagePropertyValue(md.getMortgagePropertyValue());
		mortgage.setMortgagePropertyInsurance(mortgagePropertyInsurance.getBytes());
		mortgage.setMortgagePropertyProof(mortgagePropertyProof.getBytes());
		
		mds.saveMortgageDetails(mortgage);
		return "Save Successfully...";
	}
	
	@GetMapping("getMortgage")
	public List<MortgageDetails> getMortgageDetails()
	{
		List<MortgageDetails> list= mds.getMortgageDetails();
		return list;
	}
	
	@PutMapping(value = "/updateMortgage/{mortgageId}",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String updateMortgageDetails(@RequestPart (value = "mortgagePropertyProof") MultipartFile mortgagePropertyProof,@RequestPart (value = "mortgagePropertyInsurance") MultipartFile mortgagePropertyInsurance,
			           @RequestPart (value = "information") String information) throws IOException
	{
		ObjectMapper om=new ObjectMapper();
		MortgageDetails md=om.readValue(information, MortgageDetails.class);
		
		MortgageDetails mortgage=new MortgageDetails();
		mortgage.setMortgageId(md.getMortgageId());
		mortgage.setMortgageLoanOnProperty(md.getMortgageLoanOnProperty());
		mortgage.setMortgagePropertyType(md.getMortgagePropertyType());
		mortgage.setMortgagePropertyValue(md.getMortgagePropertyValue());
		mortgage.setMortgagePropertyInsurance(mortgagePropertyInsurance.getBytes());
		mortgage.setMortgagePropertyProof(mortgagePropertyProof.getBytes());
		
		mds.saveMortgageDetails(mortgage);
		return "Update Successfully...";
	}
	
	@DeleteMapping("/deleteMortgage/{mortgageId}")
	public String deleteMortgageDetails(@PathVariable Integer mortgageId)
	{
		mds.deleteMortgageDetails(mortgageId);
		return "deleted successfully...";
	}
}
