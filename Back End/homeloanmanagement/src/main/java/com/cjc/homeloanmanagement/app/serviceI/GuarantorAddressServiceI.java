package com.cjc.homeloanmanagement.app.serviceI;

import java.util.List;


import com.cjc.homeloanmanagement.app.model.GuaruntorAddress;

public interface GuarantorAddressServiceI {

	List<GuaruntorAddress> getGuarantorAddress();

	void deleteGuarantorAddress(Integer guaruntorAddressId);

	void save(GuaruntorAddress ga);

}
