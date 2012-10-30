package com.foodlasso.service;

import java.io.Serializable;
import java.util.List;

import com.foodlasso.domain.Company;

public interface ICompanyManager extends Serializable {
	public List<Company> getCompanies();
	public List<Company> getPagedCompanies(int currentPage, int pageSize);
	public Company getCompanyById(int id);
}
