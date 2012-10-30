package com.foodlasso.repository;

import java.util.List;

import com.foodlasso.domain.Company;

public interface ICompanyDao {
	public List<Company> getCompanyList();
	public List<Company> getPagedCompanies(int currentPage, int pageSize);
	public Company getCompanyById(int id);
	public void saveCompany(Company c);
}
