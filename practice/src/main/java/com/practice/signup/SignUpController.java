package com.practice.signup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("signup")
@Controller
public class SignUpController {
		
	
	
	@RequestMapping("/signupPage")
	public String signupPage()
	{
		return "signupPage";
	}
	
	@RequestMapping("/userJoin")
	public void userJoin(@RequestParam("Id")String id
						,@RequestParam("Password")String password
						,@RequestParam("Password_Checking")String pass_check
						,@RequestParam("Email")String email
						,@RequestParam("Zip_Code")String zip_Code
						,@RequestParam("ADD")String add
						,@RequestParam("DETAIL_ADD")String detail_add)
	{
		System.out.println(id);
		System.out.println(password);
		System.out.println(email);
		System.out.println(zip_Code);
		System.out.println(add);
		System.out.println(detail_add);
	}
	
	
	
}
