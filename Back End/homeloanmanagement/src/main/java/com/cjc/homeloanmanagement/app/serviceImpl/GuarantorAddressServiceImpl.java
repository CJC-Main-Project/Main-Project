package com.cjc.homeloanmanagement.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cjc.homeloanmanagement.app.model.GuaruntorAddress;
import com.cjc.homeloanmanagement.app.repositoryI.GuarantorAddressRepositoryI;
import com.cjc.homeloanmanagement.app.serviceI.GuarantorAddressServiceI;

@Service
public class GuarantorAddressServiceImpl implements GuarantorAddressServiceI 
{
	@Autowired
	GuarantorAddressRepositoryI gar;

	@Override
	public List<GuaruntorAddress> getGuarantorAddress() {
		
		return gar.findAll();
	}

	@Override
	public void deleteGuarantorAddress(Integer guaruntorAddressId) {
		gar.deleteById(guaruntorAddressId);
		
	}

	@Override
	public void save(GuaruntorAddress ga) {
		gar.save(ga);
		
	}

}
