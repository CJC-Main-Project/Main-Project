package com.cjc.homeloanmanagement.app.serviceI;

import java.util.List;

import com.cjc.homeloanmanagement.app.model.MortgageDetails;

public interface MortgageDetailsServiceI {

	void saveMortgageDetails(MortgageDetails mortgage);

	List<MortgageDetails> getMortgageDetails();

	void deleteMortgageDetails(Integer mortgageId);

}
