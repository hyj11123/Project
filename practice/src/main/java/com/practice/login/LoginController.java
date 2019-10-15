package com.practice.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("login")
@Controller
public class LoginController {

	@RequestMapping("/loginPage")
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping("/userCheck")
	public void userCheck(@RequestParam("userId")String userId,@RequestParam("userPass")String userPass) {
		System.out.println(userId);
		System.out.println(userPass);
	}
}
