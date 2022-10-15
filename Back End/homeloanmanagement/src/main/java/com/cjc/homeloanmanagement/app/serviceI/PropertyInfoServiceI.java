package com.cjc.homeloanmanagement.app.serviceI;

import java.util.List;

import com.cjc.homeloanmanagement.app.model.PropertyInfo;


public interface PropertyInfoServiceI {
	public List<PropertyInfo> savePropertyInfo(PropertyInfo pi);
	public List<PropertyInfo> getPropertyInfo();
	public void deletePropertyInfo(Integer propertyId);
	public PropertyInfo updatePropertyInfo(Integer propertyId, PropertyInfo pi ); 

}
