package com.balindra.flightreservatation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Override
	public void configure(HttpSecurity http) throws Exception{
		http
			.authorizeRequests()
			.antMatchers("/user","/login","/","/index.html","/reservations/*").permitAll()
			.antMatchers("/addFlight").hasAnyAuthority("ADMIN")
			.anyRequest().authenticated()
			.and()
			.csrf().disable();
			
	}

	@Bean 
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception{
		return super.authenticationManager();
		
	}
}
