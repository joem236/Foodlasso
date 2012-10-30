package com.foodlasso.domain;

import java.io.Serializable;

public class Price implements Serializable {
	private static final long serialVersionUID = 7348702446253854301L;
	private int id = 0;
	private int companyId = 0;
	private int menuId = 0;
	private int categoryId = 0;
	private int itemId = 0;
	private String name = "";
	private double price = 0.0;
	private int position = 0;
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
	public final int getItemId() {
		return itemId;
	}
	public final void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final double getPrice() {
		return price;
	}
	public final void setPrice(double price) {
		this.price = price;
	}
	public final int getPosition() {
		return position;
	}
	public final void setPosition(int position) {
		this.position = position;
	}
	
	
}
