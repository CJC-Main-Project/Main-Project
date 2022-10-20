package com.cjc.homeloanmanagement.app.serviceI;

import java.util.List;

import com.cjc.homeloanmanagement.app.model.CustomerVerification;
import com.cjc.homeloanmanagement.app.model.EnquiryDetails;

public interface CustomerVerificationServiceI {

	public void save(CustomerVerification cv);

	public List<CustomerVerification> getCustomerVerification();

	public void deleteCustomerVerification(Integer verificationId);

}
