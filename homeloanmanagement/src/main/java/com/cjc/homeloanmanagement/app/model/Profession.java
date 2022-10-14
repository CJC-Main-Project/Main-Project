package com.cjc.homeloanmanagement.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Profession {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer professionId;
	private String professionType;
    private String professionWorkingPeriod;
    private Double professionYearlyIncome;




}
