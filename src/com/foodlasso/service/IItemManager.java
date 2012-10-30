package com.foodlasso.service;

import java.io.Serializable;
import java.util.List;

import com.foodlasso.domain.Item;

public interface IItemManager extends Serializable {
	public List<Item> getItems(int categoryId);
	public Item getItemById(int itemId);
}
