package com.practice.signin;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("my")
@Controller
public class MyPageController {

	@Resource(name = "signInService")
	private SignInService aService;

	@RequestMapping("/myPage")
	public String myPage(HttpSession session) {
		
		
		return "mypage";
	}

	@RequestMapping("/userViews")
	public String userViews() {

		return "userViews";

	}

}
