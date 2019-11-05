package com.practice.contentmain.chickens;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RequestMapping("bhc")
@Controller
public class BhcController {
		
	@Resource(name = "bhc_Service")
	private BhcService bService;
		
	@RequestMapping("bhcList")
	public String bhcList(Model model) {
		
		List<BhcVO> list = bService.bhcList();
		
		model.addAttribute("bList", list);
		
		return "bhcList";
	}
	
	//BhcPage Start
	@RequestMapping("/bhcPage")
	public String bbqPage() {
		return "bhc";
	}
	
	@RequestMapping("bhcSubmmit")
	public String bhcSubmmit(@RequestParam("name")String name,
							 @RequestParam("price")String price,
							 @RequestParam("spicy")String spicy,
							 @RequestParam("review")String review)
	{
		System.out.println(name);
		System.out.println(price);
		System.out.println(spicy);
		System.out.println(review);
		
		BhcVO vo = new BhcVO();
		vo.setName(name);
		vo.setPrice(price);
		vo.setSpicy(spicy);
		vo.setReview(review);
		
		bService.bhcSubmmit(vo);
		
		
		return "bhcList";
	}
}
