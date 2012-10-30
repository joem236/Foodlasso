package com.foodlasso.repository;

import java.util.HashMap;
import java.util.List;
import com.foodlasso.domain.Item;

public interface IItemDao {
	public List<Item> getItemList(int companyId, int menuId);
	public HashMap<Integer, Item> getItemMap(int companyId, int menuId);
	public Item getItemById(int companyId, int menuId, int categoryId, int itemId);
	public void saveItem(Item i);
}
