package com.foodlasso.repository;

import java.util.List;

import com.foodlasso.domain.Product;

public class InMemoryProductDao implements ProductDao {
	private List<Product> productList;
	
	public InMemoryProductDao(List<Product> products) {
		productList = products;
	}
	
	@Override
	public List<Product> getProductList() {
		return productList;
	}

	@Override
	public void saveProduct(Product prod) {
	}

}
