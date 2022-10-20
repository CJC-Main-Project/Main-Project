package com.cjc.homeloanmanagement.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.homeloanmanagement.app.model.SanctionLetter;
import com.cjc.homeloanmanagement.app.repositoryI.SanctionLetterRepositoryI;
import com.cjc.homeloanmanagement.app.serviceI.SanctionLetterServiceI;

@Service
public class SanctionLetterServiceImpl implements SanctionLetterServiceI{
	
	@Autowired
	SanctionLetterRepositoryI slr;
	

	@Override
	public void saveSanctionLetter(SanctionLetter sl) {
		// TODO Auto-generated method stub
		slr.save(sl);
		
	}

	@Override
	public List<SanctionLetter> getSanctionLetter() {
		// TODO Auto-generated method stub
		return slr.findAll();
	}

	@Override
	public void deleteSanctionLetter(Integer sanctionId) {
		// TODO Auto-generated method stub
		slr.deleteById(sanctionId);
		
	}

	@Override
	public SanctionLetter getById(Integer sanctionId) {
	
		return slr.getById(sanctionId);
	}

}
