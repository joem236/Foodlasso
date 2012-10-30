package com.foodlasso.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Menu implements Serializable {
	private static final long serialVersionUID = -6238614526660268348L;
	private int _id = 0;
	private String _name = "";
	private int _companyId = 0;
	private boolean _active = false;
	private String _description = "";
	private String _downloadLink = "";
	private int _publishedId = 0;
	private int _workingMenuId = 0;
	private int _originalMenuId = 0;
	private boolean _dirty = true;
	private boolean _published = false;
	private int _childMenuId = 0;
	private List<Category> _categories = null;
	
	public final int getId() {
		return _id;
	}
	public final void setId(int _id) {
		this._id = _id;
	}
	public final String getName() {
		return _name;
	}
	public final void setName(String _name) {
		this._name = _name;
	}
	public final int getCompanyId() {
		return _companyId;
	}
	public final void setCompanyId(int _companyId) {
		this._companyId = _companyId;
	}
	public final boolean isActive() {
		return _active;
	}
	public final void setActive(boolean _active) {
		this._active = _active;
	}
	public final String getDescription() {
		return _description;
	}
	public final void setDescription(String _description) {
		this._description = _description;
	}
	public final String getDownloadLink() {
		return _downloadLink;
	}
	public final void setDownloadLink(String _downloadLink) {
		this._downloadLink = _downloadLink;
	}
	public final int getPublishedId() {
		return _publishedId;
	}
	public final void setPublishedId(int _publishedId) {
		this._publishedId = _publishedId;
	}
	public final int getWorkingMenuId() {
		return _workingMenuId;
	}
	public final void setWorkingMenuId(int _workingMenuId) {
		this._workingMenuId = _workingMenuId;
	}
	public final int getOriginalMenuId() {
		return _originalMenuId;
	}
	public final void setOriginalMenuId(int _originalMenuId) {
		this._originalMenuId = _originalMenuId;
	}
	public final boolean isDirty() {
		return _dirty;
	}
	public final void setDirty(boolean _dirty) {
		this._dirty = _dirty;
	}
	public final boolean isPublished() {
		return _published;
	}
	public final void setPublished(boolean _published) {
		this._published = _published;
	}
	
	public final List<Category> getCategories() { return _categories; }
	public final Category getCategoryAtIndex(int i) { return _categories.get(i); }
	public final void setCategories(List<Category> cats) { _categories = cats; }
	public final void addCategory(Category cat) {
		if (_categories == null) _categories = new ArrayList<Category>();
		_categories.add(cat);
	}
	public final int getChildMenuId() { return _childMenuId; }
	public final void setChildMenuId(int i) { _childMenuId = i; }
	public final String getMenuStatus() {
		return (_published ? "Published" : "Changes not yet published.");
	}
}
