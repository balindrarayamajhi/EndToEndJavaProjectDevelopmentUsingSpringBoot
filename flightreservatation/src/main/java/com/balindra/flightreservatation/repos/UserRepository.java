package com.balindra.flightreservatation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balindra.flightreservatation.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
}
