package com.practice.contentmain.pizzas.domino;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("domino")
@Controller
public class DominoController {
	
	@Resource(name = "domino_Service")
	private	DominoService dservice;
	
	@RequestMapping("/dominoPage")
	public String DominoPage(DominoVO vo
							,Model model) {
		List<DominoVO> list = dservice.DominoList(vo);
		
		model.addAttribute("dList", list);
		return "domino";
	}
}
