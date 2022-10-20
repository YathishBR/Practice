package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("this is home URL");
		return "index";
		//Returns index view
		
	}
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("this is about Controller");
		return "about";
		//Returns 
		
	}

}
