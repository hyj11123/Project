package com.practice.contentmain.pizzas;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("pizza_Service")
public class PizzaService {

		@Resource(name = "pizzaDao")
		private PizzaDao pDao;
		
	public List<PizzaVO> pizzaList(String type){
		
		List<PizzaVO> list = pDao.pizzaList(type);
		
		return list;
	}
	
	public void insertPizza(PizzaVO vo) {
		pDao.insertPizza(vo);
	}
		
}
