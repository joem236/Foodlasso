package com.foodlasso.repository;

import java.util.List;

import com.foodlasso.domain.Price;

public interface IPriceDao {
	public List<Price> getPrices(int company_id, int menu_id);
	public void savePrice(Price price);
}
