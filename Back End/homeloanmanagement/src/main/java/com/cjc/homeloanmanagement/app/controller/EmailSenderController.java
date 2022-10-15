package com.cjc.homeloanmanagement.app.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.homeloanmanagement.app.model.EmailSender;
import com.cjc.homeloanmanagement.app.serviceI.EmailSenderServiceI;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin("*")
@RestController
public class EmailSenderController {
	
	@Autowired
	EmailSenderServiceI ess;
	
	@Value("${spring.mail.username}")
	String fromEmail;
	
	@PostMapping(value = "/sendEmail",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public  String saveEmail(@RequestPart (value = "attachment") MultipartFile attachment,@RequestPart (value = "information") String information) throws JsonMappingException, JsonProcessingException
	{
		ObjectMapper om= new ObjectMapper();
		 EmailSender em= om.readValue(information, EmailSender.class);
		 EmailSender es=new EmailSender();
		 es.setFromEmail(fromEmail);
		 es.setToEmail(em.getToEmail());
		 es.setSubject(em.getSubject());
		 es.setTextbody(em.getTextbody());
		 
		ess.saveEmail(es,attachment);
		return "Email Save Successfully...";
	}
	
	
	

}
