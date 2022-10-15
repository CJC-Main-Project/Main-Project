package com.cjc.homeloanmanagement.app.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DependentInfo 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer dependentInfoId;
  private String fatherName;
  private String motherName;
  private String spouseName;
  private Integer noOfFamilyMember;
  private String maritalStatus;
  private Double familyIncome;

	
}



  
  
	

