package com.foodlasso.service;

import java.io.Serializable;
import java.util.List;

import com.foodlasso.domain.Menu;

public interface IMenuManager extends Serializable {
	public List<Menu> getMenus(int companyId);
	public Menu getMenuById(int companyId, int menuId);
}
