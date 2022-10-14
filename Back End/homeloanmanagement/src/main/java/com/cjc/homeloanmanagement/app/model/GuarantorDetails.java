package com.cjc.homeloanmanagement.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class GuarantorDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer guarantorId;
	private String guarantorName;
	private String guarantorPancardNo;
	private Long guarantorMobileNo;
	private Long guarantorAdharCardNo;
	private String guarantorYearlyIncome;
	@OneToOne(cascade = CascadeType.ALL)
	private GuaruntorAddress guarantorAddress;









}
