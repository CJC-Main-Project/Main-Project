package com.cjc.homeloanmanagement.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

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
	@Lob
	private byte[] addharCard;
	@Lob
	private byte[] photo;
	@Lob
	private byte[] bankCheque;
	@Lob
	private byte[] pancardNo;
	@Lob
	private byte[] signature;
	@Lob
	private byte[] bankStatement;




}
