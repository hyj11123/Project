package com.practice.contentmain.pizzas.domino;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("dominoDao")
public class DominoDao {
	
	@Resource(name = "sqlSessionTemplate")
	private SqlSessionTemplate sqlSessionTemplate;
	
	public List<DominoVO> dominoList(DominoVO vo){
		
		List<DominoVO> list = sqlSessionTemplate.selectList("pizza.dominoList", vo);
		
		return list;
		
	}
}
