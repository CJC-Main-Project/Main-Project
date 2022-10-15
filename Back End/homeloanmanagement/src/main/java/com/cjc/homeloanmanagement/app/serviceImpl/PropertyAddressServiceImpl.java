package com.cjc.homeloanmanagement.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.homeloanmanagement.app.model.PropertyAddress;
import com.cjc.homeloanmanagement.app.repositoryI.PropertyAddressRepositoryI;
import com.cjc.homeloanmanagement.app.serviceI.PropertyAddressServiceI;

@Service
public class PropertyAddressServiceImpl implements PropertyAddressServiceI
{
 @Autowired
 PropertyAddressRepositoryI par;
 
	@Override
	public List<PropertyAddress> getPropertyAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(PropertyAddress pa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePropertyAddress(Integer propertyId) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
