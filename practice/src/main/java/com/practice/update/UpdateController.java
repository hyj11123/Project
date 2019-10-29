package com.practice.update;

import javax.annotation.Resource;

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
							,@RequestParam("Id") String id
							,@RequestParam("Password") String password
							,@RequestParam("Email") String email
							,@RequestParam("Zip_Code") String zip_code
							,@RequestParam("ADD") String add
							,@RequestParam("Detail_Add") String detail_add)
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(password);
		System.out.println(email);
		System.out.println(zip_code);
		System.out.println(add);
		System.out.println(detail_add);
		
		MemberVO vo= new MemberVO();
		
		vo.setName(name);
		vo.setId(id);
		vo.setPassword(password);
		vo.setEmail(email);
		vo.setZip_code(zip_code);
		vo.setAdd(add);
		vo.setDetail_add(detail_add);
		
		cService.update(vo);
		
		return "update";
		
	}
	
	
	
}
