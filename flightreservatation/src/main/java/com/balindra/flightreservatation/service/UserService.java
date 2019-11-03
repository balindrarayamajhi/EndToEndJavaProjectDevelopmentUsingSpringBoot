package com.balindra.flightreservatation.service;

import java.util.List;

import com.balindra.flightreservatation.entity.User;


public interface UserService {
	User getUserById(long id);
	User saveUser(User user);
	User updateUser(User user);
	void deleteUser(User user);
	List<User> getAllUsers();
	void deleteUser(long id);
	User findByEmail(String email);

}
