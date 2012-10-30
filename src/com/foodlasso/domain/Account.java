package com.foodlasso.domain;

import java.io.Serializable;

public class Account implements Serializable {
	private static final long serialVersionUID = 4179169451660474539L;
	private int user_id;
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
}
