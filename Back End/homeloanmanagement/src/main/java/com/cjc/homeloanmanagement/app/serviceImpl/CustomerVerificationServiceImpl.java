package com.cjc.homeloanmanagement.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.homeloanmanagement.app.model.CustomerVerification;

import com.cjc.homeloanmanagement.app.repositoryI.CustomerVerificationRepositoryI;
import com.cjc.homeloanmanagement.app.serviceI.CustomerVerificationServiceI;


@Service
public class CustomerVerificationServiceImpl implements CustomerVerificationServiceI
{
@ Autowired
CustomerVerificationRepositoryI cvr;

@Override
public void save(CustomerVerification cv) {
            
	cvr.save(cv);
}

@Override
public List<CustomerVerification> getCustomerVerification() {
	
	return cvr.findAll();
}

@Override
public void deleteCustomerVerification(Integer verificationID) {
     
	cvr.deleteById(verificationID);
}



}
