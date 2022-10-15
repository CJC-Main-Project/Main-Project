package com.cjc.homeloanmanagement.app.repositoryI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.homeloanmanagement.app.model.CustomerVerification;

@Repository
public interface CustomerVerificationRepositoryI extends JpaRepository<CustomerVerification,Integer>
{

}
