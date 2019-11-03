package com.balindra.flightreservatation.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Role extends AbstractEntity implements GrantedAuthority {
	
	
	private static final long serialVersionUID = 1L;

	private String name;
	
	@ManyToMany(mappedBy="roles")
	private List<User> users=new ArrayList<>();

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public List<User> getUsers() {
		return users;
	}

	
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
	//convenience methods for bi-directional relations 
	public boolean addUser(User user) {
		if(!users.contains(user)) {
			users.add(user);
			return true;
		}
		return false;
	}
	
	public boolean reomveUser(User user) {
		if(users.contains(user)) {
			users.remove(user);
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((users == null) ? 0 : users.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (users == null) {
			if (other.users != null)
				return false;
		} else if (!users.equals(other.users))
			return false;
		return true;
	}

	@Override
	public String getAuthority() {
		return name;
	}
	
	

}
