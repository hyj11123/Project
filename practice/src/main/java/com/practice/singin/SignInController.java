package com.practice.singin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("signin")
@Controller
public class SignInController {
		
	@RequestMapping("/signinPage")
	public String signinPage()
	{
		return "signin";
	}
}
