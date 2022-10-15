package com.cjc.homeloanmanagement.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.homeloanmanagement.app.model.GuarantorAddress;
import com.cjc.homeloanmanagement.app.repositoryI.GuarantorAddressRepositoryI;
import com.cjc.homeloanmanagement.app.serviceI.GuarantorAddressServiceI;

@Service
public class GuarantorAddressServiceImpl implements GuarantorAddressServiceI 
{
	@Autowired
	GuarantorAddressRepositoryI gar;

	@Override
	public List<GuarantorAddress> getGuarantorAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteGuarantorAddress(Integer guarantorId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(GuarantorAddress ga) {
		// TODO Auto-generated method stub
		
	}

}
