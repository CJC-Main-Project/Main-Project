package com.cjc.homeloanmanagement.app.serviceI;

import java.util.List;

import com.cjc.homeloanmanagement.app.model.LoanDisbursement;

public interface LoanDisbursementServiceI {

	public void saveLoan(LoanDisbursement ld);

	public List<LoanDisbursement> getLoan();

	public void deleteLoan(Integer agreementId);

	public LoanDisbursement getByid(Integer agreementId);

}
