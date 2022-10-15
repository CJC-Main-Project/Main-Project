package com.cjc.homeloanmanagement.app.repositoryI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.homeloanmanagement.app.model.BankAccountDetails;


@Repository
public interface BankAccountDetailsRepositoryI extends JpaRepository<BankAccountDetails, Integer> {
	public BankAccountDetails  findByaccounType(String accounType);
	

}
