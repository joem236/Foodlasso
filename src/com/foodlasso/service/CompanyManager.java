package com.foodlasso.service;

import java.util.List;

import com.foodlasso.domain.Company;
import com.foodlasso.repository.ICompanyDao;

public class CompanyManager implements ICompanyManager {
	private static final long serialVersionUID = 7240595861042093065L;
	private ICompanyDao companyDao;
	@Override
	public List<Company> getCompanies() {
		return companyDao.getCompanyList();
	}
	
	@Override
	public Company getCompanyById(int id) {
		return companyDao.getCompanyById(id);
	}
	
	@Override
	public List<Company> getPagedCompanies(int currentPage, int pageSize) {
		return companyDao.getPagedCompanies(currentPage, pageSize);
	}
	
	public void setCompanyDao(ICompanyDao d) {
		companyDao = d;
	}

}
