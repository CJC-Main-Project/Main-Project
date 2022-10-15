package com.cjc.homeloanmanagement.app.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.homeloanmanagement.app.model.BankAccountDetails;
import com.cjc.homeloanmanagement.app.model.Profession;
import com.cjc.homeloanmanagement.app.repositoryI.BankAccountDetailsRepositoryI;

import com.cjc.homeloanmanagement.app.serviceI.BankAccountDetailsServiceI;

@Service
public class BankAccountDetailsServiceImpl implements BankAccountDetailsServiceI {
	 @Autowired
		BankAccountDetailsRepositoryI bri;
		
		@Override
		public List<BankAccountDetails> getBankAccountDetailss() {
			return bri.findAll();
		}
		@Override
		public BankAccountDetails saveBankAccountDetails(BankAccountDetails b) {
			
			
			return bri.save(b);
		}

		@Override
		public void deleteBankAccountDetails(Integer accountId) {
			bri.deleteById(accountId);
		

}
		@Override
		public BankAccountDetails updateBankAccountDetails(Integer accountId, BankAccountDetails b) {
			 Optional<BankAccountDetails> ob  = bri.findById(accountId);
             if(ob.isPresent()) {
            	 BankAccountDetails bankAccountDetails= ob.get();
            	 bankAccountDetails.setAccounType(b.getAccounType());
            	 bankAccountDetails.setAccountBalance(b.getAccountBalance());
            	 bankAccountDetails.setAccountHolderName(b.getAccountHolderName());
            	 bankAccountDetails.setAccountStatus(b.getAccountStatus());
            	 bankAccountDetails.setAccountNumber(b.getAccountNumber());
            	 bankAccountDetails.setBranchName(b.getBranchName());
            	 bankAccountDetails.setBankName(b.getBankName());
            	 bankAccountDetails.setIfsccode(b.getIfsccode());
            	 
   	   
            	return   bri.save(bankAccountDetails);
             }
             else
             {
			
			return null;
		}
}
}