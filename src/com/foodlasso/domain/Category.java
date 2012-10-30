package com.foodlasso.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Category implements Serializable {
	private static final long serialVersionUID = -7517997386600655802L;
	private int id = 0;
	private int companyId = 0;
	private int menuId = 0;
	private int parentId = 0;
	private String name = "";
	private String mimeType = "";
	private String description  = "";
	private int position = 0;
	private List<Item> _items = null;
	
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
	public final int getParentId() {
		return parentId;
	}
	public final void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getMimeType() {
		return mimeType;
	}
	public final void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
	public final String getDescription() {
		return description;
	}
	public final void setDescription(String description) {
		this.description = description;
	}
	public final int getPosition() {
		return position;
	}
	public final void setPosition(int position) {
		this.position = position;
	}
	
	public final List<Item> getItems() { return _items; }
	public final Item getItemAtIndex(int i) { return _items.get(i); }
	public final void setItems(List<Item> is) { _items = is; }
	public final void addItem(Item i) {
		if (_items == null) _items = new ArrayList<Item>();
		_items.add(i);
	}
}
