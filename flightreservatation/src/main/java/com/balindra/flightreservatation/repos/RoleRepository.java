package com.balindra.flightreservatation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balindra.flightreservatation.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
