package com.cjc.homeloanmanagement.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.homeloanmanagement.app.model.LoanDisbursement;
import com.cjc.homeloanmanagement.app.repositoryI.LoanDisbursementRepositoryI;
import com.cjc.homeloanmanagement.app.serviceI.LoanDisbursementServiceI;

@Service
public class LoanDisbursementServiceImpl implements LoanDisbursementServiceI
{
	@Autowired
	LoanDisbursementRepositoryI ldr;

	@Override
	public void saveLoan(LoanDisbursement ld) 
	{
		// TODO Auto-generated method 
     
		ldr.save(ld);
		
	}

	@Override
	public List<LoanDisbursement> getLoan() {
		// TODO Auto-generated method stub
		return ldr.findAll();
	}

	@Override
	public void deleteLoan(Integer agreementId) {
		// TODO Auto-generated method stub
		ldr.deleteById(agreementId);
	}
}
