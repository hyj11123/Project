package com.practice.signup;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("signup")
@Controller
public class SignUpController {
		
	@Resource(name = "signUpService")
	private SignUpService sService;
	
	
	@RequestMapping("/signupPage")
	public String signupPage()
	{
		return "signupPage";
	}
	
	@RequestMapping("/userJoin")
	public String userJoin(@RequestParam("Name")String name
						,@RequestParam("Id")String id
						,@RequestParam("Password")String password
						,@RequestParam("Password_Checking")String pass_check
						,@RequestParam("Email")String email
						,@RequestParam("Zip_Code")String zip_code
						,@RequestParam("ADD")String add
						,@RequestParam("DETAIL_ADD")String detail_add)
	{
		
		System.out.println(name);
		System.out.println(id);
		System.out.println(password);
		System.out.println(email);
		System.out.println(zip_code);
		System.out.println(add);
		System.out.println(detail_add);
		
		MemberVO vo = new MemberVO();
		
		
		vo.setName(name);
		vo.setId(id);
		vo.setPassword(password);
		vo.setEmail(email);
		vo.setZip_code(zip_code);
		vo.setAdd(add);
		vo.setAdd(detail_add);
		
		sService.signUp(vo);
		
		return "cm";
	}
	
	
	
}
