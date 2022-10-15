package com.cjc.homeloanmanagement.app.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.homeloanmanagement.app.model.PropertyInfo;
import com.cjc.homeloanmanagement.app.serviceI.PropertyInfoServiceI;
import com.fasterxml.jackson.databind.ObjectMapper;



@CrossOrigin("*")
@RestController

public class PropertyInfoController {
	@Autowired
	PropertyInfoServiceI psi;
	@GetMapping("/getPropertyInfo")
	public List<PropertyInfo> getPropertyInfo(){ 
	List<PropertyInfo> list =psi.getPropertyInfo();
	return list;
	}
	
	 @PostMapping(value = "/propertyInfo",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
		public List<PropertyInfo> savePropertyInfo(@RequestPart(value="propertyDocuments",required = true) MultipartFile propertyDocuments,@RequestPart(value ="doc")String doc) throws IOException{
	
			 ObjectMapper om=new ObjectMapper();
			 PropertyInfo pi = om.readValue(doc,PropertyInfo.class);
			 PropertyInfo propertyInfo=new PropertyInfo();
			 propertyInfo.setPropertyType(pi.getPropertyType());
			 propertyInfo.setPropertyTotalArea(pi.getPropertyTotalArea());
			 propertyInfo.setConstructionArea(pi.getConstructionArea());
			 propertyInfo.setPropertyPrice(pi.getPropertyPrice());
			 propertyInfo.setConstructionPrice(pi.getConstructionPrice());
			 propertyInfo.setPropertyDocuments(propertyDocuments.getBytes());
			
			 List<PropertyInfo> list=psi.savePropertyInfo(propertyInfo);
			 		 return null;
	
	
	 }
	 @PutMapping(value = "/propertyInfo/{propertyId}",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
		public List<PropertyInfo> updatePropertyInfo(@RequestPart(value="propertyDocuments",required = true) MultipartFile propertyDocuments,@RequestPart(value ="doc")String doc) throws IOException{
		 ObjectMapper om=new ObjectMapper();
		 PropertyInfo pi = om.readValue(doc,PropertyInfo.class);
		 PropertyInfo propertyInfo=new PropertyInfo();
		 propertyInfo.setPropertyType(pi.getPropertyType());
		 propertyInfo.setPropertyTotalArea(pi.getPropertyTotalArea());
		 propertyInfo.setConstructionArea(pi.getConstructionArea());
		 propertyInfo.setPropertyPrice(pi.getPropertyPrice());
		 propertyInfo.setConstructionPrice(pi.getConstructionPrice());
		 propertyInfo.setPropertyDocuments(propertyDocuments.getBytes());
		
		 List<PropertyInfo> list=psi.savePropertyInfo(propertyInfo);
		 		 return null;
	 
	 }
		 @DeleteMapping("/deletePropertyInfo/{propertyId}")
	 public String deletePropertyInfo(@PathVariable Integer propertyId)
	 {
		 psi.deletePropertyInfo(propertyId);
		 return null;
	 }
	 

}
