package com.practice.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("login")
@Controller
public class LoginController {

	@RequestMapping("/loginPage")
	public String loginPage() {
		return "login";
	}
}
