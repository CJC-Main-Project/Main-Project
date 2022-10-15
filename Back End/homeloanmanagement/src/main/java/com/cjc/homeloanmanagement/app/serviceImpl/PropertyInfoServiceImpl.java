package com.cjc.homeloanmanagement.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cjc.homeloanmanagement.app.model.PropertyInfo;
import com.cjc.homeloanmanagement.app.repositoryI.PropertyInfoRepositoryI;
import com.cjc.homeloanmanagement.app.serviceI.PropertyInfoServiceI;


@Service
public class PropertyInfoServiceImpl implements PropertyInfoServiceI {
	@Autowired
	PropertyInfoRepositoryI pr;
	@Override
		public List<PropertyInfo> savePropertyInfo(PropertyInfo pi) {
			pr.save(pi);
			return pr.findAll();
		}
	@Override
	public List<PropertyInfo> getPropertyInfo() {
		
		return pr.findAll();
	}
	@Override
	public void deletePropertyInfo(Integer propertyId) {
		pr.deleteById(propertyId);
		
	}
	@Override
	public PropertyInfo updatePropertyInfo(Integer propertyId, PropertyInfo pi) {
		pr.save(pi);
		return null;
	}
	

}
