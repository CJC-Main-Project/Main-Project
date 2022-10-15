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

import com.cjc.homeloanmanagement.app.model.LoanDisbursement;
import com.cjc.homeloanmanagement.app.serviceI.LoanDisbursementServiceI;

@CrossOrigin("*")
@RestController
public class LoanDisbursementController {

	@Autowired
    LoanDisbursementServiceI lds;
	
	@PostMapping("/saveLoan")
	public String saleLoan(@RequestBody LoanDisbursement ld)
	{
		lds.saveLoan(ld);
		return "Loan Disburse successfully...!";
	}
	
	@GetMapping("/getLoan")
	public  List<LoanDisbursement> getLoan()
	{
		List<LoanDisbursement> list= lds.getLoan();
		return list;
	}
	
	@PutMapping("/updateLoan/{agreementId}")
	public String updateLoan(@RequestBody LoanDisbursement ld)
	{
		lds.saveLoan(ld);
		return "Loan Disburse update successfully...!";
	}
	@DeleteMapping("/deleteLoan/{agreementId}")
	public String deleteLoan(@PathVariable Integer agreementId)
	{
		lds.deleteLoan(agreementId);
		return "Delete Succesfully...!";
	}
}
