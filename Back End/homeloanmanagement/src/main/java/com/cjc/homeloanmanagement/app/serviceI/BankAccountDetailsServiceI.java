package com.cjc.homeloanmanagement.app.serviceI;

import java.util.List;

import com.cjc.homeloanmanagement.app.model.BankAccountDetails;


public interface BankAccountDetailsServiceI {
	public List<BankAccountDetails> getBankAccountDetailss();

	public BankAccountDetails saveBankAccountDetails(BankAccountDetails b);

	public void deleteBankAccountDetails(Integer accountId);

	public BankAccountDetails updateBankAccountDetails(Integer accountId,BankAccountDetails b);

}
