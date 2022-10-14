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
@NoArgsConstructor
@AllArgsConstructor
public class AllPersonalDocuments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer documentId;
	private byte[] addharCard;
	private byte[] photo;
	private byte[] bankCheque;
	private byte[] pancardNo;
	private byte[] signature;
	private byte[] BankStatement;




}
