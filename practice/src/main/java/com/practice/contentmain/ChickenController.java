package com.practice.contentmain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("chicken")
@Controller
public class ChickenController {

	
	
	@RequestMapping("/chickenPage")
	public String chickenPage() {
		return "chicken";
	}
	
}
