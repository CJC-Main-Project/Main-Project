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
public class CustomerVerification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer verificationID;
	private String verificationDate;
	private String status;
	private String remarks;





}
