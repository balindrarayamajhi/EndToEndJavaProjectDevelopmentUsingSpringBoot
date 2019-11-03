package com.balindra.flightreservatation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.balindra.flightreservatation.security.UserDeatilServiceImpl;

@SpringBootApplication
public class FlightreservatationApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(FlightreservatationApplication.class, args);
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
//	@Bean
//	public UserDetailsService userDeatialsService() {
//		return new UserDeatilServiceImpl();
//		
//	}
	
}
