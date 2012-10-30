package com.foodlasso.repository;

import java.util.HashMap;
import java.util.List;
import com.foodlasso.domain.Category;

public interface ICategoryDao {
	public List<Category> getCategoryList(int companyId, int menuId);
	public HashMap<Integer,Category> getCategoryMap(int companyId, int menuId);
	public Category getCategoryById(int companyId, int menuId, int categoryId);
	public void saveCategory(Category c);
}
