package com.cjc.homeloanmanagement.app.serviceI;

import java.util.List;

import com.cjc.homeloanmanagement.app.model.Profession;

public interface ProfessionServiceI {
	public List<Profession> getProfessions();

	public Profession saveProfession(Profession p);

	public void deleteProfession(Integer professionId);

	public Profession updateProfession(Integer professionId,Profession p);

	
	

}
