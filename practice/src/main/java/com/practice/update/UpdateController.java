package com.practice.update;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("update")
@Controller
public class UpdateController {
	
	@Resource(name = "updateService")
	private UpdateService cService;
		
	@RequestMapping("/updatePage")
	public String udatePage() 
	{
		return "update";
	}
	
	
	
	
}
