package com.practice.board;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("board_Dao")
public class Board_Dao {

	@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate sqlSessionTemplate;
	
	//boardList
	public List<BoardVO> boardList(){
		
		List<BoardVO> list = sqlSessionTemplate.selectList("board.boardList");
		
		return list;
		
	}
	
	// wirteBoard
	public void wirteBoard(BoardVO vo) {
		
		sqlSessionTemplate.insert("board.boardWrite", vo);
		
			
	}
	
	//input
	
	public List<BoardVO> getBoardById(String uid){
		
		List<BoardVO> list= sqlSessionTemplate.selectList("board.getBoardById", uid);
		
		System.out.println("Dao");
		System.out.println("Dao");
		System.out.println("Dao");
		System.out.println("Dao");
		System.out.println("Dao");
		
		
		
		return list;
	}
	
	
	// updateBoard
	
	public void updateBoard(BoardVO vo) {
		System.out.println("Dao");
		System.out.println("Dao");
		System.out.println("Dao");
		System.out.println("Dao");
		System.out.println("Dao");
		
		sqlSessionTemplate.update("board.boardUpdate",vo);
	}
	
	// deleteBoard
	
	public void deleteBoard(BoardVO vo) {
		System.out.println("Dao");
		System.out.println("Dao");
		System.out.println("Dao");
		System.out.println("Dao");
		System.out.println("Dao");
		
		sqlSessionTemplate.delete("board.boardDelete", vo);
		
			
	}
	
}
