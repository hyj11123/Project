package com.practice.signin;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RequestMapping("mypage")
@Controller
public class MyPageController {
	
	@Resource(name="signInService")
	private SignInService aService;
	
	@RequestMapping("/myPage")
	public String myPage() {
		return "mypage";
	}
	
	@RequestMapping("/userViews")
	public String userViews(@RequestParam("userName")String userName
							,@RequestParam("userId")String userId
							,@RequestParam("userPass")String userPass
							,@RequestParam("userEmail")String userEamil
							,@RequestParam("userAdd")String userAdd
							,@RequestParam("userDetail_Add")String userDetail_Add
							,@RequestParam("userLevel")String userLevel
							,@RequestParam("userZip_Code")String userZip_Code)
	{
		
		MemberVO vo = new MemberVO();
		
		vo.getName();
		vo.getId();
		vo.getPassword();
		vo.getEmail();
		vo.getAdd();
		vo.getDetail_add();
		vo.getLevel();
		vo.getZip_code();
		
		List<MemberVO> list = aService.signin(vo);
		
		
		
		return "userViews";
		
		
		
		
	
}

















}
