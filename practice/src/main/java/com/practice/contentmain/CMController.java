package com.practice.contentmain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("cm")
@Controller
public class CMController {

	@RequestMapping("/cmPage")
	public String cmPage() 
	{
		return "cm";
	}
}
