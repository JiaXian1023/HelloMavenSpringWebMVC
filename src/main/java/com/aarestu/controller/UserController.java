package com.aarestu.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
 
	

@Controller
@RequestMapping("/User")
public class UserController {

    public static final Logger LOGGER = Logger.getLogger(UserController.class);
   
    
    @RequestMapping(value="index",method=RequestMethod.GET)
	public String index(ModelMap model){
		model.addAttribute("message", "User-hihi");
		return "hello";
	}
	@RequestMapping(value="index2",method=RequestMethod.GET)
	public String index2(Model model) throws Exception{
	
		 //String result = testService.testQuery();
         
		 model.addAttribute("message", "1");
		return "hello";
	}
}
 
