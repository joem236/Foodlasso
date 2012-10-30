package com.foodlasso.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class User implements Serializable {
	private static final long serialVersionUID = -931456659007941654L;
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private String password;
	private int companyId;
	private boolean isOwner;
	private Map<Integer,Integer> permissions;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	
	public void setPermissions(Map<Integer,Integer> perm) {
		this.permissions = perm;
	}
	
	public void addPermission(int objectId, int permissionMask) {
		if (this.permissions == null) {
			this.permissions = new HashMap<Integer,Integer>();
		}
		this.permissions.put(objectId,  permissionMask);
	}
	
	public Map<Integer,Integer> getPermissions() {
		return this.permissions;
	}
	
	public boolean hasPermission(int objectId, int permission) {
		Integer mask = this.permissions.get(objectId);
		return (mask != null && (mask & permission) > 0);
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isOwner() {
		return isOwner;
	}
	public void setOwner(boolean isOwner) {
		this.isOwner = isOwner;
	}
}
