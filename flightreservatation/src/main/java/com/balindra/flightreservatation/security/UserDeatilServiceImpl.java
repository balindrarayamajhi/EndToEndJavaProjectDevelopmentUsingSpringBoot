package com.balindra.flightreservatation.security;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.balindra.flightreservatation.entity.User;
import com.balindra.flightreservatation.service.UserService;

@Service
public class UserDeatilServiceImpl implements UserDetailsService {

	@Autowired
	private UserService userservice;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userservice.findByEmail(username);
		
		return new UserDetails() {
			
			@Override
			public boolean isEnabled() {
				return true;
			}
			
			@Override
			public boolean isCredentialsNonExpired() {
				return true;
			}
			
			@Override
			public boolean isAccountNonLocked() {
				return true;
			}
			
			@Override
			public boolean isAccountNonExpired() {
				return true;
			}
			
			@Override
			public String getUsername() {
				return user.getEmail();
			}
			
			@Override
			public String getPassword() {
				
				return user.getPassword() ;
			}
			
			@Override
			public Collection<? extends GrantedAuthority> getAuthorities() {
		
				return user.getRoles();
			}
		};
	}

}
