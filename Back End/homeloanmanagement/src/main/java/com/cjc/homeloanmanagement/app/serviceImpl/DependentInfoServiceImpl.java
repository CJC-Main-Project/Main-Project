package com.cjc.homeloanmanagement.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.homeloanmanagement.app.model.DependentInfo;
import com.cjc.homeloanmanagement.app.repositoryI.DependentInfoRepositoryI;
import com.cjc.homeloanmanagement.app.serviceI.DependentInfoServiceI;

@Service
public class DependentInfoServiceImpl implements DependentInfoServiceI
{
   @Autowired
   DependentInfoRepositoryI dir;

@Override
public void saveDependentInfo(DependentInfo di) {
       dir.save(di);
	
}

@Override
public List<DependentInfo> getDepeInndentfo() {

	return dir.findAll();
}

@Override
public void dependentInfoId(Integer dependentInfoId) {
	
	dir.deleteById(dependentInfoId);
	
}
}
