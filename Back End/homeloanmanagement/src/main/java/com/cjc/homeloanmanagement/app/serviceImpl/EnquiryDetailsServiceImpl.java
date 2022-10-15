package com.cjc.homeloanmanagement.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.homeloanmanagement.app.model.EnquiryDetails;
import com.cjc.homeloanmanagement.app.repositoryI.EnquiryDetailsRepositoryI;
import com.cjc.homeloanmanagement.app.serviceI.EnquiryDetailsServiceI;

@Service

public class EnquiryDetailsServiceImpl implements EnquiryDetailsServiceI
{
    @Autowired
    
    EnquiryDetailsRepositoryI edr;
	
    @Override
	public void save(EnquiryDetails ed) {
		
    	edr.save(ed);
		
	}

	@Override
	public List<EnquiryDetails> getEnquiryDetails() {
		
		
		return edr.findAll();
	}

	@Override
	public void deleteEnquiryDetails(Integer enquiryId) {
		edr.deleteById(enquiryId);
	}

	

}
