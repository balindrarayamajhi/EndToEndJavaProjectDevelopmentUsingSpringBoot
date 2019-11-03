package com.balindra.flightcheckin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FlightcheckinApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightcheckinApplication.class, args);
	}

	@Bean 
	public RestTemplate restTemplate() {
		return new RestTemplate();
		
	}
}
