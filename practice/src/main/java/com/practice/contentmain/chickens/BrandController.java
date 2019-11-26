package com.practice.contentmain.chickens;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RequestMapping("brand")
@Controller
public class BrandController {
	
	String nullImg = "http://blogfiles.naver.net/MjAxODExMjhfMjc2/MDAxNTQzNDA3NDIzNjk4.4mfvTo5u2uRwNOVDa6MkR3U2VPVScnx032ONVSSqKHUg.-NCmObwXHxF0cEeGdvxUMbSI0aj-Nnm8RwIGRPWlRiQg.JPEG.scenar25/99E7A94F5BFE61D512BAE6.jpeg";

	@Resource(name ="brand_Service")
	private BrandService bService;
	
	
	@RequestMapping("/brandPage")
	public String brandPage(Model model) {
		String type = "CHICKEN";
		
		List<BrandVO> list = bService.brandList(type);
		
		model.addAttribute("brandList", list);
		return "brand";
	}


	
	
	@RequestMapping("brandSubmit")
	public String brandSubmit() 
	{
			
			
			return "insertBrand";

	}
	
	@RequestMapping("addBrand")
	public String addBrand(@RequestParam("name")String name,
						   @RequestParam("type")String type,
						   @RequestParam(value="path", defaultValue="http://blogfiles.naver.net/MjAxODExMjhfMjc2/MDAxNTQzNDA3NDIzNjk4.4mfvTo5u2uRwNOVDa6MkR3U2VPVScnx032ONVSSqKHUg.-NCmObwXHxF0cEeGdvxUMbSI0aj-Nnm8RwIGRPWlRiQg.JPEG.scenar25/99E7A94F5BFE61D512BAE6.jpeg")String path) 
	{
			
			BrandVO vo = new BrandVO();
			vo.setName(name);
			vo.setType(type);
			vo.setPath(path);
		
			bService.insertBrand(vo);
			
			return "redirect:brandPage";

	}
	
	
	@RequestMapping("/editBrand")
	public String editBrand(@RequestParam("uid")String brand_uid,
							Model model) 
	{
			List<BrandVO> list = bService.editBrand(brand_uid);
			
			model.addAttribute("elist", list);
			
			return "editBrand";
	}
	
	@RequestMapping("/updateBrand")
	public String updateBrand(@RequestParam("name")String name,
							  @RequestParam("type")String type,
							  @RequestParam("path")String path,
							  @RequestParam("brand_uid")String brand_uid)
	{
		
		

			BrandVO vo = new BrandVO();
			vo.setName(name);
			vo.setType(type);
			vo.setPath(path);
			vo.setBrand_uid(brand_uid);
			
			bService.updateBrand(vo);
			return "redirect:brandPage";
	}
	
	@RequestMapping("deleteBrand")
	public String deleteBrand() 
	{
			
			return "brand";
	}
	
	}
	
