package com.foodlasso.service;

import java.io.Serializable;
import java.util.List;

import com.foodlasso.domain.Category;

public interface ICategoryManager extends Serializable {
	public List<Category> getCategories(int menuId);
	public Category getCategoryById(int categoryId);
}
