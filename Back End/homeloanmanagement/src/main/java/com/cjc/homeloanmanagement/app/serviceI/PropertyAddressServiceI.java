package com.cjc.homeloanmanagement.app.serviceI;

import java.util.List;

import com.cjc.homeloanmanagement.app.model.PropertyAddress;

public interface PropertyAddressServiceI {

	List<PropertyAddress> getPropertyAddress();

	void save(PropertyAddress pa);

	void deletePropertyAddress(Integer propertyId);

}
