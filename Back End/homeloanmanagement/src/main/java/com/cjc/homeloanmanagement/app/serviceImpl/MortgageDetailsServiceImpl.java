package com.cjc.homeloanmanagement.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.homeloanmanagement.app.model.MortgageDetails;
import com.cjc.homeloanmanagement.app.repositoryI.MortgageDetailsRepositoryI;
import com.cjc.homeloanmanagement.app.serviceI.MortgageDetailsServiceI;

@Service
public class MortgageDetailsServiceImpl implements MortgageDetailsServiceI{

	@Autowired
	MortgageDetailsRepositoryI mdr;

	@Override
	public void saveMortgageDetails(MortgageDetails mortgage) {
		mdr.save(mortgage);
		
	}

	@Override
	public List<MortgageDetails> getMortgageDetails() {
		
		return mdr.findAll();
	}

	@Override
	public void deleteMortgageDetails(Integer mortgageId) {
		mdr.deleteById(mortgageId);
		
		
	}
}
