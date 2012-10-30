package com.foodlasso.web.controller;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.web.servlet.ModelAndView;

import com.foodlasso.domain.Product;
import com.foodlasso.repository.InMemoryProductDao;
import com.foodlasso.service.SimpleProductManager;
import com.foodlasso.web.controller.InventoryController;

import junit.framework.TestCase;

public class InventoryControllerTest extends TestCase {

    public void testHandleRequestView() throws Exception{		
        InventoryController controller = new InventoryController();
        SimpleProductManager spm = new SimpleProductManager();
        spm.setProductDao(new InMemoryProductDao(new ArrayList<Product>()));
        controller.setProductManager(spm);
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        Map modelMap = (Map) modelAndView.getModel().get("model");
        String nowValue = (String) modelMap.get("now");
        assertNotNull(nowValue);
    }
}