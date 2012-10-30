package com.foodlasso.web.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.foodlasso.domain.Company;
import com.foodlasso.service.ICompanyManager;

@Controller
public class CompanyController {

    protected final Log logger = LogFactory.getLog(getClass());
    @Autowired
    private ICompanyManager manager;
    
    
    @RequestMapping(value = "/companyList.htm", method = RequestMethod.GET)
    public ModelAndView handleHttpCompanyList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("companies", this.manager.getCompanies());

        return new ModelAndView("results", "model", myModel);
    }
    
    @RequestMapping(value = "/companyList.htm", method = RequestMethod.POST)
    public ModelAndView handleHttpCompanySearch(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    	Map<String, Object> myModel = new HashMap<String, Object>();
    	String pageS = request.getParameter("current_page");
    	String sizeS = request.getParameter("page_size");
    	int page = 0;
    	int size = 20;
    	try {
    		if (pageS.length() > 0) page = Integer.parseInt(pageS);
    		if (sizeS.length() > 0) size = Integer.parseInt(sizeS);
    	} catch (Exception ex) {
    		// Do nothing for now
    	}
        myModel.put("companies", this.manager.getPagedCompanies(page, size));

        return new ModelAndView("results", "model", myModel);
    }
    
    @RequestMapping("/company/{id}/detail.htm")
    public ModelAndView handleHttpCompanyDetail(@PathVariable int id) {
    	Company company = manager.getCompanyById(id);
    	return new ModelAndView("detail", "model", company);
    }
    @RequestMapping("/companies")
    @ResponseBody
    public List<Company> handleRESTCompanies() {
    	return handleRESTCompanies(0);
    }
    
    @RequestMapping("/companies/{page}")
    @ResponseBody
    public List<Company> handleRESTCompanies(@PathVariable int page) {
    	return manager.getPagedCompanies(page, 50);
    }
    
    @RequestMapping("/company/{id}/detail")
    @ResponseBody
    public Company handleRESTCompanyDetail(@PathVariable int id) {
    	return manager.getCompanyById(id);
    }
    
    public void setCompanyManager(ICompanyManager menuManager) {
        manager = menuManager;
    }
}

