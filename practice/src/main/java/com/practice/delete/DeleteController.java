package com.practice.delete;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.practice.signin.MemberVO;


@RequestMapping("delete")
@Controller public class DeleteController {
	
	@Resource(name="deleteService") 
	private DeleteService xService;
	
	@RequestMapping("/deletePage") 
	public String deletePage()
	{
		return "deletePage";
	}

	@RequestMapping("/deleteJoin")
	public String deleteJoin(@RequestParam("member_uid")String member_uid, HttpSession session)
	{
		MemberVO vo = new MemberVO();
		vo.setMember_uid(member_uid);
		
		xService.delete(vo);
		
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