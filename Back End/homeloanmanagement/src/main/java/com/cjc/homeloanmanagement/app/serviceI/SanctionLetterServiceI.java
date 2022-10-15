package com.cjc.homeloanmanagement.app.serviceI;

import java.util.List;

import com.cjc.homeloanmanagement.app.model.SanctionLetter;

public interface SanctionLetterServiceI {

	public void saveSanctionLetter(SanctionLetter sl);

	public List<SanctionLetter> getSanctionLetter();

	public void deleteSanctionLetter(Integer sanctionId);



	

}
