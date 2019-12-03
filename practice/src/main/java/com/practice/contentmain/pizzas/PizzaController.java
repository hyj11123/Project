package com.practice.contentmain.pizzas;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("pizza")
@Controller

public class PizzaController {

	@Resource(name = "pizza_Service")
	private PizzaService pService;
	
	@RequestMapping("/pizzaPage")
	public String pizzaPage(Model model) {
		String type = "PIZZA";
		
		List<PizzaVO> list = pService.pizzaList(type);
		
		model.addAttribute("pizzaList", list);
		
		return "pizzaPage";
	}

}
