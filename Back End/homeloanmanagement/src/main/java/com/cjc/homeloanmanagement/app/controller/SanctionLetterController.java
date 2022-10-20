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
import com.cjc.homeloanmanagement.app.model.SanctionLetter;
import com.cjc.homeloanmanagement.app.serviceI.SanctionLetterServiceI;

@CrossOrigin("*")
@RestController
public class SanctionLetterController 
{
	@Autowired
	SanctionLetterServiceI sls;
	
	@PostMapping("/saveSanctionLetter")
	public String saveSanctionLetter(@RequestBody SanctionLetter sl)
	{
		sls.saveSanctionLetter(sl);
		return"Sanction Letter save succesfully...!";
	}
	

	@GetMapping("/getSanctionLetter")
	public List<SanctionLetter> getSanctionLetter()
	{
		List<SanctionLetter> list=sls.getSanctionLetter();
		return list;
	}
	
	@PutMapping("/updateSanctionLetter/{sanctionId}")
	public String updateSanctionLetter(@RequestBody SanctionLetter sl)
	{
		sls.saveSanctionLetter(sl);
		
		return "SanctionLetter Details Updated Succesfully...!";
		
	}
	@DeleteMapping("/deleteSanctionLetter/{sanctionId}")
	public String deleteSanctionLetter(@PathVariable Integer sanctionId)
	{
		sls.deleteSanctionLetter(sanctionId);
		return "Delete Succesfully...!";
		
	}
	
	@GetMapping("/getSanction/{sanctionId}")
	public  SanctionLetter getById(@PathVariable Integer sanctionId) {
		SanctionLetter s=sls.getById(sanctionId);
		System.out.println("ID :"+s.getSanctionId());
		return s;
	}
	
}


