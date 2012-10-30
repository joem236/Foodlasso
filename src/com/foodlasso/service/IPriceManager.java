package com.foodlasso.service;

import java.io.Serializable;
import java.util.List;

import com.foodlasso.domain.Price;

public interface IPriceManager extends Serializable {
	public List<Price> getPrices(int itemId);
	public Price getPriceById(int priceId);
}
