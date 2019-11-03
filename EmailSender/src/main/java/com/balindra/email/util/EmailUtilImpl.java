package com.balindra.email.util;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtilImpl implements EmailUtil{

	@Autowired
	private JavaMailSender sender;
	
	//JavaMailSender is an interface and its implementation is  JavaMailSenderImpl class 
	

	@Override
	public void sendEmail(String toAddress, String subject, String body) {
		MimeMessage message=sender.createMimeMessage();
		MimeMessageHelper helper=new MimeMessageHelper(message);
		try {
			helper.setTo(toAddress);
			helper.setText(body);
			helper.setSubject(subject);
			
		}catch(MessagingException e) {
			e.printStackTrace();
		}
		
	}
	
}
