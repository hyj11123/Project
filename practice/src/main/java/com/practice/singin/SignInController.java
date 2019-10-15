package com.practice.singin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("sign")
@Controller
public class SignInController {
		
	@RequestMapping("/signinPage")
	public String signinPage()
	{
		return "signin";
	}
	
	@RequestMapping("/signupPage")
	public String signupPage()
	{
		return "signupPage";
	}
	
	
	
}
