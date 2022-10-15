package com.cjc.homeloanmanagement.app.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.homeloanmanagement.app.model.Profession;
import com.cjc.homeloanmanagement.app.repositoryI.ProfessionRepositoryI;
import com.cjc.homeloanmanagement.app.serviceI.ProfessionServiceI;

@Service
public class ProfessionServiceImpl implements ProfessionServiceI{
	 @Autowired
		ProfessionRepositoryI pri;
		
		@Override
		public List<Profession> getProfessions() {
			return pri.findAll();
		}
		@Override
		public Profession saveProfession(Profession p) {
			
			
			return pri.save(p);
		}

		@Override
		public void deleteProfession(Integer professionId) {
			pri.deleteById(professionId);
		
			
		}

			
		@Override
		public Profession updateProfession(Integer professionId,Profession p) {
			
			   Optional<Profession> op  = pri.findById(professionId);
			                     if(op.isPresent()) {
			                    	   Profession profession= op.get();
			                    	   profession.setProfessionType(p.getProfessionType());
			                    	   profession.setProfessionWorkingPeriod(p.getProfessionWorkingPeriod());
			                    	   profession.setProfessionYearlyIncome(p.getProfessionYearlyIncome());
			                    	return   pri.save(profession);
			                     }
			                     else
			                     {
			                    	 return null;
			                     }

		
		}

		

		





		

		
		
}
