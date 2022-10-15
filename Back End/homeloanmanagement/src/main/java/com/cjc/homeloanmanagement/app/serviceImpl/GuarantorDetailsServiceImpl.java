package com.cjc.homeloanmanagement.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.homeloanmanagement.app.model.GuarantorDetails;
import com.cjc.homeloanmanagement.app.repositoryI.GuarantorDetailsRepositoryI;
import com.cjc.homeloanmanagement.app.serviceI.GuarantorDetailsServiceI;

@Service
public class GuarantorDetailsServiceImpl implements GuarantorDetailsServiceI{
	
	@Autowired
	GuarantorDetailsRepositoryI gdr;

	@Override
	public void saveGuarantorDetails(GuarantorDetails gd) {
		// TODO Auto-generated method stub
		gdr.save(gd);
	}

	@Override
	public List<GuarantorDetails> getGuarantorDetails() {
		// TODO Auto-generated method stub
		return gdr.findAll();
	}

	@Override
	public void deleteGuarantorDetails(Integer guarantorId) {
		// TODO Auto-generated method stub
		gdr.deleteById(guarantorId);
	}

}
