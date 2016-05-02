package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {

	
	@RequestMapping(path="/index")
	public String index(){
		return "index";
	}
	
	@RequestMapping(path="grid")
	public String demoGrid(){
		
		return "jqGrid";
	}
}
