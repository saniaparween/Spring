package com.MVC.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	 @RequestMapping(value="/hello")
	 public ModelAndView helloWorld() {  
		  
	        String message = "WELCOME";  
	        return new ModelAndView("hello", "message", message);  
	    }  
	

}
