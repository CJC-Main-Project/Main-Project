package com.cjc.homeloanmanagement.app.repositoryI;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.homeloanmanagement.app.model.CustomerAddress;

public interface CustomerAddressRepositoryI extends JpaRepository<CustomerAddress, Integer>
{

}
