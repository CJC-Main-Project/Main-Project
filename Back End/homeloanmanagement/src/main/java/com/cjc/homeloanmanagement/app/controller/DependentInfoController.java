package com.cjc.homeloanmanagement.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.homeloanmanagement.app.model.DependentInfo;
import com.cjc.homeloanmanagement.app.serviceI.DependentInfoServiceI;

@RestController
@CrossOrigin("*")
public class DependentInfoController 
{
@Autowired
DependentInfoServiceI dis;

@PostMapping ("/saveDependentInfo")
public String saveDependentInfo(@RequestBody DependentInfo di)
{
	dis.saveDependentInfo(di);
	
	return "dInfo save successfully";
}
@GetMapping("/getDependentInfo")
public List<DependentInfo>getDepeInndentfo()
{
	List<DependentInfo>list=dis.getDepeInndentfo();
	
	return list;
}

@PutMapping("/updateDependentInfo/{dependentInfoId}")
public String updateDependentInfo(@RequestBody DependentInfo di)
{

         dis.saveDependentInfo(di);
         
         return "updated successfully";
}

@DeleteMapping("deleteDependentInfo/{dependentInfoId}")
public String deleteDependentInfo(@PathVariable Integer dependentInfoId)
{
	dis.dependentInfoId(dependentInfoId);
	
	return "deleted Successfully";
}





}