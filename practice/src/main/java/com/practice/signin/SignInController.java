package com.practice.signin;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

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
	public String userCheck(@RequestParam("userId")String id,
							@RequestParam("userPass")String password
							,HttpSession session) {
		
		MemberVO vo = new MemberVO();
		vo.setId(id);
		vo.setPassword(password);
		
		System.out.println(id);
		System.out.println(password);
		
		List<MemberVO> list = aService.signin(vo);
		
		System.out.println(list.get(0).getMember_uid());
		System.out.println(list.get(0).getMember_uid());
		System.out.println(list.get(0).getMember_uid());
		System.out.println(list.get(0).getMember_uid());
		
		if(list.size() > 0) {
			// login
			session.setAttribute("login_member_uid", list.get(0).getMember_uid());
			session.setAttribute("login_id", list.get(0).getId());
			session.setAttribute("login_email", list.get(0).getEmail());
			session.setAttribute("login_name", list.get(0).getName());
			session.setAttribute("login_password", list.get(0).getPassword());
			session.setAttribute("login_zip_code", list.get(0).getZip_code());
			session.setAttribute("login_add", list.get(0).getAdd());
			session.setAttribute("login_detail_add", list.get(0).getDetail_add());
			return "cm";
		} else {
			// failed login
			System.out.println("Login failed");
			System.out.println("Login failed");
			System.out.println("Login failed");
			
			return "cm";
		}
	}
	
	
	@RequestMapping("/logOut")
	public String logOut(HttpSession session) {
		session.removeAttribute("login_member_uid");
		session.removeAttribute("login_id");
		session.removeAttribute("login_email");
		session.removeAttribute("login_name");
		session.removeAttribute("login_password");
		session.removeAttribute("login_zip_code");
		session.removeAttribute("login_add");
		session.removeAttribute("login_detail_add");
		
		return "cm";
	}
	
	
}
