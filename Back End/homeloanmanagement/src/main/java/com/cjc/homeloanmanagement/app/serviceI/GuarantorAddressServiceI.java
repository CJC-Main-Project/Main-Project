package com.cjc.homeloanmanagement.app.serviceI;

import java.util.List;

import com.cjc.homeloanmanagement.app.model.GuarantorAddress;

public interface GuarantorAddressServiceI {

	List<GuarantorAddress> getGuarantorAddress();

	void deleteGuarantorAddress(Integer guarantorId);

	void save(GuarantorAddress ga);

}
