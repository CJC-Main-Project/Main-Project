package com.cjc.homeloanmanagement.app.repositoryI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.homeloanmanagement.app.model.Profession;

@Repository
public interface ProfessionRepositoryI extends JpaRepository<Profession, Integer> {
	public Profession  findByProfessionType(String professionType);
	

}
