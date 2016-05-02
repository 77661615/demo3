package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class ProductController {

	@RequestMapping(path="/pcount")
	public int findProductCount(){
		return 5;
	}
	
	@RequestMapping(path="/product/{cat}")
	public String findCatProductCount(@PathVariable String cat){
		
		return cat+" count = 6";
	}
	
	
	
	
}
