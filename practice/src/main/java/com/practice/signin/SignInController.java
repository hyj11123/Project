package com.practice.signin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("signin")
@Controller
public class SignInController {

	@RequestMapping("/signinPage")
	public String signinPage()
	{
		return "signinPage";
	}
	
	
	
	@RequestMapping("/userCheck")
	public void userCheck(@RequestParam("userId")String userId,@RequestParam("userPass")String userPass) {
		System.out.println(userId);
		System.out.println(userPass);
	}
}
