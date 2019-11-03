package com.balindra.flightreservatation.service;

import java.util.List;

import com.balindra.flightreservatation.entity.Role;

public interface RoleService {
	Role getRoleById(long id);
	Role saveRole(Role role);
	Role updateRole(Role role);
	void deleteRole(Role role);
	List<Role> getAllRoles();
	void deleteRole(long id);
	

}
