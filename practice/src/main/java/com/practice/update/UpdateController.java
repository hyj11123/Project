package com.practice.update;



import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.practice.signin.MemberVO;

@RequestMapping("update")
@Controller
public class UpdateController {
	
	@Resource(name = "updateService")
	private UpdateService cService;
		
	@RequestMapping("/updatePage")
	public String udatePage() 
	{
		return "update";
	}
	

	
	
	@RequestMapping("/updateJoin")
	public String updateJoin(@RequestParam("Name") String name
							,@RequestParam("Password") String password
							,@RequestParam("Email") String email
							,@RequestParam("Zip_Code") String zip_code
							,@RequestParam("ADD") String add
							,@RequestParam("Detail_Add") String detail_add
							,@RequestParam("member_uid")String member_uid
							,HttpSession session)
	{
		System.out.println(name);
		System.out.println(password);
		System.out.println(email);
		System.out.println(zip_code);
		System.out.println(add);
		System.out.println(detail_add);
		System.out.println(member_uid);
		
		
		MemberVO vo= new MemberVO();
		
		
		vo.setMember_uid(member_uid);
		vo.setName(name);
		vo.setPassword(password);
		vo.setEmail(email);
		vo.setZip_code(zip_code);
		vo.setAdd(add);
		vo.setDetail_add(detail_add);
		
		cService.update(vo);
		
		session.removeAttribute("login_email");
		session.removeAttribute("login_name");
		session.removeAttribute("login_password");
		session.removeAttribute("login_zip_code");
		session.removeAttribute("login_add");
		session.removeAttribute("login_detail_add");
		
		session.setAttribute("login_name", name);
		session.setAttribute("login_email", email);
		session.setAttribute("login_password", password);
		session.setAttribute("login_zip_code", zip_code);
		session.setAttribute("login_add", add);
		session.setAttribute("login_detail_add", detail_add);
		
		
		
		
		return "mypage";
		
	}
	
	
	
}
