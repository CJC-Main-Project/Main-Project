package com.cjc.homeloanmanagement.app.serviceI;



import org.springframework.web.multipart.MultipartFile;

import com.cjc.homeloanmanagement.app.model.EmailSender;

public interface EmailSenderServiceI {

	

	

	void saveEmail(EmailSender es, MultipartFile attachment);

}
