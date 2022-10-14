package com.cjc.homeloanmanagement.app.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnquiryDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer enquiryId;
	private String fullname;
	private Integer age;
	private String email;
	private Long mobileNo;
	private Double totalLoanRequired;
	private String pancardNo;
	private Integer cibilScore;
	private String cibilScoreDateTime;
	

}
