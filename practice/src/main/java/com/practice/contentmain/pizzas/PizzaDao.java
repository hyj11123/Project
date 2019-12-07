package com.practice.contentmain.pizzas;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("pizzaDao")
public class PizzaDao {

	@Resource(name = "sqlSessionTemplate")
	private SqlSessionTemplate sqlSessionTemplate;
	
	public List<PizzaVO> pizzaList(String type){
		
		List<PizzaVO> list = sqlSessionTemplate.selectList("pizza.pizzaList", type);
		
		return list;
		
		
	}
	
	public void addPizza(PizzaVO vo) {
		sqlSessionTemplate.insert("pizza.insertPizza", vo);
	}
}
