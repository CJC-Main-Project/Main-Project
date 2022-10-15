package com.cjc.homeloanmanagement.app.serviceImpl;



import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.homeloanmanagement.app.model.EmailSender;
import com.cjc.homeloanmanagement.app.repositoryI.EmailSenderRepositoryI;
import com.cjc.homeloanmanagement.app.serviceI.EmailSenderServiceI;

@Service
public class EmailSenderSeviceImpl implements EmailSenderServiceI{

	@Autowired
	EmailSenderRepositoryI esr;

	@Autowired
	private JavaMailSender jms;

	

	@Override
	public void saveEmail(EmailSender es, MultipartFile attachment) {
		try {
			MimeMessage mm=jms.createMimeMessage();
			MimeMessageHelper mmh=new MimeMessageHelper(mm, true);
			mmh.setFrom(es.getFromEmail());
			mmh.setTo(es.getToEmail());
			mmh.setSubject(es.getSubject());
			mmh.setText(es.getTextbody());
			mmh.addAttachment(attachment.getOriginalFilename(),attachment);
			jms.send(mm);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
