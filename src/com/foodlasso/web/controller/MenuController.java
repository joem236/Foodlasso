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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.foodlasso.domain.Menu;
import com.foodlasso.service.IMenuManager;
@Controller
public class MenuController {

    protected final Log logger = LogFactory.getLog(getClass());
    @Autowired
    private IMenuManager manager;
    
    @RequestMapping("/company/{companyId}/menus")
    @ResponseBody
    public List<Menu> handleRESTMenuList(@PathVariable int companyId) {
    	return manager.getMenus(companyId);
    }
    
    @RequestMapping("/company/{companyId}/menu/{menuId}")
    @ResponseBody
    public Menu handleRESTMenuById(@PathVariable int companyId, @PathVariable int menuId) {
    	return manager.getMenuById(companyId, menuId);
    }
    
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Map<String, Object> myModel = new HashMap<String, Object>();
        //myModel.put("menus", this.manager.getMenus());

        return new ModelAndView("menuList", "model", myModel);
    }
    
    public void setMenuManager(IMenuManager menuManager) {
        manager = menuManager;
    }
}
