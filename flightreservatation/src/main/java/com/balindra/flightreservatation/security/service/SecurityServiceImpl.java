package com.balindra.flightreservatation.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class SecurityServiceImpl implements SecurityService {
	
	@Autowired 
	private UserDetailsService userDetailsService;
	
	@Autowired 
	private AuthenticationManager authmanager;

	@Override
	public boolean login(String username, String password) {
		
		UserDetails userDetails=userDetailsService.loadUserByUsername(username);
		
		UsernamePasswordAuthenticationToken token =new UsernamePasswordAuthenticationToken(userDetails, password);
		
		authmanager.authenticate(token);
		
		if(token.isAuthenticated()) {
			
			//set the token into the spring security context  
			SecurityContextHolder.getContext().setAuthentication(token);
			return true;
		}
		return false;
	}

}
