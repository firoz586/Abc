package com.example.demo;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class FirstController {
	@RequestMapping("/")
	public String welcome(Map<String, Object> model)
	{
		return "index";
	}
    @RequestMapping(value = "/aboutpage")
	public String about() 
    {
		return "index";
	}
	
    
    
    
    //
}
