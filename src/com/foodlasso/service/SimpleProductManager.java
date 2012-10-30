package com.foodlasso.service;

import com.foodlasso.domain.Product;
import com.foodlasso.repository.ProductDao;

import java.util.List;

public class SimpleProductManager implements ProductManager {
	private static final long serialVersionUID = -7047085464915926347L;
	private ProductDao productDao;
	
	public List<Product> getProducts() {
        return productDao.getProductList();
    }

    public void increasePrice(int percentage) {
    	List<Product> products = productDao.getProductList();
    	if (products != null) {
            for (Product product : products) {
                double newPrice = product.getPrice().doubleValue() * (100 + percentage) / 100;
                product.setPrice(newPrice);
                productDao.saveProduct(product);
            }
        }        
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;        
    }

}
