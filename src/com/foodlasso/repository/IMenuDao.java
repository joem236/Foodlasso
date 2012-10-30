package com.foodlasso.repository;

import java.util.List;

import com.foodlasso.domain.Category;
import com.foodlasso.domain.Menu;

public interface IMenuDao {
	 public List<Menu> getMenuList(int companyId);
	 public Menu getMenuById(int companyId, int menuId);
	 public List<Category> getCategories(int companyId, int menuId);
	 public void saveMenu(Menu menu);
}
