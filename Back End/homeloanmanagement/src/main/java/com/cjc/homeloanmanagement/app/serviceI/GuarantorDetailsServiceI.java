package com.cjc.homeloanmanagement.app.serviceI;

import java.util.List;

import com.cjc.homeloanmanagement.app.model.GuarantorDetails;

public interface GuarantorDetailsServiceI {

	public void saveGuarantorDetails(GuarantorDetails gd);

	public List<GuarantorDetails> getGuarantorDetails();

	public void deleteGuarantorDetails(Integer guarantorId);





}
