package com.cjc.homeloanmanagement.app.serviceI;

import java.util.List;

import com.cjc.homeloanmanagement.app.model.EnquiryDetails;

public interface EnquiryDetailsServiceI 
{

	public void save(EnquiryDetails ed);

	public List<EnquiryDetails> getEnquiryDetails();

	public void deleteEnquiryDetails(Integer enquiryId);

	

}
