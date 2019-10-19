package com.practice.signin;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("signin")
@Controller
public class SignInController {

	@Resource(name="signInService")
	private SignInService aService;
	
	@RequestMapping("/signinPage")
	public String signinPage()
	{
		return "signinPage";
	}
	
	
	
	@RequestMapping("/userCheck")
	public String userCheck(@RequestParam("userId")String userId,@RequestParam("userPass")String userPass) {
		System.out.println(userId);
		System.out.println(userPass);
		
		MemberVO vo = new MemberVO();
		
		vo.setId(userId);
		vo.setPassword(userPass);
		
		List<MemberVO> list = aService.signin(vo);
		
		if(list.size() > 0) {
			// login
			System.out.println("Login!!!!");
			System.out.println("Login!!!!");
			System.out.println("Login!!!!");
			
			return "cm";
		} else {
			// failed login
			System.out.println("Login failed");
			System.out.println("Login failed");
			System.out.println("Login failed");
			
			return "cm";
		}
		
		

	}
}
