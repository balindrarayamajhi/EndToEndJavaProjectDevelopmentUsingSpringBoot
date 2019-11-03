package com.balindra.flightreservatation.service;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;

import com.balindra.flightreservatation.entity.Role;
import com.balindra.flightreservatation.repos.RoleRepository;

public class RoleServiceImpl implements RoleService {
	
	@Autowired 
	private RoleRepository roleRepo;

	@Override
	public Role getRoleById(long id) {
		
		Optional<Role>role=roleRepo.findById(id);
		if(role.isPresent())
			return role.get();
		
		throw new RuntimeException("Role with id : "+id+"does not exist.");
		
	}

	@Override
	public Role saveRole(Role role) {
		
		return roleRepo.save(role);
	}

	@Override
	public Role updateRole(Role role) {

		return roleRepo.save(role);
	}

	@Override
	public void deleteRole(Role role) {

		roleRepo.delete(role);

	}

	@Override
	public List<Role> getAllRoles() {

		return roleRepo.findAll();
	}

	@Override
	public void deleteRole(long id) {

		roleRepo.deleteById(id);
	}

}
