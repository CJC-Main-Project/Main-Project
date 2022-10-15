package com.cjc.homeloanmanagement.app.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.homeloanmanagement.app.model.AllPersonalDocuments;
import com.cjc.homeloanmanagement.app.serviceI.AllPersonalDocumentsServiceI;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin("*")
@RestController
public class AllPersonalDocumentsController {

	@Autowired
	AllPersonalDocumentsServiceI apds;
	
	@PostMapping(value = "/saveDocuments",consumes = MediaType.MULTIPART_FORM_DATA_VALUE )
	public String savePersonalDocuments(@RequestPart (value = "addharCard",required  = true) MultipartFile addharCard,@RequestPart (value = "photo",required  = true) MultipartFile photo,
			  @RequestPart (value = "bankCheque",required  = true) MultipartFile bankCheque,@RequestPart (value = "pancardNo",required  = true) MultipartFile pancardNo,
			  @RequestPart (value = "signature",required  = true) MultipartFile signature,@RequestPart (value = "bankStatement",required  = true) MultipartFile bankStatement) throws IOException
	{
		AllPersonalDocuments docs=new AllPersonalDocuments();
		docs.setAddharCard(addharCard.getBytes());
		docs.setBankCheque(bankCheque.getBytes());
		docs.setBankStatement(bankStatement.getBytes());
		docs.setPancardNo(pancardNo.getBytes());
		docs.setPhoto(photo.getBytes());
		docs.setSignature(signature.getBytes());
		  apds.savePersonalDocuments(docs);
		return "Documents Save Successfully...";
	}
	
	@GetMapping("/getDocuments")
	public List<AllPersonalDocuments> getPersonalDocumets()
	{
		List<AllPersonalDocuments> list= apds.getPersonalDocumets();
		return list;
	}
	
	@PutMapping(value = "/updateDocuments/{documentId}",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String updatePersonalDocuments(@RequestPart (value = "addharCard",required  = true) MultipartFile addharCard,@RequestPart (value = "photo",required  = true) MultipartFile photo,
			  @RequestPart (value = "bankCheque",required  = true) MultipartFile bankCheque,@RequestPart (value = "pancardNo",required  = true) MultipartFile pancardNo,
			  @RequestPart (value = "signature",required  = true) MultipartFile signature,@RequestPart (value = "bankStatement",required  = true) MultipartFile bankStatement,@RequestPart (value = "documentId") String documentId) throws IOException
	{
		ObjectMapper om=new ObjectMapper();
		AllPersonalDocuments d=om.readValue(documentId, AllPersonalDocuments.class);
		
		AllPersonalDocuments docs=new AllPersonalDocuments();
		docs.setDocumentId(d.getDocumentId());
		docs.setAddharCard(addharCard.getBytes());
		docs.setBankCheque(bankCheque.getBytes());
		docs.setBankStatement(bankStatement.getBytes());
		docs.setPancardNo(pancardNo.getBytes());
		docs.setPhoto(photo.getBytes());
		docs.setSignature(signature.getBytes());
		  apds.savePersonalDocuments(docs);
		return "Documents update Successfully...";
	}
	
	@DeleteMapping("/deleteDocuments/{documentId}")
	public String deletePersonalDocuments(@PathVariable Integer documentId )
	{
		apds.deletePersonalDocuments(documentId);
		return "Documents Deleted Successfully...";
	}
}
