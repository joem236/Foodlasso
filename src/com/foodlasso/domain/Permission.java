package com.foodlasso.domain;

import java.io.Serializable;

public class Permission implements Serializable {
	private static final long serialVersionUID = -1700875635824786242L;
	private int permissionId;
	private int permissionMask;
	private String permissionName;
	public int getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(int permissionId) {
		this.permissionId = permissionId;
	}
	public int getPermissionMask() {
		return permissionMask;
	}
	public void setPermissionMask(int permissionMask) {
		this.permissionMask = permissionMask;
	}
	public String getPermissionName() {
		return permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	
}
