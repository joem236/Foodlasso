package com.foodlasso.repository;

import java.util.List;

import com.foodlasso.domain.Product;

public interface ProductDao {

    public List<Product> getProductList();

    public void saveProduct(Product prod);
}