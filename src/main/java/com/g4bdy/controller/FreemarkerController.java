package com.g4bdy.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.g4bdy.pojo.Resource;

@Controller
@RequestMapping("/ftl")
public class FreemarkerController {
	
		@Autowired
	    private Resource res;
	    
	    @RequestMapping("/index")
		public String index(ModelMap map){
	    	map.addAttribute("resource", res);
			return "freemarker/index";
		}
	    
	    @RequestMapping("/index2")
		public String index2(ModelMap map){
	    	map.addAttribute("resource", res);
			return "freemarker/index2";
		}
	    
	    @RequestMapping("/center")
		public String center(){
			return "freemarker/center/center";
		}
	    
}
