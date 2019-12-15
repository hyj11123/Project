package com.practice.contentmain.pizzas.domino;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("domino_Service")
public class DominoService {
	
	@Resource(name = "dominoDao")
	private DominoDao dDao;
	
	public List<DominoVO> DominoList(DominoVO vo){
		
		List<DominoVO> list= dDao.dominoList(vo);
		
		return list;
	}

}
