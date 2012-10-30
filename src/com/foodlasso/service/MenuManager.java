package com.foodlasso.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.foodlasso.domain.Category;
import com.foodlasso.domain.Item;
import com.foodlasso.domain.Menu;
import com.foodlasso.domain.Price;
import com.foodlasso.repository.ICategoryDao;
import com.foodlasso.repository.IItemDao;
import com.foodlasso.repository.IMenuDao;
import com.foodlasso.repository.IPriceDao;

public class MenuManager implements IMenuManager {
	private static final long serialVersionUID = 659909308996628964L;
	private IMenuDao menuDao;
	private ICategoryDao categoryDao;
	private IItemDao itemDao;
	private IPriceDao priceDao;
	
	@Override
	public List<Menu> getMenus(int companyId) {
		return menuDao.getMenuList(companyId);
	}
	
	public void setMenuDao(IMenuDao dao)         { menuDao = dao; }
	public void setCategoryDao(ICategoryDao dao) { categoryDao = dao; }
	public void setItemDao(IItemDao dao)         { itemDao = dao; }
	public void setPriceDao(IPriceDao dao)       { priceDao = dao; }

	@Override
	public Menu getMenuById(int companyId, int menuId) {
		Menu menu = menuDao.getMenuById(companyId, menuId);
		HashMap<Integer, Category> categoryMap = categoryDao.getCategoryMap(companyId, menuId);
		HashMap<Integer, Item> items = itemDao.getItemMap(companyId, menuId);
		List<Price> prices = priceDao.getPrices(companyId, menuId);
				
		for (int p = 0; p < prices.size(); p++) {
			Item item = items.get(prices.get(p).getItemId());
			item.addPrice(prices.get(p));
			items.put(new Integer(item.getId()), item);
		}
		
		for (Map.Entry<Integer, Item> e : items.entrySet()) {
			Category c = categoryMap.get(e.getValue().getCategoryId());
			c.addItem(e.getValue());
			categoryMap.put(c.getId(), c);
		}
		
		for (Map.Entry<Integer, Category> e : categoryMap.entrySet()) {
			menu.addCategory(e.getValue());
		}
		
		return menu;
	}
}
