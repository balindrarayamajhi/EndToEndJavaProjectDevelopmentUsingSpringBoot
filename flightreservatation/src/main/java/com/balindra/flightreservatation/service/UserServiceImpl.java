package com.balindra.flightreservatation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balindra.flightreservatation.entity.User;
import com.balindra.flightreservatation.repos.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired 
	private  UserRepository userrepo;
	
	@Override
	public User getUserById(long id) {
		
		Optional<User> user= userrepo.findById(id);
		if (user.isPresent())
			return user.get();
		throw new  RuntimeException("user with Id : "+id+" does not exists");
	}

	@Override
	public User saveUser(User user) {
		
		return userrepo.save(user);
	}

	@Override
	public User updateUser(User user) {
		return userrepo.save(user);
	}

	@Override
	public void deleteUser(User user) {
		 userrepo.delete(user);

	}

	@Override
	public List<User> getAllUsers() {
		return userrepo.findAll();
	}

	@Override
	public void deleteUser(long id) {
		userrepo.deleteById(id);

	}

	@Override
	public User findByEmail(String email) {
		
		return userrepo.findByEmail(email);
	}

}
