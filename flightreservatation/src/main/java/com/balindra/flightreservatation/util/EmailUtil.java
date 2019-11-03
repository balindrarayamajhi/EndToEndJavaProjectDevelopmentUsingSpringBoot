package com.balindra.flightreservatation.util;

import java.io.File;


import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtil {
	
	@Value("${itinerary.email.subject}")
	private  String EMAIL_SUBJECT  = "Itinerary of your flight";
	
	@Value("${itinerary.email.body}")
	private  String EMAIL_BODY = "Please find your itinerary attached to mail.";


	private static final Logger LOGGER =LoggerFactory.getLogger(EmailUtil.class);
	
	@Autowired 
	private JavaMailSender sender;
	
	public void sendItinerary(String toAddress, String filepath) {
		LOGGER.info("Inside sendItinerary() method");
		MimeMessage message= sender.createMimeMessage();
		
		try {
			MimeMessageHelper helper=new MimeMessageHelper(message,true);
			//new MimeMessageHelper(message,true) true is denote that  message contains multipart
			helper.setTo(toAddress);
			helper.setSubject(EMAIL_SUBJECT );
			helper.setText(EMAIL_BODY);
			helper.addAttachment("Itinerary", new File(filepath));
			
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			LOGGER.error("Exception inside sendItinerary() : "+e);
			e.printStackTrace();
		}
		
		sender.send(message);
		
	}

}
