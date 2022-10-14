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
@NoArgsConstructor
@AllArgsConstructor
public class PropertyInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer propertyId;
	private String propertyType;
	private String propertyTotalArea;
	private String constructionArea;
	private Double propertyPrice;
	private Double constructionPrice;
	private Byte[] propertyDocuments;
	@OneToOne(cascade = CascadeType.ALL)
	private PropertyAddress propertyAddress;










}
