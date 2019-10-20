package com.practice.signin;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("mypage")
@Controller
public class MyPageController {

	@Resource(name = "signInService")
	private SignInService aService;

	@RequestMapping("/myPage")
	public String myPage() {
		return "mypage";
	}

	@RequestMapping("/userViews")
	public String userViews() {

		return "userViews";

	}

}
