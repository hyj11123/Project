package com.practice.contentmain.chickens.bhc;

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
		
	
	//BhcPage Start
	@RequestMapping("/bhcPage")
	public String bbqPage(Model model) {
		List<BhcVO> list = bService.bhcList();
		
		model.addAttribute("bList", list);
		return "bhc";
	}
	
	//BhcPage Start
	@RequestMapping("/insertMenu")
	public String insertMenu() {
		return "insertMenu";
	}
	
	
	@RequestMapping("bhcSubmit")
	public String bhcSubmit( @RequestParam("name")String name,
							 @RequestParam("price")String price,
							 @RequestParam("spicy")String spicy,
							 @RequestParam("review")String review,
							 @RequestParam("brand_uid")String brand_uid)
	{
		System.out.println(name);
		System.out.println(price);
		System.out.println(spicy);
		System.out.println(review);
		System.out.println(brand_uid);
		
		BhcVO vo = new BhcVO();
		vo.setName(name);
		vo.setPrice(price);
		vo.setSpicy(spicy);
		vo.setReview(review);
		vo.setBrand_uid(brand_uid);
		
		bService.bhcSubmit(vo);
		
		
		return "bhc";
		
		
	}
	
	@RequestMapping("bhcRead")
	public String bhcRead() {
		
		
		
		return "bhcRead";
	}
	
	
	
	
	
	
	
	// update
	@RequestMapping("updatebhc")
	public String updatebhc() {
		return "updatebhc";
	}
	
	
	@RequestMapping("bhcUpdate")
	public String bhcUpdate(@RequestParam("name") String name,
							@RequestParam("price")String price,
							@RequestParam("spicy")String spicy,
							@RequestParam("review")String review,
							@RequestParam("brand_uid")String brand_uid)
	{
		System.out.println(name);
		System.out.println(price);
		System.out.println(spicy);
		System.out.println(review);
		System.out.println(brand_uid);
		
		BhcVO vo = new BhcVO();
		
		vo.setBrand_uid(brand_uid);
		vo.setName(name);
		vo.setPrice(price);
		vo.setReview(review);
		vo.setSpicy(spicy);
		
		bService.bhcUpdate(vo);
		
		
		return "bhc";
	}
	
	// delete
	
	@RequestMapping("bhcDelete")
	public String bhcDelete(@RequestParam("brand_uid")String brand_uid)
	{
		BhcVO vo = new BhcVO();
		
		vo.setBrand_uid(brand_uid);
		
		bService.delete(vo);
		
		return "bhc";
		
	}
	
}
