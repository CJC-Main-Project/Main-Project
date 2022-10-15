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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.homeloanmanagement.app.model.BankAccountDetails;

import com.cjc.homeloanmanagement.app.serviceI.BankAccountDetailsServiceI;


@CrossOrigin("*")
@RestController

public class BankAccountDetailsController {
	 @Autowired
		BankAccountDetailsServiceI bsi;
		
		
		@PostMapping(value = "/bankAccountDetails")
		public BankAccountDetails saveBankAccountDetails(@RequestBody BankAccountDetails bankAccountDetails) {
			BankAccountDetails b = bsi.saveBankAccountDetails(bankAccountDetails);
		return b;
		}
		
		@GetMapping(value = "/bankAccountDetailss")
		public List<BankAccountDetails> getBankAccountDetailss() {
			List<BankAccountDetails> bankAccountDetailss = bsi.getBankAccountDetailss();
			return bankAccountDetailss;
		}

		
		
		@PutMapping(value = "/bankAccountDetails/{accountId}")
		public BankAccountDetails updateBankAccountDetails(@PathVariable Integer accountId,@RequestBody BankAccountDetails b) {
			BankAccountDetails bankAccountDetails=bsi.updateBankAccountDetails(accountId,b);
			return bankAccountDetails;
		}
		
		
		@DeleteMapping(value = "/bankAccountDetails/{accountId}")
		public void deleteBankAccountDetails(@PathVariable Integer accountId) {
			bsi.deleteBankAccountDetails(accountId);
			
		}
	

}
