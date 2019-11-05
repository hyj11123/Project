package com.practice.signup;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.practice.signin.MemberVO;

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
	public String userJoin(@RequestParam("name")String name
						  ,@RequestParam("id")String id
						  ,@RequestParam("password")String password
						  ,@RequestParam("password_checking")String pass_check
						  ,@RequestParam("email")String email
						  ,@RequestParam("zip_Code")String zip_code
						  ,@RequestParam("add")String add
						  ,@RequestParam("detail_add")String detail_add)
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
		vo.setDetail_add(detail_add);
		
		sService.signUp(vo);
		
		return "cm";
	}
	
	
	
}
