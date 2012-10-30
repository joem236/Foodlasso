package com.foodlasso.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Item implements Serializable {
	private static final long serialVersionUID = -2590695882598577379L;
	private int id = 0;
	private int companyId = 0;
	private int menuId = 0;
	private int categoryId = 0;
	private String name = "";
	private String description = "";
	private double price = 0.0;
	private String template = "";
	private String mimeType = "";
	private boolean topping = false;
	private int position = 0;
	private List<Price> _prices = null;
	
	public final int getId() {
		return id;
	}
	public final void setId(int id) {
		this.id = id;
	}
	public final int getCompanyId() {
		return companyId;
	}
	public final void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public final int getMenuId() {
		return menuId;
	}
	public final void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public final int getCategoryId() {
		return categoryId;
	}
	public final void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getDescription() {
		return description;
	}
	public final void setDescription(String description) {
		this.description = description;
	}
	public final double getPrice() {
		return price;
	}
	public final void setPrice(double price) {
		this.price = price;
	}
	public final String getTemplate() {
		return template;
	}
	public final void setTemplate(String template) {
		this.template = template;
	}
	public final String getMimeType() {
		return mimeType;
	}
	public final void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
	public final boolean isTopping() {
		return topping;
	}
	public final void setTopping(boolean topping) {
		this.topping = topping;
	}
	public final int getPosition() {
		return position;
	}
	public final void setPosition(int position) {
		this.position = position;
	}
	
	public final List<Price> getPrices() { return _prices; }
	public final Price getPriceAtIndex(int i) { return _prices.get(i); }
	public final void setPrices(List<Price> ps) { _prices = ps; }
	public final void addPrice(Price p) {
		if (_prices == null) _prices = new ArrayList<Price>();
		_prices.add(p);
	}
}
