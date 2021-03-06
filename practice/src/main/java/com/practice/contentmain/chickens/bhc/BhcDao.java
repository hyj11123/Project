package com.practice.contentmain.chickens.bhc;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.practice.board.BoardVO;

@Repository("bhcDao")
public class BhcDao {

	@Resource(name = "sqlSessionTemplate")
	private SqlSessionTemplate sqlSessionTemplate;

	// bhcList
	public List<BhcVO> bhcList() {

		List<BhcVO> list = sqlSessionTemplate.selectList("bhc.bhcList");

		return list;

	}
	
	
	public List<BhcVO> bhcList2(BhcVO vo){
		
		List<BhcVO> list = sqlSessionTemplate.selectList("bhc.bhcList2",vo);
		System.out.println("DAO");
		System.out.println("DAO");
		System.out.println("DAO");
		System.out.println("DAO");
		System.out.println("DAO");
		System.out.println("DAO");
		System.out.println("DAO");
		
		return list;
	}

	// bhcSubmit
	public void bhcSubmit(BhcVO vo) {

		sqlSessionTemplate.insert("bhc.bhcSubmit", vo);
	}

	// bhcUpdate
	public void bhcUpadte(BhcVO vo) {
		sqlSessionTemplate.update("bhc.bhcupdate", vo);
		System.out.println("DAO");
		System.out.println("DAO");
		System.out.println("DAO");
		System.out.println("DAO");
		
	}
	// bhcDelete
	
	public void bhcdelete(BhcVO vo) {
		System.out.println("Dao");
		System.out.println("Dao");
		System.out.println("Dao");
		System.out.println("Dao");
		System.out.println("Dao");
		System.out.println("Dao");
		
		sqlSessionTemplate.delete("bhc.bhcdelete", vo);
	}
}
