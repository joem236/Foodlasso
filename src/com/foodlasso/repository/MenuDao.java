package com.foodlasso.repository;

import java.util.List;

import com.foodlasso.domain.Menu;

public interface MenuDao {
	 public List<Menu> getMenuList();
	 public void saveMenu(Menu menu);
}
