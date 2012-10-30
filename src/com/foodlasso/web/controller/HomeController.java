package com.foodlasso.web.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.foodlasso.domain.User;
import com.foodlasso.service.IUserManager;

@Controller
@SessionAttributes("user")
public class HomeController {

    protected final Log logger = LogFactory.getLog(getClass());
    @Autowired
    private IUserManager userManager;
    
    @RequestMapping("/home.htm")
    public ModelAndView handleHome(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Map<String, Object> myModel = new HashMap<String, Object>();
        return new ModelAndView("home", "model", myModel);
    }
    
    @RequestMapping(value = "/login.htm", method = RequestMethod.GET)
    public String handleLogin(Model model)
            throws ServletException, IOException {
    	User user = new User();
        model.addAttribute("user", user);
        return "login";
    }
    
    @RequestMapping(value = "/login.htm", method = RequestMethod.POST)
	public ModelAndView handleLoginAttempt(HttpServletRequest request, HttpServletResponse respponse) 
        throws ServletException, IOException {
    	Map<String, Object> myModel = new HashMap<String, Object>();
    	String username = request.getParameter("username");
    	String password = request.getParameter("password");
    	User user = userManager.authenticateUser(username, password);
    	if (user == null) {
    		return new ModelAndView("login","model", myModel);
    	}
    	myModel.put("user", user);
    	return new ModelAndView("home", "model", myModel);
    }
    
    public void setUserManager(IUserManager um) {
    	userManager = um;
    }
}
