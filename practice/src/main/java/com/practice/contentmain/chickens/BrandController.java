package com.practice.contentmain.chickens;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("brand")
@Controller
public class BrandController {

	@Resource(name ="brand_Service")
	private BrandService bService;
	
	
	@RequestMapping("/brandPage")
	public String brandPage(Model model) {
		String type = "CHICKEN";
		
		List<BrandVO> list = bService.brandList(type);
		
		model.addAttribute("brandList", list);
		return "brand";
	}
	
	
	
}
