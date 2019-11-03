package com.balindra.location.util;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;


@Component
public class EmailUtilImpl implements EmailUtil {
	
	@Autowired 
	private JavaMailSender sender;
	
	// JavaMailSender is an interface and JavaMailSenderImpl is its concrete implementation.

	@Override
	public void sendEmail(String toAddress, String subject, String body) {
		
		MimeMessage message=sender.createMimeMessage();
		MimeMessageHelper helper=new MimeMessageHelper(message);
		
		try {
			helper.setTo(toAddress);
			helper.setText(body);
			helper.setSubject(subject);
			
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		sender.send(message);
		
	}

}
